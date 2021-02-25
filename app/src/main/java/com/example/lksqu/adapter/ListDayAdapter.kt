package com.example.lksqu.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.lksqu.R

private var days = mutableListOf<String>("Sun","Mon","Tue", "Wed", "Thu", "Fri", "Sat")

class ListDayAdapter(private var days: List<String>): RecyclerView.Adapter<ListDayAdapter.ListDayViewHolder>() {

    var selectedDayFromAdapter = "Sun"

    class ListDayViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tv_day: TextView = itemView.findViewById(R.id.tv_day_list)

        init {
            itemView.setOnClickListener {
                val position: Int = adapterPosition
                Toast.makeText(itemView.context,"${position + 1}", Toast.LENGTH_SHORT).show()

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListDayViewHolder {
        return ListDayViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_day, parent, false))
    }

    override fun getItemCount(): Int {
        return days.size
    }

    override fun onBindViewHolder(holder: ListDayViewHolder, position: Int) {
        holder.tv_day.text = days[position]
    }
}