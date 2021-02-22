package com.example.lksqu

import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.example.lksqu.fragment.BottomSheetFragment
import com.example.lksqu.fragment.HomeFragment
import com.example.lksqu.fragment.ListMateriFragment
import com.example.lksqu.fragment.LoginFragment


class MainActivity : AppCompatActivity() {
    private var content: FrameLayout? = null

//    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
//        when (item.itemId) {
//            R.id.navigation_home -> {
//                val fragment = HomeFragment.newInstance()
//                addFragment(fragment)
//                return@OnNavigationItemSelectedListener true
//            }
//
//            R.id.navigation_schedule -> {
//                val fragment = ScheduleFragment()
//                addFragment(fragment)
//                return@OnNavigationItemSelectedListener true
//            }
//
//            R.id.navigation_profile -> {
//                val fragment = ProfileFragment()
//                addFragment(fragment)
//                return@OnNavigationItemSelectedListener true
//            }
//        }
//        false
//    }

//    private fun addFragment(fragment: Fragment) {
//        supportFragmentManager
//            .beginTransaction()
//            .setCustomAnimations(R.anim.design_bottom_sheet_slide_in, R.anim.design_bottom_sheet_slide_out)
//            .replace(R.id.content, fragment, fragment.javaClass.getSimpleName())
//            .commit()
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
//        val fragment = HomeFragment.newInstance()
//        addFragment(fragment)

        val bottomSheetFragment = BottomSheetFragment()
//        bottomSheetFragment.show()

        // Memulai transaksi
        // Memulai transaksi
        val ft: FragmentTransaction = supportFragmentManager.beginTransaction()
// mengganti isi container dengan fragment baru
// mengganti isi container dengan fragment baru
        ft.replace(R.id.content, ListMateriFragment())
// atau ft.add(R.id.your_placeholder, new FooFragment());
// mulai melakukan hal di atas (jika belum di commit maka proses di atas belum dimulai)
// atau ft.add(R.id.your_placeholder, new FooFragment());
// mulai melakukan hal di atas (jika belum di commit maka proses di atas belum dimulai)
        ft.commit()

    }
}