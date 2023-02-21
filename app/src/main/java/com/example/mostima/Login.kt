package com.example.mostima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        button3.setOnClickListener {
            val intent = Intent(this@Login, CAlCULATOR::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this@Login, test1::class.java)
            startActivity(intent)
        }



    }
}
