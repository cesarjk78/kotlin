package com.example.logintest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class english extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello);

        // Mostrar el mensaje de bienvenida
        Toast.makeText(this, "Welcome to TECSUP Vault", Toast.LENGTH_LONG).show();

        // Configurar el clic en el primer ImageView
        ImageView imageView1 = findViewById(R.id.imageView2_1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cambiar el diseño al XML quiensomos
                setContentView(R.layout.whoweare);

                // Configurar el botón para regresar a pagePersona
                Button btnBack = findViewById(R.id.btnBack);
                btnBack.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Volver a la actividad anterior
                        Intent intent = new Intent(english.this, english.class);
                        startActivity(intent);
                        finish(); // Finalizar actividad actual
                    }
                });
            }
        });

        // Configurar el clic en el segundo ImageView para redirigir a la clase mapa
        ImageView imageView2 = findViewById(R.id.imageView2_2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent para iniciar la clase mapa
                Intent intent = new Intent(english.this, mapish.class);
                startActivity(intent);
            }
        });

        // Configurar el clic en la tercera ImageView para abrir WhatsApp
        ImageView imageView3 = findViewById(R.id.imageView2_3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // URI para abrir WhatsApp con un mensaje predefinido
                String phoneNumber = "+936791144"; // Número de teléfono del contacto (con código de país)
                String message = "I would like to make a query"; // Mensaje a enviar
                String url = "https://wa.me/" + phoneNumber + "?text=" + Uri.encode(message);

                // Intent para abrir WhatsApp
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                intent.setPackage("com.whatsapp"); // Asegura que se abra en WhatsApp
                startActivity(intent);
            }
        });

        // Configurar el clic en el cuarto ImageView para ir a InterActivity
        ImageView imageView4 = findViewById(R.id.imageView2_4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent para iniciar la clase inter
                Intent intent = new Intent(english.this, intersh.class);
                startActivity(intent);
            }
        });

        // Configurar el clic en el quinto ImageView para redirigir a la clase Filtros
        ImageView imageView5 = findViewById(R.id.imageView2_5);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent para iniciar la clase Filtros
                Intent intent = new Intent(english.this, Filtersh.class);
                startActivity(intent);
            }
        });

        // Configurar el clic en el sexto ImageView para redirigir a la clase englis
        ImageView imageView6 = findViewById(R.id.imageView2_6);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent para iniciar la clase pagePersona
                Intent intent = new Intent(english.this, pagePersona.class);
                startActivity(intent);
            }
        });
    }
}
