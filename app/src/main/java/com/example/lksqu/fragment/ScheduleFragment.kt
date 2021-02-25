package com.example.lksqu.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lksqu.R
import com.example.lksqu.adapter.ListDayAdapter
import com.example.lksqu.adapter.ScheduleAdapter

class ScheduleFragment : Fragment() {

    private var days = mutableListOf<String>("Sun","Mon","Tue", "Wed", "Thu", "Fri", "Sat")

    private var namaPelajaran1 = mutableListOf<String>("Fiqih","Aqidah","Akhlak", "Bahasa Arab", "Nahwu", "Sorf", "Basa Sunda")
    private var namaPelajaran2 = mutableListOf<String>("Bahasa Arab","Fiqih","Sord", "Basa Sunda", "Akhlak", "Sorf", "Basa Sunda")
    private var namaPelajaran3 = mutableListOf<String>("Akhlak","Ipa","Matematika", "English", "Akhlak", "Sorf", "Basa Sunda")
    private var namaPelajaran4 = mutableListOf<String>("Sorf","Nahwu","Bahasa Arab", "Fiqih", "Akhlak", "Sorf", "Basa Sunda")
    private var namaPelajaran5 = mutableListOf<String>("Matematika","Ipa","Bahasa Arab", "Akhlak", "Fiqih", "Sorf", "Basa Sunda")
    private var namaPelajaran6 = mutableListOf<String>("Sorf","Ipa","Bahasa Jepang", "Akhlak", "Fiqih", "Sorf", "Basa Sunda")
    private var namaPelajaran7 = mutableListOf<String>("Ipa","Matematika","Seni", "Basa Sunda", "Fiqih", "Sorf", "Basa Jawa")
    private var jamPelajaran = mutableListOf<String>("07:00 - 08:00","08:00 - 09:00","09:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00")

    var selectedDay = "Sun"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val inflate = inflater.inflate(R.layout.fragment_schedule, container, false)

        val recyclerView = inflate.findViewById<RecyclerView>(R.id.rv_schedule)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        when (selectedDay) {
            "Sun" -> {
                recyclerView.adapter = ScheduleAdapter(
                    namaPelajaran1,
                    jamPelajaran
                )
            }
            "Mon" -> {
                recyclerView.adapter = ScheduleAdapter(
                    namaPelajaran2,
                    jamPelajaran
                )
            }
            "Tue" -> {
                recyclerView.adapter = ScheduleAdapter(
                    namaPelajaran3,
                    jamPelajaran
                )
            }
            "Wed" -> {
                recyclerView.adapter = ScheduleAdapter(
                    namaPelajaran4,
                    jamPelajaran
                )
            }
            "Thu" -> {
                recyclerView.adapter = ScheduleAdapter(
                    namaPelajaran5,
                    jamPelajaran
                )
            }
            "Fri" -> {
                recyclerView.adapter = ScheduleAdapter(
                    namaPelajaran6,
                    jamPelajaran
                )
            }
            "Sat" -> {
                recyclerView.adapter = ScheduleAdapter(
                    namaPelajaran7,
                    jamPelajaran
                )
            }

        }


        // days recyclerview =======================================================================

        val recyclerViewDays = inflate.findViewById<RecyclerView>(R.id.rv_schedule_days)

        val recyclerViewDayLayoutManager = LinearLayoutManager(requireContext())
        recyclerViewDayLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        recyclerViewDays.layoutManager = recyclerViewDayLayoutManager

        recyclerViewDays.adapter = ListDayAdapter(
            days
        )

        return inflate
    }

}