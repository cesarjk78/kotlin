package com.example.logintest

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OpenWhatsAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Crear un botón programáticamente
        val btnSendMessage = Button(this)
        btnSendMessage.text = "Enviar mensaje a WhatsApp"

        // Configurar el botón para abrir WhatsApp al hacer clic
        btnSendMessage.setOnClickListener {
            val phoneNumber =
                "+1234567890" // Reemplaza con el número de teléfono del contacto (incluye el código de país)
            val message = "Hola bb" // Mensaje que se enviará

            // URI para abrir WhatsApp con el mensaje
            val uri = Uri.parse("https://wa.me/" + phoneNumber + "?text=" + Uri.encode(message))
            val intent = Intent(Intent.ACTION_VIEW, uri)
            intent.setPackage("com.whatsapp") // Asegura que se abra en WhatsApp

            // Verifica si la aplicación de WhatsApp está instalada
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            } else {
                // Maneja el caso en que WhatsApp no esté instalado
                // Puedes mostrar un mensaje o hacer una acción alternativa
                // Toast.makeText(OpenWhatsAppActivity.this, "WhatsApp no está instalado", Toast.LENGTH_SHORT).show();
            }
        }

        // Establecer el botón como vista principal de la actividad
        setContentView(btnSendMessage)
    }
}
