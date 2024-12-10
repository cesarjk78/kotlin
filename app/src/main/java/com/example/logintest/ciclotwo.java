package com.example.logintest;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class ciclotwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitytwo);

        // Obtener la referencia del ViewPager2
        ViewPager2 viewPager = findViewById(R.id.viewPager);

        // Establecer el adaptador
        // Crear instancia del adaptador
        imashadap2 imageAdapter = new imashadap2();

        // Establecer el adaptador
        viewPager.setAdapter(imageAdapter);
    }
}
