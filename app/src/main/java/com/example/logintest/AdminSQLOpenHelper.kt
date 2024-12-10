package com.example.logintest

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteDatabase.CursorFactory
import android.database.sqlite.SQLiteOpenHelper

class AdminSQLOpenHelper(context: Context?, name: String?, factory: CursorFactory?, version: Int) :
    SQLiteOpenHelper(context, name, factory, version) {
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("create table admin3(usuario text primary key,password text)")
        val usuario = "admin"
        val password = "12345"
        val datosAdmin = ContentValues()
        datosAdmin.put("usuario", usuario)
        datosAdmin.put("password", password)
        db.insert("admin3", "(usuario,password)", datosAdmin)
        db.execSQL(
            "create table personas(cedula int primary key,nombres text,genero text," +
                    "pais text,provincia text,correo text)"
        )
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
    }
}
