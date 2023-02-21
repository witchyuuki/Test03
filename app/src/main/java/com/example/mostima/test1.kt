package com.example.mostima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_test1.*

class test1 : AppCompatActivity() {
    companion object{

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test1)
        button5.setOnClickListener {
            val intent = Intent(this@test1, FI::class.java)
            startActivity(intent)
        }

        }
    }
