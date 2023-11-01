package com.ieseljust.whatsdam.ViewModels

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ieseljust.whatsdam.R
import com.ieseljust.whatsdam.model.Missatge
import java.text.SimpleDateFormat
import java.util.Date

class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
    val mstText: TextView = itemView.findViewById(R.id.msg_text)
    val msgMeTimestamp: TextView = itemView.findViewById(R.id.msg_me_timestamp)

    fun bind(missatge: Missatge){
        mstText.text = missatge.text

        val dateFormat = SimpleDateFormat("HH:mm")
        val horaActual = Date()
        val horaFormatada = dateFormat.format(horaActual)

        msgMeTimestamp.text = horaFormatada.toString()

    }
}

