package com.example.baneapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

class registerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val registerBtn = findViewById<Button>(R.id.registerButton)
        val backBtn = findViewById<ImageButton>(R.id.backButton)
        val emailaddressfield = findViewById<EditText>(R.id.emailAddress)
        val passwordfield = findViewById<EditText>(R.id.password)
        val usernamefield = findViewById<EditText>(R.id.username)
        backBtn.setOnClickListener {
            intent = Intent(this, loginActivity::class.java)
            startActivity(intent)
        }
        registerBtn.setOnClickListener{
            var emailaddress = emailaddressfield.text
            var password = passwordfield.text
            var username = usernamefield.text
            intent = Intent(this, loginActivity::class.java)
            startActivity(intent)
        }
    }
}