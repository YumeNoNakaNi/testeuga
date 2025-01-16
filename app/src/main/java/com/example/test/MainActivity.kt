package com.example.test

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun CalcUga(view: View) {

        val textUga = findViewById<TextView>(R.id.textUga)
        val editUga = findViewById<EditText>(R.id.editUga)
        val editBuga = findViewById<EditText>(R.id.editBuga)

        val Uga = editUga.getText().toString()
        val Buga = editBuga.getText().toString()

        val UgaConvertido: Double = Uga.toDouble()
        val BugaConvertido: Double = Buga.toDouble()

        val UgaBugaFinalizado = UgaConvertido / (BugaConvertido * BugaConvertido)

        textUga.setText("Ugabuga: $UgaBugaFinalizado")

    }


}