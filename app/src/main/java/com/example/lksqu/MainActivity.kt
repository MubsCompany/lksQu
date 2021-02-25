package com.example.lksqu

import android.content.Intent
import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.lksqu.fragment.*
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    private var content: FrameLayout? = null

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { it ->
        when (it.itemId) {
            R.id.navigation_home -> {
                moveToFragment(HomeFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_schedule -> {
                moveToFragment(ScheduleFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_profile -> {
                it.isChecked = false
                moveToFragment(ProfileFragment())
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun moveToFragment(fragment: Fragment) {
        val fragmentTrans = supportFragmentManager.beginTransaction()
            .setCustomAnimations(R.anim.design_bottom_sheet_slide_in, R.anim.design_bottom_sheet_slide_out)
        fragmentTrans.replace(R.id.content, fragment)
        fragmentTrans.commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
//        val fragment = HomeFragment.newInstance()
//        addFragment(fragment)

        val bottomSheetFragment = BottomSheetFragment()
//        bottomSheetFragment.show()

        val navView: BottomNavigationView = findViewById(R.id.navigation)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

        val ft: FragmentTransaction = supportFragmentManager.beginTransaction()
        ft.replace(R.id.content, HomeFragment())
        ft.commit()

    }
}