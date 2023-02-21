package com.example.mostima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginbutton : Button = findViewById(R.id.button)
        loginbutton.setOnClickListener {
            perfomLogin()
        }

        button.setOnClickListener {
            val intent = Intent(this@MainActivity, Login::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this@MainActivity, RegisterActiviy::class.java)
            startActivity(intent)
        }
    }

    private fun perfomLogin() {
        val email : EditText = findViewById(R.id.editTextTextPersonName2)
        val passwod : EditText = findViewById(R.id.editTextTextPersonName2)

        if (email.text.isEmpty() || passwod.text.isEmpty()){
            Toast.makeText(this,"Please fill all ",Toast.LENGTH_SHORT)
        }

    }

}