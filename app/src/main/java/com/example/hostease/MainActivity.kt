package com.example.hostease

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val residentButton = findViewById<Button>(R.id.residentButton)
        val wardenButton = findViewById<Button>(R.id.wardenButton)

        residentButton.setOnClickListener {
            val intent = Intent(this, ResidentDetailsActivity::class.java)
            startActivity(intent)
        }

        wardenButton.setOnClickListener {
            val intent = Intent(this, WardenLoginActivity::class.java)
            startActivity(intent)
        }
    }
}

