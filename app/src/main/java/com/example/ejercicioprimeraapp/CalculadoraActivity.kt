package com.example.ejercicioprimeraapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class CalculadoraActivity : AppCompatActivity() {
    companion object {
        lateinit var firstValElement: EditText
        lateinit var secondValElement: EditText
        lateinit var resultElement: TextView

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculadora)

        var firstValue: Double
        var secondValue: Double
        var result: Double

        firstValElement = findViewById<EditText>(R.id.firstValueField)
        secondValElement = findViewById<EditText>(R.id.secondValueField)
        resultElement = findViewById<TextView>(R.id.resultField)


        // El evento del botón de sumar
        findViewById<Button>(R.id.sumButton).setOnClickListener {
            firstValue = firstValElement.getText().toString().toDoubleOrNull() ?: 0.0
            secondValue = secondValElement.getText().toString().toDoubleOrNull() ?: 0.0

            result = firstValue + secondValue
            resultElement.setText(result.toString())
        }

        // El evento del botón de restar
        findViewById<Button>(R.id.subButton).setOnClickListener {
            firstValue = firstValElement.getText().toString().toDoubleOrNull() ?: 0.0
            secondValue = secondValElement.getText().toString().toDoubleOrNull() ?: 0.0

            result = firstValue - secondValue
            resultElement.setText(result.toString())
        }

        // El evento del botón de multiplicar
        findViewById<Button>(R.id.mulButton).setOnClickListener {
            firstValue = firstValElement.getText().toString().toDoubleOrNull() ?: 0.0
            secondValue = secondValElement.getText().toString().toDoubleOrNull() ?: 0.0

            result = firstValue * secondValue
            resultElement.setText(result.toString())
        }

        // El evento del botón de dividir
        findViewById<Button>(R.id.divButton).setOnClickListener {
            firstValue = firstValElement.getText().toString().toDoubleOrNull() ?: 0.0
            secondValue = secondValElement.getText().toString().toDoubleOrNull() ?: 0.0
            if (firstValue == 0.0 || secondValue == 0.0) {
                Toast.makeText(baseContext, "No se puede dividir entre cero.", Toast.LENGTH_SHORT)
                    .show()
            } else {
                result = firstValue / secondValue
                resultElement.setText(result.toString())

            }
        }

        // Evento de botón flotante para volver al inicio de la aplicación
        findViewById<FloatingActionButton>(R.id.homeBtn).setOnClickListener {
            val mainIntent = Intent(this, MainActivity::class.java)
            startActivity(mainIntent)
        }


    }


}