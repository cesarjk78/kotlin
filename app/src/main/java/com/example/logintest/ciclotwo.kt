package com.example.logintest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class ciclotwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitytwo)

        // Obtener la referencia del ViewPager2
        val viewPager = findViewById<ViewPager2>(R.id.viewPager)

        // Establecer el adaptador
        // Crear instancia del adaptador
        val imageAdapter = imashadap2()

        // Establecer el adaptador
        viewPager.adapter = imageAdapter
    }
}
