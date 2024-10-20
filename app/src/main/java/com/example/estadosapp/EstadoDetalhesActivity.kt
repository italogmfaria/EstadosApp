package com.example.estadosapp

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView

class EstadoDetalhesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estado_detalhes)

        // Configurando a Toolbar com o botão de voltar
        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // Pegando os dados do estado passado pela Intent
        val estado = intent.getSerializableExtra("estado") as? Estado
        if (estado != null) {
            val imgBandeira: ImageView = findViewById(R.id.imgBandeira)
            val tNome: TextView = findViewById(R.id.tNome)
            val tCapital: TextView = findViewById(R.id.tCapital)
            val tPopulacao: TextView = findViewById(R.id.tPopulacao)
            val tRegiao: TextView = findViewById(R.id.tRegiao)

            imgBandeira.setImageResource(estado.bandeira)
            tNome.text = estado.nome
            tCapital.text = "Capital: ${estado.capital}"
            tPopulacao.text = "População: ${estado.populacao}"
            tRegiao.text = "Região: ${estado.regiao}"
        }
    }

    // Função que trata o clique no botão de voltar
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}

