package com.example.logintest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class OpenWhatsAppActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Crear un botón programáticamente
        Button btnSendMessage = new Button(this);
        btnSendMessage.setText("Enviar mensaje a WhatsApp");

        // Configurar el botón para abrir WhatsApp al hacer clic
        btnSendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = "+1234567890"; // Reemplaza con el número de teléfono del contacto (incluye el código de país)
                String message = "Hola bb"; // Mensaje que se enviará

                // URI para abrir WhatsApp con el mensaje
                Uri uri = Uri.parse("https://wa.me/" + phoneNumber + "?text=" + Uri.encode(message));
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.whatsapp"); // Asegura que se abra en WhatsApp

                // Verifica si la aplicación de WhatsApp está instalada
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                } else {
                    // Maneja el caso en que WhatsApp no esté instalado
                    // Puedes mostrar un mensaje o hacer una acción alternativa
                    // Toast.makeText(OpenWhatsAppActivity.this, "WhatsApp no está instalado", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Establecer el botón como vista principal de la actividad
        setContentView(btnSendMessage);
    }
}
