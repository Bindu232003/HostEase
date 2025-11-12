package com.example.hostease

import android.content.Context
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class WardenComplaintsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_warden_complaints)

        val complaintsLayout = findViewById<LinearLayout>(R.id.complaintsLayout)
        val sharedPref = getSharedPreferences("ResidentData", Context.MODE_PRIVATE)
        val complaintsPref = getSharedPreferences("ComplaintsData", Context.MODE_PRIVATE)

        val name = sharedPref.getString("name", "Unknown")
        val course = sharedPref.getString("course", "")
        val room = sharedPref.getString("room", "")
        val block = sharedPref.getString("block", "")
        val complaint = complaintsPref.getString("complaint", "No complaint submitted")

        // Clear layout
        complaintsLayout.removeAllViews()

        val complaintView = LinearLayout(this)
        complaintView.orientation = LinearLayout.VERTICAL
        complaintView.setPadding(24, 24, 24, 24)

        val details = TextView(this)
        details.text = """
            👤 Name: $name
            🎓 Course: $course
            🏠 Room: $room
            🏢 Block: $block
            
            📝 Complaint: $complaint
        """.trimIndent()
        details.textSize = 18f

        val statusSpinner = Spinner(this)
        val statusOptions = arrayOf("Pending", "Ongoing", "Resolved")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, statusOptions)
        statusSpinner.adapter = adapter

        // Load saved status if available
        val savedStatus = complaintsPref.getString("status", "Pending")
        val position = statusOptions.indexOf(savedStatus)
        if (position >= 0) statusSpinner.setSelection(position)

        val saveStatusButton = Button(this)
        saveStatusButton.text = "Update Status"

        saveStatusButton.setOnClickListener {
            val newStatus = statusSpinner.selectedItem.toString()
            complaintsPref.edit().putString("status", newStatus).apply()
            Toast.makeText(this, "Complaint status updated: $newStatus", Toast.LENGTH_SHORT).show()
        }

        complaintView.addView(details)
        complaintView.addView(statusSpinner)
        complaintView.addView(saveStatusButton)

        complaintsLayout.addView(complaintView)
    }
}
