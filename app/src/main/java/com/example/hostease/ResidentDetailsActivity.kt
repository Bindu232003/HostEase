package com.example.hostease

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ResidentDetailsActivity : AppCompatActivity() {

    private lateinit var sharedPref: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resident_details)

        sharedPref = getSharedPreferences("ResidentData", MODE_PRIVATE)

        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val courseEditText = findViewById<EditText>(R.id.courseEditText)
        val roomEditText = findViewById<EditText>(R.id.roomEditText)
        val blockEditText = findViewById<EditText>(R.id.blockEditText)
        val saveButton = findViewById<Button>(R.id.saveButton)

        saveButton.setOnClickListener {
            val name = nameEditText.text.toString().trim()
            val course = courseEditText.text.toString().trim()
            val room = roomEditText.text.toString().trim()
            val block = blockEditText.text.toString().trim()

            if (name.isEmpty() || course.isEmpty() || room.isEmpty() || block.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            } else {
                val editor = sharedPref.edit()
                editor.putString("name", name)
                editor.putString("course", course)
                editor.putString("room", room)
                editor.putString("block", block)
                editor.apply()

                Toast.makeText(this, "Details saved successfully!", Toast.LENGTH_SHORT).show()

                // Start ComplaintActivity after saving details
                val intent = Intent(this, ComplaintActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
