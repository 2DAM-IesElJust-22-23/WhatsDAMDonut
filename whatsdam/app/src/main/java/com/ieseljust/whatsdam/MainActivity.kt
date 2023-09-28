package com.ieseljust.whatsdam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ieseljust.whatsdam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val buttonConnect = binding.buttonConnect

        buttonConnect.setOnClickListener {
            // Obtener el valor del NickName y la dirección IP del servidor
            val nickName = binding.nickNameText.text.toString()
            val serverAddress = binding.serverAddressText.text.toString()

            // Validar el NickName no esté vacío y la dirección IP sea válida
            if (isValidNickName(nickName) && isValidIPAddress(serverAddress)) {
                // Abrir la ventana de mensajes (puedes agregar tu lógica aquí)
                openMessageWindow()
            } else {
                // Mostrar un mensaje de error si las validaciones fallan
                Toast.makeText(this, "Nombre de usuario o dirección IP no válidos", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun isValidNickName(nickName: String): Boolean {
        return nickName.isNotBlank()
    }

    private fun isValidIPAddress(ipAddress: String): Boolean {
        // Implementa aquí la validación de una dirección IP correcta
        val ipAddressRegex = """^\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}$""".toRegex()
        return ipAddress.matches(ipAddressRegex)
    }

    private fun openMessageWindow() {
        // Aquí puedes abrir la ventana de mensajes
        val intent = Intent(this, MessagesWindow::class.java)
        startActivity(intent)
    }
}
