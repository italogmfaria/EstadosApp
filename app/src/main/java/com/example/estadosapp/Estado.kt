package com.example.estadosapp

import java.io.Serializable

data class Estado(
    val nome: String,
    val bandeira: Int,
    val capital: String,
    val populacao: String,
    val regiao: String
) : Serializable
