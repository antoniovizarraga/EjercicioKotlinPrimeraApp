package com.example.ejercicioprimeraapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    companion object {
        lateinit var userName: EditText
        lateinit var password: EditText
        val masterUser: String = "admin"
        val masterPassword: String = "admin"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userName = findViewById<EditText>(R.id.userField)
        password = findViewById<EditText>(R.id.passwordField)
        //val toast = Toast.makeText(this, "Hola ${nombre,}"
        Log.d(":::Vida", "Se ha creado la aplicación")

        findViewById<Button>(R.id.userButton).setOnClickListener {
            if (userName.text.equals(masterUser) && password.text.equals(masterPassword)) {
                setContentView(R.layout.calculadora)


            } else {
                val etiqueta = findViewById<TextView>(R.id.textoBienvenida)
                setContentView(R.layout.bienvenida)
                etiqueta.text = userName.text
            }
        }



    }

    override fun onStart() {
        super.onStart()
        Log.d(":::Inicio", "Se ha iniciado la aplicación")
    }

    override fun onResume() {
        super.onResume()
        Log.d(":::Ejecucion", "Se está ejecutando la aplicación")
    }

    override fun onPause() {
        super.onPause()
        Log.d(":::Pausa", "Se ha pausado la aplicación")
    }

    override fun onStop() {
        super.onStop()
        Log.d(":::Detenido", "Se ha detenido la aplicación")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(":::Destruido", "Se ha destruido la aplicación")
    }
}