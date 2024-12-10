package com.example.logintest;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class cicloone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityone);

        // Obtener la referencia del ViewPager2
        ViewPager2 viewPager = findViewById(R.id.viewPager);

        // Crear instancia del adaptador
        imashadap imageAdapter = new imashadap();

        // Establecer el adaptador
        viewPager.setAdapter(imageAdapter);
    }
}
