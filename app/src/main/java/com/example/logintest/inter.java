package com.example.logintest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class inter extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inter);

        // Mostrar el mensaje de bienvenida
        Toast.makeText(this, "hola", Toast.LENGTH_LONG).show();

        // Botón para Ciclo 1
        Button ciclo1Button = findViewById(R.id.ciclo1Button);
        ciclo1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a la actividad ciclouno
                Intent intent = new Intent(inter.this, ciclouno.class);
                startActivity(intent);
            }
        });

        // Botón para Ciclo 2
        Button ciclo2Button = findViewById(R.id.ciclo2Button);
        ciclo2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a la actividad ciclodos
                Intent intent = new Intent(inter.this, ciclodos.class);
                startActivity(intent);
            }
        });

    }
}
