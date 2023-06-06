package com.example.contador

import androidx.lifecycle.ViewModel

//ESTENDER A CLASSE CRIADA À VARIÁVEL VIEWMODEL
class MyViewModel : ViewModel() {
    //MOVER A VARIÁVEL contador da ACTIVITY
    var contador = 0
    //CRIAR A FUNÇÃO DE INCREMENTO
    fun incremento() {
        contador += 1
    }
}