package com.example.baneapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class loginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val registerBtn = findViewById<Button>(R.id.registerButton)
        val inlogBtn = findViewById<Button>(R.id.loginButton)
        val emailaddressfield = findViewById<EditText>(R.id.emailAddress)
        val passwordfield = findViewById<EditText>(R.id.password)

        registerBtn.setOnClickListener {
            intent = Intent(this, registerActivity::class.java)
            startActivity(intent)
        }
        inlogBtn.setOnClickListener{
            var emailaddress = emailaddressfield.text
            var password = passwordfield.text
            passwordfield.setText("")
        }
    }

}