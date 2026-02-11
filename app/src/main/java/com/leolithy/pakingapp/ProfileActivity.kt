package com.leolithy.pakingapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        findViewById<Button>(R.id.btnLogout).setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
        }

        val bottomNav = findViewById<View>(R.id.bottomNavProfile)
        bottomNav.findViewById<View>(R.id.navFind).setOnClickListener {
            startActivity(Intent(this, FindParkingActivity::class.java))
            finish()
        }
        bottomNav.findViewById<View>(R.id.navBookings).setOnClickListener {
            startActivity(Intent(this, MyBookingsActivity::class.java))
            finish()
        }
        bottomNav.findViewById<View>(R.id.navProfile).setOnClickListener { /* already here */ }
    }
}
