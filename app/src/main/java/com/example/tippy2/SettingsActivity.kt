package com.example.tippy2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton


class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val buttonClick: ImageButton = findViewById(R.id.closeBtn) // Close button functionality
        buttonClick.setOnClickListener {
            finish()
        }
    }
}