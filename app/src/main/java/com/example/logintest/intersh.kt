package com.example.logintest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class intersh : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_in)

        // Mostrar el mensaje de bienvenida
        Toast.makeText(this, "Welcome", Toast.LENGTH_LONG).show()

        // Botón para Ciclo 1
        val ciclo1Button = findViewById<Button>(R.id.ciclo1Button)
        ciclo1Button.setOnClickListener { // Navegar a la actividad ciclouno
            val intent = Intent(this@intersh, cicloone::class.java)
            startActivity(intent)
        }

        // Botón para Ciclo 2
        val ciclo2Button = findViewById<Button>(R.id.ciclo2Button)
        ciclo2Button.setOnClickListener { // Navegar a la actividad ciclodos
            val intent = Intent(this@intersh, ciclotwo::class.java)
            startActivity(intent)
        }
    }
}
