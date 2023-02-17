package com.example.baneapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.Button
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener, contactAdapter.OnItemClickListener {
    lateinit var gestureDetector: GestureDetector
    var x2:Float = 0.0f
    var x1:Float = 0.0f
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var recentadapter: RecyclerView.Adapter<contactAdapter.ViewHolder>? = null
    private var layoutManager2: RecyclerView.LayoutManager? = null
    private var favadapter: RecyclerView.Adapter<contactAdapter.ViewHolder>? = null
    private var gebruikersnamen = mutableListOf<String>()
    private var profielfotos = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gebruikersnamen.add("Esra")
        profielfotos.add(R.drawable.friendicon)
        val extracontact = intent.getStringExtra("gebruikersnaam")
        if (extracontact != null) {
            gebruikersnamen.add(extracontact)
            profielfotos.add(R.drawable.friendicon)
        }

        val recentview = findViewById<RecyclerView>(R.id.recentRecyclerview)
        layoutManager = LinearLayoutManager(this)
        recentview.layoutManager = layoutManager
        recentadapter = contactAdapter(this, gebruikersnamen, profielfotos)
        recentview.adapter = recentadapter

        val favview = findViewById<RecyclerView>(R.id.favRecyclerView)
        layoutManager2 = LinearLayoutManager(this)
        favview.layoutManager = layoutManager2
        favadapter = contactAdapter(this, gebruikersnamen, profielfotos)
        favview.adapter = favadapter

        gestureDetector = GestureDetector(this, this)

        val settingbutton = findViewById<ImageButton>(R.id.settingbutton)
        settingbutton.setOnClickListener {
            val intent = Intent(this, settingsActivity::class.java)
            startActivity(intent)
        }
        val addFriendbtn = findViewById<ImageButton>(R.id.friendbtn)
        addFriendbtn.setOnClickListener {
            val intent2 = Intent(this, addfriendsActivity::class.java)
            intent2.putExtra("gebruikersnamen", gebruikersnamen.toTypedArray())
            intent2.putExtra("profielfotos", profielfotos.toTypedArray())
            startActivity(intent2)
        }

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        if (event != null) {
            gestureDetector.onTouchEvent(event)
        }

        when (event?.action) {
            0->
            {x1 = event.x }
            1->
            {
                x2 = event.x
                val valueX:Float = x1-x2
                if(valueX > 150)
                {
                    val intent = Intent(this, chatscreen::class.java)
                    startActivity(intent)
                }
            }
        }
        return super.onTouchEvent(event)
    }
    override fun onItemClick(position:Int) {
        val clickedItem = gebruikersnamen[position]
        var gebruikersnaam: String = gebruikersnamen[position]
        recentadapter?.notifyItemChanged(position)
        val intent = Intent(this, chatscreen::class.java)
        intent.putExtra("gebruikersnaam", gebruikersnaam)
        startActivity(intent)
    }
    //niet in gebruik, maar anders werkt Gesture detector niet.











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