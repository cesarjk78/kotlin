package com.example.logintest

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class mapish : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mapish)

        val openMapButton = findViewById<Button>(R.id.openMapButton)
        openMapButton.setOnClickListener { // URI para buscar la ubicación de TECSUP en Google Maps
            val uri = "geo:0,0?q=TECSUP,Lima,Perú" // Buscar TECSUP por nombre y ubicación
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
            intent.setPackage("com.google.android.apps.maps") // Asegura que se abra en Google Maps
            startActivity(intent)
        }

        // Configurar el botón "Volver" para regresar a la clase pagePersona
        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            // Intent para regresar a pagePersona
            val intent = Intent(this@mapish, english::class.java)
            startActivity(intent)
            finish() // Opcional: Finaliza la actividad actual para evitar que se apile en el back stack
        }
    }
}
