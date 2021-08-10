package com.example.projetofragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projetofragments.R
import com.example.projetofragments.model.AdapterList
import com.example.projetofragments.model.Produto

class ListaFragment : Fragment() {

    private lateinit var listaRecyclerView: RecyclerView
    private lateinit var produtosAdapterList: AdapterList


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_lista, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listOfProduct = mutableListOf<Produto>(
            Produto("TV", "R$2.000,00"),
            Produto("Smarphone", "R$3.000,00"),
            Produto("Soundbar", "R$1.500,00"),
            Produto("Ar Condicionado", "R$1.800,00"),
            Produto("Aparelho de Som", "R$1.000,00"),
        )

        listaRecyclerView = view.findViewById(R.id.mainLista)
        listaRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        listaRecyclerView.adapter = AdapterList(listOfProduct)
    }
}
