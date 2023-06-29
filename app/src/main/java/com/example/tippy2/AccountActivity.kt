package com.example.tippy2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class AccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        val buttonClick: ImageButton = findViewById(R.id.accntCloseButton) // Close button functionality
        buttonClick.setOnClickListener {
            finish()
        }
    }
}