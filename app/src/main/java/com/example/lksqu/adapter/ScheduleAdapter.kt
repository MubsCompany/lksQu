package com.example.lksqu.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.lksqu.R

class ScheduleAdapter(private var titles: List<String>, private var times: List<String>): RecyclerView.Adapter<ScheduleAdapter.ScheduleViewHolder>() {

    class ScheduleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemTitle: TextView = itemView.findViewById(R.id.tv_judul_jadwal)
        val itemTime: TextView = itemView.findViewById(R.id.tv_waktu_jadwal)

        init {
            itemView.setOnClickListener {
                val position: Int = adapterPosition
                Toast.makeText(itemView.context,"${position + 1}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScheduleViewHolder {
        return ScheduleViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.schedule_list, parent, false))
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    override fun onBindViewHolder(holder: ScheduleViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemTime.text = times[position]
    }
}