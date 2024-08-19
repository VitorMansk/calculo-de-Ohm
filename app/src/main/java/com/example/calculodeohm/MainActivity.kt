package com.example.calculodeohm

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val Voltagem = findViewById<EditText>(R.id.voltagem)
        val Resistencia = findViewById<EditText>(R.id.resistencia)
        val Corrente = findViewById<EditText>(R.id.corrente)
        val Cal_Voltagem = findViewById<Button>(R.id.cal_voltagem)
        val Cal_Resistencia = findViewById<Button>(R.id.cal_resistencia)
        val Cal_Corrente = findViewById<Button>(R.id.cal_corrente)

        Cal_Voltagem.setOnClickListener {
            val result = Resistencia.text.toString().toInt() * Corrente.text.toString().toInt()
            Toast.makeText(this, "O valor é ${result.toString()}", Toast.LENGTH_SHORT).show()

        }

        Cal_Resistencia.setOnClickListener {
            val result = Voltagem.text.toString().toInt() / Corrente.text.toString().toInt()
            Toast.makeText(this, "O valor é ${result.toString()}", Toast.LENGTH_SHORT).show()

        }
        Cal_Corrente.setOnClickListener {
            val result = Voltagem.text.toString().toInt() / Resistencia.text.toString().toInt()
            Toast.makeText(this, "O valor é ${result.toString()}", Toast.LENGTH_SHORT).show()

        }

    }
}