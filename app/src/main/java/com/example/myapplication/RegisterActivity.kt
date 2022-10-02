package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
  //  private lateinit var auth: FirebaseAuth
    //private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnregister : Button =  findViewById(R.id.homeButton)

        btnregister.setOnClickListener{
            //setContentView(R.layout.activity_login)
            finish()

        }


    }
}