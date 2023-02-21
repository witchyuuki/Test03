package com.example.mostima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_main.*

class RegisterActiviy : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_activiy)

        auth = Firebase.auth

        val registerButton:Button = findViewById(R.id.button)

        registerButton.setOnClickListener {
            performSignUp()
        }


    }

    private fun performSignUp() {
        val email = findViewById<EditText>(R.id.editTextTextPersonName2)
        val passwod = findViewById<EditText>(R.id.editTextTextPassword)

        if (email.text.isEmpty() || passwod.text.isEmpty()){
            Toast.makeText(this,"Pleass fill all fields",Toast.LENGTH_SHORT)
                .show()
            return
        }

        val inputEmail = email.text.toString()
        val inputpassword = passwod.text.toString()

        auth.createUserWithEmailAndPassword(inputEmail,inputpassword)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val intent = Intent(this@RegisterActiviy, MainActivity::class.java)
                    startActivity(intent)

                    Toast.makeText(baseContext, "Success. ",
                        Toast.LENGTH_SHORT).show()


                } else {

                    val intent = Intent(this@RegisterActiviy, MainActivity::class.java)
                    startActivity(intent)
                    Toast.makeText(baseContext, "Authentication failed. ",
                        Toast.LENGTH_SHORT).show()

                }
            }
            .addOnFailureListener {
                Toast.makeText(this,"Error occurred ${it.localizedMessage}",Toast.LENGTH_SHORT)
                    .show()
            }
        button.setOnClickListener {  }
    }
}