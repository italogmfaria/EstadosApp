package com.example.estadosapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EstadoAdapter(
    private val context: Context,
    private val estados: List<Estado>,
    private val onClickListener: EstadoOnClickListener
) : RecyclerView.Adapter<EstadoAdapter.EstadoViewHolder>() {

    interface EstadoOnClickListener {
        fun onClickEstado(holder: EstadoViewHolder?, idx: Int)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): EstadoViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.adapter_estado, viewGroup, false)
        return EstadoViewHolder(view)
    }

    override fun getItemCount(): Int = estados.size

    override fun onBindViewHolder(holder: EstadoViewHolder, position: Int) {
        val estado = estados[position]
        holder.tNome.text = estado.nome
        holder.imgBandeira.setImageResource(estado.bandeira)

        holder.itemView.setOnClickListener {
            onClickListener.onClickEstado(holder, position)
        }
    }

    class EstadoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tNome: TextView = view.findViewById(R.id.tNome)
        val imgBandeira: ImageView = view.findViewById(R.id.imgBandeira)
    }
}
