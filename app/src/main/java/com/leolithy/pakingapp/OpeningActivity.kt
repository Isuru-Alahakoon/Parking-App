package com.leolithy.pakingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OpeningActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opening)

        findViewById<Button>(R.id.btnGetStarted).setOnClickListener {
            startActivity(Intent(this, OnboardActivity::class.java))
            finish()
        }
    }
}
