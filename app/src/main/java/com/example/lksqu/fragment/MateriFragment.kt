package com.example.lksqu.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.lksqu.R
class MateriFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val inflate = inflater.inflate(R.layout.fragment_materi, container, false)

        var title = inflate.findViewById<TextView>(R.id.tv_title_materi)
        var value = inflate.findViewById<TextView>(R.id.tv_value_materi)

//        title.text = R.array.judul_materi_fiqih.

        return inflate
    }

}