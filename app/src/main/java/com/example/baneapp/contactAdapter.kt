package com.example.baneapp

import android.content.Intent
import android.view.GestureDetector
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity


class contactAdapter(private val listener: OnItemClickListener, private var gebruikersnamen: List<String>, private var profielfotos: List<Int>) : RecyclerView.Adapter<contactAdapter.ViewHolder>() {


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var senderName: TextView
        var profilePicture: ImageView
        init {
            senderName = itemView.findViewById(R.id.sender_name)
            profilePicture = itemView.findViewById(R.id.profile_picture)
            itemView.setOnClickListener{
                val position = adapterPosition
                listener.onItemClick(position)

            }
        }
        fun onClick(v: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.onItemClick(position)
                Toast.makeText(itemView.context, "doei", Toast.LENGTH_SHORT).show()
            }
        }
    }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: contactAdapter.ViewHolder, position: Int) {

        holder.senderName.text = gebruikersnamen[position]
        holder.profilePicture.setImageResource(profielfotos[position])
    }

    override fun getItemCount(): Int = gebruikersnamen.size
}

