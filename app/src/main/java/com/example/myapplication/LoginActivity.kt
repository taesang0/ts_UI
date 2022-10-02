package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {
    lateinit var emailEt: EditText
    lateinit var passwordEt: EditText
    lateinit var loginBtn: Button

    lateinit var auth: FirebaseAuth

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val tvregister : TextView =  findViewById(R.id.RegisterText)
        val btnlogin : Button = findViewById(R.id.loginButton)
        btnlogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
        tvregister.setOnClickListener{
            //setContentView(R.layout.activity_register)
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }





    }
}