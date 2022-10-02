package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    var i : Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      //  val db = Firebase.firestore

        val btnregister : Button =  findViewById(R.id.homebutton)
        val changebtn : Button =  findViewById(R.id.changebtn)
        val text1 : TextView =  findViewById(R.id.textView)

        btnregister.setOnClickListener{
            //setContentView(R.layout.activity_login)
            finish()
        }
        changebtn.setOnClickListener {

            text1.setText("" + i)
            i += 1
            val database = Firebase.database("https://smartfarm-dc8b0-default-rtdb.firebaseio.com/")
            val myRef = database.getReference("message")
            myRef.setValue("2022_10_2")

        }
    }
}
