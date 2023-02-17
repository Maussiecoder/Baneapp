package com.example.baneapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class addfriendsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addfriends)



        val backbtn = findViewById<ImageButton>(R.id.backButton)
        backbtn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }
        val addbtn = findViewById<Button>(R.id.addButton)
        val contactTextBox = findViewById<EditText>(R.id.contactname)
        addbtn.setOnClickListener{
            var contactname = contactTextBox.text
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("gebruikersnamen", contactname)
            intent.putExtra("profielfotos", R.id.friendAvatar)
            startActivity(intent)
        }
    }

}