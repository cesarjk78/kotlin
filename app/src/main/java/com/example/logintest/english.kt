package com.example.logintest

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class english : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello)

        // Mostrar el mensaje de bienvenida
        Toast.makeText(this, "Welcome to TECSUP Vault", Toast.LENGTH_LONG).show()

        // Configurar el clic en el primer ImageView
        val imageView1 = findViewById<ImageView>(R.id.imageView2_1)
        imageView1.setOnClickListener {
            // Cambiar el diseño al XML quiensomos
            setContentView(R.layout.whoweare)

            // Configurar el botón para regresar a pagePersona
            val btnBack = findViewById<Button>(R.id.btnBack)
            btnBack.setOnClickListener {
                // Volver a la actividad anterior
                val intent = Intent(this@english, english::class.java)
                startActivity(intent)
                finish() // Finalizar actividad actual
            }
        }

        // Configurar el clic en el segundo ImageView para redirigir a la clase mapa
        val imageView2 = findViewById<ImageView>(R.id.imageView2_2)
        imageView2.setOnClickListener { // Intent para iniciar la clase mapa
            val intent = Intent(this@english, mapish::class.java)
            startActivity(intent)
        }

        // Configurar el clic en la tercera ImageView para abrir WhatsApp
        val imageView3 = findViewById<ImageView>(R.id.imageView2_3)
        imageView3.setOnClickListener { // URI para abrir WhatsApp con un mensaje predefinido
            val phoneNumber = "+936791144" // Número de teléfono del contacto (con código de país)
            val message = "I would like to make a query" // Mensaje a enviar
            val url = "https://wa.me/" + phoneNumber + "?text=" + Uri.encode(message)

            // Intent para abrir WhatsApp
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            intent.setPackage("com.whatsapp") // Asegura que se abra en WhatsApp
            startActivity(intent)
        }

        // Configurar el clic en el cuarto ImageView para ir a InterActivity
        val imageView4 = findViewById<ImageView>(R.id.imageView2_4)
        imageView4.setOnClickListener { // Intent para iniciar la clase inter
            val intent = Intent(this@english, intersh::class.java)
            startActivity(intent)
        }

        // Configurar el clic en el quinto ImageView para redirigir a la clase Filtros
        val imageView5 = findViewById<ImageView>(R.id.imageView2_5)
        imageView5.setOnClickListener { // Intent para iniciar la clase Filtros
            val intent = Intent(this@english, Filtersh::class.java)
            startActivity(intent)
        }

        // Configurar el clic en el sexto ImageView para redirigir a la clase englis
        val imageView6 = findViewById<ImageView>(R.id.imageView2_6)
        imageView6.setOnClickListener { // Intent para iniciar la clase pagePersona
            val intent = Intent(this@english, pagePersona::class.java)
            startActivity(intent)
        }
    }
}
