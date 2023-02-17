package com.example.baneapp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.ImageButton
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*


class chatscreen : AppCompatActivity(), android.view.GestureDetector.OnGestureListener {
    lateinit var gestureDetector: GestureDetector

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<MessageAdapter.ViewHolder>? = null

    private var gebruikersnamen = mutableListOf<String>()
    private var berichtenlijst = mutableListOf<String>()
    private var tijden = mutableListOf<String>()
    private var profielfotos = mutableListOf<Int>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chatscreen2)
        val menubtn = findViewById<ImageButton >(R.id.menuBtn)
        menubtn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val profilename = intent.getStringExtra("gebruikersnaam")
        val profieltextview = findViewById<TextView>(R.id.friendname)
        profieltextview.setText(profilename)
        val messageview = findViewById<RecyclerView>(R.id.messagesRecyclerview)
        layoutManager = LinearLayoutManager(this)
        messageview.layoutManager = layoutManager
        adapter = MessageAdapter(gebruikersnamen, berichtenlijst, tijden, profielfotos)
        messageview.adapter = adapter

        val sendbtn = findViewById<ImageButton>(R.id.sendBtn)
        val textField = findViewById<EditText>(R.id.textfield)

        sendbtn.setOnClickListener{
            var textmessage = textField.getText()
            val rightNow = Calendar.getInstance()
            val uur: Int = rightNow.get(Calendar.HOUR_OF_DAY)
            val minuut: Int = rightNow.get(Calendar.MINUTE)
            val tijdstip: String = uur.toString() + ":" + minuut.toString()
            val nieuwBericht: String = textmessage.toString()
            val profielicon: Int = R.drawable.profielfotoicon
            addMessage("Maurice", tijdstip, nieuwBericht, profielicon)
            textField.setText("")

        }

    }
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        return false
    }
    private fun addMessage(naam: String, bericht: String, tijd: String, profielfoto: Int) {
        if(bericht != "") {
            gebruikersnamen.add(naam)
            berichtenlijst.add(bericht)
            tijden.add(tijd)
            profielfotos.add(profielfoto)
        }
    }








    override fun onDown(e: MotionEvent): Boolean {
        //TODO("Not yet implemented")
        return false
    }

    override fun onShowPress(e: MotionEvent) {
        //TODO("Not yet implemented")
    }

    override fun onSingleTapUp(e: MotionEvent): Boolean {
        //TODO("Not yet implemented")
        return false
    }

    override fun onScroll(
        e1: MotionEvent,
        e2: MotionEvent,
        distanceX: Float,
        distanceY: Float
    ): Boolean {
        //TODO("Not yet implemented")
        return false
    }

    override fun onLongPress(e: MotionEvent) {
        //TODO("Not yet implemented")

    }

    override fun onFling(
        e1: MotionEvent,
        e2: MotionEvent,
        velocityX: Float,
        velocityY: Float
    ): Boolean {
        //TODO("Not yet implemented")
        return false
    }
}