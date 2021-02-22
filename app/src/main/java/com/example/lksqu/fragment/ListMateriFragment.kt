package com.example.lksqu.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lksqu.R
import com.example.lksqu.adapter.ListMateriAdapter

class ListMateriFragment : Fragment() {

    private var titleList = mutableListOf<String>("uhuk","ahay","piw piw")
//    private var listOf

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val inflate = inflater.inflate(R.layout.fragment_list_materi, container, false)

        val recyclerView = inflate.findViewById<RecyclerView>(R.id.rv_list_materi)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = ListMateriAdapter(kotlin.collections.listOf("data", "data1", "data2"))

        return inflate
    }

}