package com.example.picklestatspro

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inflate activity_splash instead of activity_main
        setContentView(R.layout.activity_splash)

        // Find the start container inside activity_splash.xml
        val btnStartContainer = findViewById<View>(R.id.btnStartContainer)

        // Set click listener to navigate to RoleSelectionActivity
        btnStartContainer?.setOnClickListener {
            val intent = Intent(this, RoleSelectionActivity::class.java)
            startActivity(intent)
        }
    }
}