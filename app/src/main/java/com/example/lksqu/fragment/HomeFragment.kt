package com.example.lksqu.fragment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.RecyclerView
import com.example.lksqu.Login.LoginActivity
import com.example.lksqu.Login.RegisterActivity
import com.example.lksqu.MainActivity
import com.example.lksqu.R
import com.example.lksqu.model.User
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {

    private lateinit var profileId: String
    private lateinit var firebaseUser : FirebaseUser

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        val inflate = inflater.inflate(R.layout.fragment_home, container, false)

        val mAuth: FirebaseAuth = FirebaseAuth.getInstance()

        val ic_logout = inflate.findViewById<ImageView>(R.id.ic_logout)

        val card1 = inflate.findViewById<ConstraintLayout>(R.id.card_pelajaran_1)
        val card2 = inflate.findViewById<ConstraintLayout>(R.id.card_pelajaran_2)
        val card3 = inflate.findViewById<ConstraintLayout>(R.id.card_pelajaran_3)
        val card4 = inflate.findViewById<ConstraintLayout>(R.id.card_pelajaran_4)
        val card5 = inflate.findViewById<ConstraintLayout>(R.id.card_pelajaran_5)

        ic_logout.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            startActivity(Intent(requireContext(), LoginActivity::class.java))
        }

        card1.setOnClickListener {
            val ft: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            ft.replace(R.id.content, ListMateriFragment())
            ft.commit()
        }
        card2.setOnClickListener {
            val ft: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            ft.replace(R.id.content, ListMateriFragment())
            ft.commit()
        }
        card3.setOnClickListener {
            val ft: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            ft.replace(R.id.content, ListMateriFragment())
            ft.commit()
        }
        card4.setOnClickListener {
            val ft: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            ft.replace(R.id.content, ListMateriFragment())
            ft.commit()
        }
        card5.setOnClickListener {
            val ft: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            ft.replace(R.id.content, ListMateriFragment())
            ft.commit()
        }

//        val bottomSheet = BottomSheetDialog(inflate.context)
//        val view = inflater.inflate(R.layout.bottom_sheet_layout, null)
//        bottomSheet.setContentView(view)
//        bottomSheet.show()
//
        firebaseUser = FirebaseAuth.getInstance().currentUser!!

        val pref = context?.getSharedPreferences("PREFS", Context.MODE_PRIVATE)
        if (pref != null)
        {
            this.profileId = pref.getString("profileId","none")!!
        }

        getnameuser()

        return inflate
    }

    private fun getnameuser() {
        val userRef = FirebaseDatabase.getInstance().getReference()
            .child("User").child(firebaseUser.uid)

        userRef.addValueEventListener(object : ValueEventListener {
            override fun onCancelled(p0: DatabaseError) {
            }

            override fun onDataChange(p0: DataSnapshot) {
                if (p0.exists()){
                    val user = p0.getValue<User>(User::class.java)
                    view?.textView2?.text = user?.getUsername()
                }
            }

        })
    }
}