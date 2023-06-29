package com.example.tippy2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val buttonClick: ImageButton = findViewById(R.id.infoCloseButton) // Close button functionality
        buttonClick.setOnClickListener {
            finish()
        }
    }
}