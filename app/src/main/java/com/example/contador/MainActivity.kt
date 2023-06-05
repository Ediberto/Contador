package com.example.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvContador = findViewById<TextView>(R.id.tv_contador)
        val btnContador = findViewById<Button>(R.id.btn_contador)
        //AÇÃO DO BOTÃO
        var contador = 0
        tvContador.text = contador.toString()
        btnContador.setOnClickListener() {
            contador++
            tvContador.text = contador.toString()
        }
    }
}