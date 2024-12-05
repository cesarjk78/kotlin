package com.example.logintest;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class ciclodos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciclo_dos);

        // Obtener la referencia del ViewPager2
        ViewPager2 viewPager = findViewById(R.id.viewPager);

        // Establecer el adaptador
        ImageAdapter2 imageAdapter = new ImageAdapter2(); // Cambiado a ImageAdapter2
        viewPager.setAdapter(imageAdapter);
    }
}
