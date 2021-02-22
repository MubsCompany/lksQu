package com.example.lksqu.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.lksqu.R

class ListMateriAdapter(private var titles: List<String>): RecyclerView.Adapter<ListMateriAdapter.ListMateriViewHolder>() {

    class ListMateriViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemTitle: TextView = itemView.findViewById(R.id.tv_list_materi)

        init {
            itemView.setOnClickListener {
                val position: Int = adapterPosition
                Toast.makeText(itemView.context,"${position + 1}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListMateriViewHolder {
        return ListMateriViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recylerview_list, parent, false))
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    override fun onBindViewHolder(holder: ListMateriViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
    }
}