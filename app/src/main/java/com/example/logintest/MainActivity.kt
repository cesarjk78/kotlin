package com.example.logintest

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var etUsuario: EditText? = null
    private var etPassword: EditText? = null
    private var btnIngresar: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etUsuario = findViewById<View>(R.id.etUsuario) as EditText
        etPassword = findViewById<View>(R.id.etPasword) as EditText
        btnIngresar = findViewById<View>(R.id.btnIngresar) as Button
        btnIngresar!!.setOnClickListener { ingresar() }
    }

    fun ingresar() {
        try {
            val admin = AdminSQLOpenHelper(this, "administracion", null, 1)
            val bd = admin.writableDatabase
            val usuario = etUsuario!!.text.toString()
            val password = etPassword!!.text.toString()
            val fila = bd.rawQuery(
                "Select usuario,password from admin3 where usuario='" + usuario + "' and password='"
                        + password + "'", null
            )


            if (fila.moveToFirst()) {
                val i = Intent(this, pagePersona::class.java)
                i.putExtra("cedula", usuario)
                startActivity(i)
            } else {
                val fila2 = bd.rawQuery(
                    "Select cedula,nombres from personas where cedula='" + usuario + "' and nombres='"
                            + password + "'", null
                )
                if (fila2.moveToFirst()) {
                    val i = Intent(this, pagePersona::class.java)
                    i.putExtra("cedula", usuario)
                    startActivity(i)
                } else {
                    etPassword!!.setText("")
                    Toast.makeText(
                        this,
                        "Usuario o contraseña incorrectos Intente de nuevo",
                        Toast.LENGTH_LONG
                    ).show
                    ()
                    bd.close()
                }
            }
        } catch (e: Exception) {
            Toast.makeText(this, "Error en database$e", Toast.LENGTH_LONG).show()
        }
    }
}


