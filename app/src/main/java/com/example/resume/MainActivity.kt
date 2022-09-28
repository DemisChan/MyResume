package com.example.resume

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val workHistory = findViewById<Button>(R.id.workhistory)
        workHistory.setOnClickListener {
            println("Hit the button")
            val moveToHistory = Intent(applicationContext, WorkHistoryActivity::class.java)
            startActivity(moveToHistory)
        }
        val call = findViewById<Button>(R.id.callbutton)
        call.setOnClickListener {
            println("Call Demis")
            val phoneUri = Uri.parse("tel:07415563374")
            val callIntent = Intent(Intent.ACTION_DIAL, phoneUri)
            startActivity(callIntent)
        }
        val email = findViewById<Button>(R.id.emailbutton)
        email.setOnClickListener {
            println("Email Demis")
            val phoneUri = Uri.parse("tel:07415563374")
            val emailIntent = Intent(Intent.ACTION_SEND)
            emailIntent.type = "plain/text"
            emailIntent.putExtra(Intent.EXTRA_EMAIL, "demilavr@gmail.com")
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "My Resume")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "I liked it")
            startActivity(emailIntent)
        }
    }
}