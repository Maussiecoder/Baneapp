package com.example.baneapp

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class MessageAdapter(private var gebruikersnamen:List<String>, private var tijden: List<String>, private var berichten: List<String>, private var profielfotos: List<Int>,) : RecyclerView.Adapter<MessageAdapter.ViewHolder>() {



    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var messageText: TextView
        var senderName: TextView
        var timestamp: TextView
        var profilePicture: ImageView
        init {
            messageText =  itemView.findViewById(R.id.message_text)
            senderName = itemView.findViewById(R.id.sender_name)
            timestamp = itemView.findViewById(R.id.time_sent)
            profilePicture = itemView.findViewById(R.id.profile_picture)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.messgae_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: MessageAdapter.ViewHolder, position: Int) {

        holder.messageText.text = berichten [position]
        holder.senderName.text = gebruikersnamen[position]
        holder.timestamp.text = tijden[position]
        holder.profilePicture.setImageResource(profielfotos[position])
    }

    override fun getItemCount(): Int = berichten.size
}

