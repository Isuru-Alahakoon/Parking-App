package com.leolithy.pakingapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class FindParkingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_parking)

        val bottomNav = findViewById<View>(R.id.bottomNavFind)
        bottomNav.findViewById<View>(R.id.navFind).setOnClickListener { /* already here */ }
        bottomNav.findViewById<View>(R.id.navBookings).setOnClickListener {
            startActivity(Intent(this, MyBookingsActivity::class.java))
            finish()
        }
        bottomNav.findViewById<View>(R.id.navProfile).setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
            finish()
        }
    }
}
