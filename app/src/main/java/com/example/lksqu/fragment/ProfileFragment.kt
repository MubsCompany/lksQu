package com.example.lksqu.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lksqu.R
import com.example.lksqu.model.User
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.fragment_profile.view.*


class ProfileFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val inflate = inflater.inflate(R.layout.fragment_profile, container, false)

        val pref = context?.getSharedPreferences("PREFS", Context.MODE_PRIVATE)
        if (pref != null)
        {
//            this.profileId = pref.getString("profileId","none")!!
        }


        userInfo()

        return inflate
    }

    private fun userInfo() {
        val userRef = FirebaseDatabase.getInstance().getReference()
            .child("User").child(FirebaseAuth.getInstance().currentUser!!.uid)


        userRef?.addValueEventListener(object : ValueEventListener {
            override fun onCancelled(p0: DatabaseError) {
            }

            override fun onDataChange(p0: DataSnapshot) {
                if (p0.exists()){
                    val user = p0.getValue<User>(User::class.java)
//                    Picasso.get().load(user?.getImage()).placeholder(R.drawable.profile).into(view?.imageView2)
                    view?.txtusername?.text = user?.getUsername()
                    view?.txt_bio?.text = user?.getStatus()
                    view?.txt_addres?.text = user?.getAdress()
                    view?.txt_email?.text = user?.getEmail()


                }
            }

        })
    }
}