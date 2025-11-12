package com.example.hostease

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class ComplaintActivity : AppCompatActivity() {

    private lateinit var sharedPref: SharedPreferences
    private lateinit var complaintsPref: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complaint)

        sharedPref = getSharedPreferences("ResidentData", MODE_PRIVATE)
        complaintsPref = getSharedPreferences("ComplaintsData", MODE_PRIVATE)

        val name = sharedPref.getString("name", "Resident")
        val course = sharedPref.getString("course", "N/A")
        val room = sharedPref.getString("room", "N/A")
        val block = sharedPref.getString("block", "N/A")

        val issueTypeSpinner = findViewById<Spinner>(R.id.issueTypeSpinner)
        val complaintTitle = findViewById<EditText>(R.id.complaintTitle)
        val complaintDescription = findViewById<EditText>(R.id.complaintDescription)
        val submitButton = findViewById<Button>(R.id.submitComplaintButton)

        // Spinner options
        val issueTypes = arrayOf(
            "Select Issue Type",
            "Plumbing",
            "Electrician",
            "Carpenter",
            "Food",
            "Cleaning",
            "Internet / WiFi",
            "Other"
        )

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, issueTypes)
        issueTypeSpinner.adapter = adapter

        submitButton.setOnClickListener {
            val issueType = issueTypeSpinner.selectedItem.toString()
            val title = complaintTitle.text.toString().trim()
            val description = complaintDescription.text.toString().trim()

            if (issueType == "Select Issue Type" || title.isEmpty() || description.isEmpty()) {
                Toast.makeText(this, "Please fill all fields correctly", Toast.LENGTH_SHORT).show()
            } else {
                // ✅ Format and save complaint details
                val newComplaint = """
                    👤 Name: $name
                    🎓 Course/Work: $course
                    🏠 Room: $room | Block: $block
                    🛠 Issue Type: $issueType
                    📝 Title: $title
                    📄 Description: $description
                    📌 Status: Pending
                    -------------------------------
                """.trimIndent()

                // Get existing complaints
                val existingComplaints = complaintsPref.getString("complaintsList", "") ?: ""
                val updatedComplaints =
                    if (existingComplaints.isEmpty()) newComplaint else "$existingComplaints\n\n$newComplaint"

                // Save updated list
                val editor = complaintsPref.edit()
                editor.putString("complaintsList", updatedComplaints)
                editor.apply()

                Toast.makeText(
                    this,
                    "Complaint submitted successfully!",
                    Toast.LENGTH_SHORT
                ).show()

                // Clear fields
                complaintTitle.text.clear()
                complaintDescription.text.clear()
                issueTypeSpinner.setSelection(0)
            }
        }
    }
}
