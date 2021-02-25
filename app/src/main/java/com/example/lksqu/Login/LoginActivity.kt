package com.example.lksqu.Login

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.example.lksqu.MainActivity
import com.example.lksqu.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    val firebaseAuth = FirebaseAuth.getInstance()
    val firebaseAuthListener = FirebaseAuth.AuthStateListener {
        // mengecek user id yang sedang aktif, jika ada, proses akan langsung intent ke halaman utama
        val user = firebaseAuth.currentUser?.uid
        if (user != null) {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login_register.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
        btn_login.setOnClickListener {
            loginUser()
        }
    }

    private fun loginUser() {
        val email = edt_email_login.text.toString()
        val password = edt_password_login.text.toString()

        when{
            TextUtils.isEmpty(email) -> Toast.makeText(this,"Email is Requaired", Toast.LENGTH_LONG)
            TextUtils.isEmpty(password) -> Toast.makeText(this,"Email is Requaired", Toast.LENGTH_LONG)

            else -> {
                val progressDialog = ProgressDialog(this@LoginActivity)
                progressDialog.setTitle("Login")
                progressDialog.setMessage("Please Wait . . .")
                progressDialog.setCanceledOnTouchOutside(false)
                progressDialog.show()

                val mAuth:FirebaseAuth = FirebaseAuth.getInstance()

                mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener { task ->
                    if (task.isSuccessful){
                        progressDialog.dismiss()
                        val intent = Intent(this@LoginActivity, MainActivity::class.java)
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
                        startActivity(intent)
                        finish()
                    }else{
                        val message = task.exception!!.toString()
                        Toast.makeText(this,"Eror: $message",Toast.LENGTH_SHORT).show()
                        FirebaseAuth.getInstance().signOut()
                        progressDialog.dismiss()
                    }
                }
            }

        }
    }

    override fun onStart() {
        super.onStart()

        firebaseAuth.addAuthStateListener ( firebaseAuthListener )

        if (FirebaseAuth.getInstance().currentUser != null){
            val intent = Intent(this@LoginActivity,MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish()
        }
    }

    override fun onStop() {
        super.onStop()
        finish()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}