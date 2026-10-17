package com.example.picklestatspro

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.card.MaterialCardView

class RoleSelectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardPlayer = findViewById<MaterialCardView>(R.id.cardPlayer)
        val cardCoach = findViewById<MaterialCardView>(R.id.cardCoach)

        // Handle Player Selection
        cardPlayer.setOnClickListener {
            Toast.makeText(this, "Player selected", Toast.LENGTH_SHORT).show()
            // TODO: Navigate to Player Dashboard / Onboarding
        }

        // Handle Coach Selection
        cardCoach.setOnClickListener {
            Toast.makeText(this, "Coach selected", Toast.LENGTH_SHORT).show()
            // TODO: Navigate to Coach Dashboard / Onboarding
        }
    }
}