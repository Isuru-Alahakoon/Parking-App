package com.leolithy.pakingapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        findViewById<Button>(R.id.btnFindParking).setOnClickListener {
            startActivity(Intent(this, FindParkingActivity::class.java))
            finish()
        }
        findViewById<TextView>(R.id.linkViewBookings).setOnClickListener {
            startActivity(Intent(this, MyBookingsActivity::class.java))
            finish()
        }

        findViewById<View>(R.id.navFind).setOnClickListener { /* already on dashboard */ }
        findViewById<View>(R.id.navBookings).setOnClickListener {
            startActivity(Intent(this, MyBookingsActivity::class.java))
            finish()
        }
        findViewById<View>(R.id.navProfile).setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
            finish()
        }
    }
}
