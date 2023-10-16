package com.ieseljust.whatsdam

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Adaptador (private val llistaMissatges: List<Missatge>) : RecyclerView.Adapter<ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.my_msg_viewholder, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val missatge = llistaMissatges[position]
        holder.bind(missatge)
    }

    override fun getItemCount(): Int {
        return llistaMissatges.size
    }

}