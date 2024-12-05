package com.example.logintest;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class ciclouno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciclo_uno);

        // Obtener la referencia del ViewPager2
        ViewPager2 viewPager = findViewById(R.id.viewPager);

        // Establecer el adaptador
        ImageAdapter imageAdapter = new ImageAdapter();
        viewPager.setAdapter(imageAdapter);
    }
}
