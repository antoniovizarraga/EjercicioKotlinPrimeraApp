package com.example.ejercicioprimeraapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    companion object {
        lateinit var nombre: EditText
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nombre = findViewById<EditText>(R.id.userField)
        //val toast = Toast.makeText(this, "Hola ${nombre,}"
        Log.d(":::Vida", "Se ha creado la aplicación")

        findViewById<Button>(R.id.userButton).setOnClickListener {
            var etiqueta = findViewById<TextView>(R.id.textoBienvenida)
            etiqueta.text = nombre.getText()
            setContentView(R.layout.bienvenida)
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