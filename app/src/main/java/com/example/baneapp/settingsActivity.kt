package com.example.baneapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat

class settingsActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        val foregroundimg = findViewById<ImageView>(R.id.backgroundUp)
        val mainView = findViewById<View>(R.id.main)
        var instellingenText = findViewById<TextView>(R.id.textView)
        var textColorText = findViewById<TextView>(R.id.textColorTextView)
        var bgColorText = findViewById<TextView>(R.id.backgroundColorTextView)
        var fgColorText = findViewById<TextView>(R.id.foregroundTextView)
        //buttons
        var lgTextColorButton = findViewById<RadioButton>(R.id.textlichtgrijsButton)
        var gTextColorButton = findViewById<RadioButton>(R.id.textgrijsButton)
        var dgTextColorButton = findViewById<RadioButton>(R.id.textdonkergrijsButton)
        var lgfgColorButton = findViewById<RadioButton>(R.id.fglichtgrijsButton)
        var gfgColorButton = findViewById<RadioButton>(R.id.fggrijsButton)
        var dgfgColorButton = findViewById<RadioButton>(R.id.fgdonkergrijsButton)
        var lgbgColorButton = findViewById<RadioButton>(R.id.bglichtgrijsButton)
        var gbgColorButton = findViewById<RadioButton>(R.id.bggrijsButton)
        var dgbgColorButton = findViewById<RadioButton>(R.id.bgdonkergrijsButton)

        val fgColorGroup = findViewById<RadioGroup>(R.id.fgcolorRadioGroup)
        val bgColorGroup = findViewById<RadioGroup>(R.id.bgcolorRadioGroup)
        val textColorGroup = findViewById<RadioGroup>(R.id.textcolorRadioGroup)

        val backbtn = findViewById<ImageButton>(R.id.backBtn)
        backbtn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val applyBtn = findViewById<Button>(R.id.applyButton)
        applyBtn.setOnClickListener{
            var fgid:Int = fgColorGroup.checkedRadioButtonId
            var bgid:Int = bgColorGroup.checkedRadioButtonId
            var textcolorid:Int = textColorGroup.checkedRadioButtonId
            //foreground
            if(fgid == R.id.fglichtgrijsButton) {
                foregroundimg.setImageResource(R.drawable.lightgraysquare)
                backbtn.setBackgroundColor(ContextCompat.getColor(this, R.color.lightgray))
            }
            if(fgid == R.id.fggrijsButton) {
                foregroundimg.setImageResource(R.drawable.graysquare)
                backbtn.setBackgroundColor(ContextCompat.getColor(this, R.color.gray))
            }
            if(fgid == R.id.fgdonkergrijsButton) {
                foregroundimg.setImageResource(R.drawable.darkgraysquare)
                backbtn.setBackgroundColor(ContextCompat.getColor(this, R.color.darkgray))
            }

            //background
            if(bgid == R.id.bglichtgrijsButton) {
                mainView.setBackgroundColor(ContextCompat.getColor(this, R.color.lightgray))
            }
            if(bgid == R.id.bggrijsButton) {
                mainView.setBackgroundColor(ContextCompat.getColor(this, R.color.gray))
            }
            if(bgid == R.id.bgdonkergrijsButton) {
                mainView.setBackgroundColor(ContextCompat.getColor(this, R.color.darkgray))
            }

            //text
            if(textcolorid == R.id.textlichtgrijsButton) {
                lgTextColorButton.setTextColor(ContextCompat.getColor(this, R.color.lightgray))
                gTextColorButton.setTextColor(ContextCompat.getColor(this, R.color.lightgray))
                dgTextColorButton.setTextColor(ContextCompat.getColor(this, R.color.lightgray))

                lgfgColorButton.setTextColor(ContextCompat.getColor(this, R.color.lightgray))
                gfgColorButton.setTextColor(ContextCompat.getColor(this, R.color.lightgray))
                dgfgColorButton.setTextColor(ContextCompat.getColor(this, R.color.lightgray))

                lgbgColorButton.setTextColor(ContextCompat.getColor(this, R.color.lightgray))
                gbgColorButton.setTextColor(ContextCompat.getColor(this, R.color.lightgray))
                dgbgColorButton.setTextColor(ContextCompat.getColor(this, R.color.lightgray))

                instellingenText.setTextColor(ContextCompat.getColor(this, R.color.lightgray))
                bgColorText.setTextColor(ContextCompat.getColor(this, R.color.lightgray))
                fgColorText.setTextColor(ContextCompat.getColor(this, R.color.lightgray))
                textColorText.setTextColor(ContextCompat.getColor(this, R.color.lightgray))



            }
            if(textcolorid == R.id.textgrijsButton) {
                lgTextColorButton.setTextColor(ContextCompat.getColor(this, R.color.gray))
                gTextColorButton.setTextColor(ContextCompat.getColor(this, R.color.gray))
                dgTextColorButton.setTextColor(ContextCompat.getColor(this, R.color.gray))

                lgfgColorButton.setTextColor(ContextCompat.getColor(this, R.color.gray))
                gfgColorButton.setTextColor(ContextCompat.getColor(this, R.color.gray))
                dgfgColorButton.setTextColor(ContextCompat.getColor(this, R.color.gray))

                lgbgColorButton.setTextColor(ContextCompat.getColor(this, R.color.gray))
                gbgColorButton.setTextColor(ContextCompat.getColor(this, R.color.gray))
                dgbgColorButton.setTextColor(ContextCompat.getColor(this, R.color.gray))

                instellingenText.setTextColor(ContextCompat.getColor(this, R.color.gray))
                bgColorText.setTextColor(ContextCompat.getColor(this, R.color.gray))
                fgColorText.setTextColor(ContextCompat.getColor(this, R.color.gray))
                textColorText.setTextColor(ContextCompat.getColor(this, R.color.gray))
            }
            if(textcolorid == R.id.textdonkergrijsButton) {
                lgTextColorButton.setTextColor(ContextCompat.getColor(this, R.color.darkgray))
                gTextColorButton.setTextColor(ContextCompat.getColor(this, R.color.darkgray))
                dgTextColorButton.setTextColor(ContextCompat.getColor(this, R.color.darkgray))

                lgfgColorButton.setTextColor(ContextCompat.getColor(this, R.color.darkgray))
                gfgColorButton.setTextColor(ContextCompat.getColor(this, R.color.darkgray))
                dgfgColorButton.setTextColor(ContextCompat.getColor(this, R.color.darkgray))

                lgbgColorButton.setTextColor(ContextCompat.getColor(this, R.color.darkgray))
                gbgColorButton.setTextColor(ContextCompat.getColor(this, R.color.darkgray))
                dgbgColorButton.setTextColor(ContextCompat.getColor(this, R.color.darkgray))

                instellingenText.setTextColor(ContextCompat.getColor(this, R.color.darkgray))
                bgColorText.setTextColor(ContextCompat.getColor(this, R.color.darkgray))
                fgColorText.setTextColor(ContextCompat.getColor(this, R.color.darkgray))
                textColorText.setTextColor(ContextCompat.getColor(this, R.color.darkgray))
            }


        }
    }

}