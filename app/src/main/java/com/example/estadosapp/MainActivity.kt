package com.example.estadosapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: EstadoAdapter
    private var estados: List<Estado>? = emptyList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configurando a Toolbar
        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        // Configuração do RecyclerView
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        estados = EstadoData.getEstados()
        adapter = EstadoAdapter(this, estados!!, onClickEstado())
        recyclerView.adapter = adapter
    }

    private fun onClickEstado(): EstadoAdapter.EstadoOnClickListener {
        return object : EstadoAdapter.EstadoOnClickListener {
            override fun onClickEstado(holder: EstadoAdapter.EstadoViewHolder?, idx: Int) {
                val estado = estados?.getOrNull(idx) ?: return
                val intent = Intent(this@MainActivity, EstadoDetalhesActivity::class.java)
                intent.putExtra("estado", estado)
                startActivity(intent)
            }
        }
    }
}

