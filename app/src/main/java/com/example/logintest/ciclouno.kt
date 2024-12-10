package com.example.logintest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class ciclouno : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciclo_uno)

        // Obtener la referencia del ViewPager2
        val viewPager = findViewById<ViewPager2>(R.id.viewPager)

        // Establecer el adaptador
        val imageAdapter = ImageAdapter()
        viewPager.adapter = imageAdapter
    }
}
