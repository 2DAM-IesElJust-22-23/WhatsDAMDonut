package com.ieseljust.whatsdam.ViewModels

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ieseljust.whatsdam.R
import com.ieseljust.whatsdam.repositori.MissatgesRepository

class Adaptador () : RecyclerView.Adapter<ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.my_msg_viewholder, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val missatge = MissatgesRepository.getInstance().getLlista()[position]
        holder.bind(missatge)
    }

    override fun getItemCount(): Int {
        return MissatgesRepository.getInstance().getQuanMiss()
    }

}