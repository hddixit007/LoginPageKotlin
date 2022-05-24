package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSubmit.setOnClickListener{

            if(editTextTextEmailAddress.text.toString().isEmpty())
            {
                editTextTextEmailAddress.setError("Please Type name")
            }
            if(editTextTextPassword.text.toString().isEmpty())
            {
                editTextTextPassword.setError("Please type password")
            }
            if(!editTextTextEmailAddress.text.toString().equals("raf"))
            {
                editTextTextEmailAddress.setError("Wrong username")
            }
            if(!editTextTextPassword.text.toString().equals("raf"))
            {
                editTextTextPassword.setError("Wrong password")
            }
            var un = editTextTextEmailAddress.text.toString()
            Toast.makeText(this, "username is $un", Toast.LENGTH_LONG).show()
            editTextTextEmailAddress.setText(un)
        }
    }
}