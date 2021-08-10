package com.example.projetofragments.model

import android.system.Os.bind
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projetofragments.R

class AdapterList(
    var listaDeProdutos: MutableList<Produto>) : RecyclerView.Adapter<ItensProdutos>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItensProdutos {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_lista, parent, false)
        return ItensProdutos(itemView)
    }

    override fun onBindViewHolder(itensProdutos: ItensProdutos, position: Int) {

        listaDeProdutos[position].apply {
            itensProdutos.bind(this)
        }
    }

    override fun getItemCount(): Int {
        return listaDeProdutos.size
    }
}

class ItensProdutos(itemView: View) : RecyclerView.ViewHolder(itemView) {


    fun bind(produto: Produto) {

        itemView.findViewById<TextView>(R.id.idNome).apply {
            text = produto.nome
        }
        itemView.findViewById<TextView>(R.id.idValor).apply {
            text = produto.valor

        }

    }
}