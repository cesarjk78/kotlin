package com.example.logintest;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class pagePersona extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_persona);

        // Mostrar el mensaje de bienvenida
        Toast.makeText(this, "Bienvenido a TECSUP Vault", Toast.LENGTH_LONG).show();

        // Configurar el listener para el botón
        Button btnStart = findViewById(R.id.btnStart);
        btnStart.setOnClickListener(v -> {
            // Iniciar la actividad inter cuando el botón sea clickeado
            Intent intent = new Intent(pagePersona.this, inter.class);
            startActivity(intent);
        });
    }
}
