package com.leolithy.pakingapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MyBookingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_bookings)

        findViewById<Button>(R.id.btnFindParking).setOnClickListener {
            startActivity(Intent(this, FindParkingActivity::class.java))
            finish()
        }

        val bottomNav = findViewById<View>(R.id.bottomNavBookings)
        bottomNav.findViewById<View>(R.id.navFind).setOnClickListener {
            startActivity(Intent(this, FindParkingActivity::class.java))
            finish()
        }
        bottomNav.findViewById<View>(R.id.navBookings).setOnClickListener { /* already here */ }
        bottomNav.findViewById<View>(R.id.navProfile).setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
            finish()
        }
    }
}
