package com.example.tippy2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClick: ImageButton = findViewById(R.id.settingsBtn) // Settings imagebutton opens settings activity
        buttonClick.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }

        val accntButtonClick: ImageButton = findViewById(R.id.accountBtn) // Account imagebutton opens account activity
        accntButtonClick.setOnClickListener {
            val intent = Intent(this, AccountActivity::class.java)
            startActivity(intent)
        }

        val infoButtonClick: ImageButton = findViewById(R.id.infoBtn) // Info imagebutton opens Info activity
        infoButtonClick.setOnClickListener {
            val intent = Intent(this, InfoActivity::class.java)
            startActivity(intent)
        }
    }
}
