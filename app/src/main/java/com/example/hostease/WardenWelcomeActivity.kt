package com.example.hostease

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class WardenWelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_warden_welcome)

        val viewComplaintsButton = findViewById<Button>(R.id.viewComplaintsButton)

        viewComplaintsButton.setOnClickListener {
            val intent = Intent(this, WardenComplaintsActivity::class.java)
            startActivity(intent)
        }
    }
}
