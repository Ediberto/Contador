package com.example.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //CRIAR UM NOVO VIEWMODEL
        val viewModel = MyViewModel()
        val tvContador = findViewById<TextView>(R.id.tv_contador)
        val btnContador = findViewById<Button>(R.id.btn_contador)
        //AÇÃO DO BOTÃO
        //var contador = 0
        btnContador.setOnClickListener() {
            //CHAMAR A FUNÇÃO DA ViewMODEL DENTRO DO EVENTO DO BOTÃO
            viewModel.incremento()
            tvContador.text = viewModel.contador.toString()
        }
    }
}