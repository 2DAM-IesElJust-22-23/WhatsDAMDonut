package com.ieseljust.whatsdam

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
    private val mstText: TextView = itemView.findViewById(R.id.msg_text)
    private val msgMeTimestamp: TextView = itemView.findViewById(R.id.msg_me_timestamp)

    fun bind(missatge: Missatge){
        mstText.text = missatge.text
        msgMeTimestamp.text = missatge.text
    }
}

