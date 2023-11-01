package com.ieseljust.whatsdam.Views

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ieseljust.whatsdam.R
import com.ieseljust.whatsdam.ViewModels.Adaptador
import com.ieseljust.whatsdam.ViewModels.ViewModel
import com.ieseljust.whatsdam.databinding.ActivityMainBinding
import com.ieseljust.whatsdam.databinding.ActivityMessagesWindowBinding
import com.ieseljust.whatsdam.model.Gestor

class MessagesWindow : AppCompatActivity() {

    private lateinit var serverAddress: String
    private lateinit var nickName: String
    private lateinit var adapter: Adaptador
    private lateinit var viewModel:ViewModel
    private lateinit var binding:ActivityMessagesWindowBinding
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_messages_window)

        // Obtener los valores de serverAddress y nickName del Intent
        serverAddress = intent.getStringExtra("serverAddress") ?: ""
        nickName = intent.getStringExtra("nickName") ?: ""
        binding = ActivityMessagesWindowBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this)[ViewModel::class.java]

        // Configurar el texto del TextView reemplazando los marcadores de posición
        val connectionInfoTextView = findViewById<TextView>(R.id.connectionInfoTextView)
        val formattedText = getString(R.string.connection_info_template, serverAddress, nickName)
        connectionInfoTextView.text = formattedText

        // Referencias a elementos de UI
        val messageEditText = findViewById<EditText>(R.id.MessageText)
        val sendButton = findViewById<ImageButton>(R.id.sendMessage)


        // Configurar el RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.MessagesRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = Adaptador()
        recyclerView.adapter = adapter

        viewModel.adaptador.observe(this){
            binding.MessagesRecyclerView.adapter = it
        }

        binding.sendMessage.setOnClickListener{
            viewModel.add(nickName, formattedText)
        }

        // Configurar el clic del botón de enviar
        sendButton.setOnClickListener {
            val missatgeText = messageEditText.text.toString()
            if (missatgeText.isNotEmpty()){

                Gestor.afegirMissatge(nickName, missatgeText)
                adapter.notifyItemInserted(Gestor.llistaMissatges.size - 1)
                recyclerView.scrollToPosition(Gestor.llistaMissatges.size -1)
                messageEditText.text.clear()
            }
        }
    }
}
