package com.example.logintest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class mapa extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);

        Button openMapButton = findViewById(R.id.openMapButton);
        openMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // URI para buscar la ubicación de TECSUP en Google Maps
                String uri = "geo:0,0?q=TECSUP,Lima,Perú"; // Buscar TECSUP por nombre y ubicación
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                intent.setPackage("com.google.android.apps.maps"); // Asegura que se abra en Google Maps
                startActivity(intent);
            }
        });

        // Configurar el botón "Volver" para regresar a la clase pagePersona
        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent para regresar a pagePersona
                Intent intent = new Intent(mapa.this, pagePersona.class);
                startActivity(intent);
                finish(); // Opcional: Finaliza la actividad actual para evitar que se apile en el back stack
            }
        });
    }
}
