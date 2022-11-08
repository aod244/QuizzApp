package com.example.quizzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val enterNicktext = findViewById<TextView>(R.id.enterNickText)
        val button = findViewById<Button>(R.id.enterNickButton)
        button.setOnClickListener() {

            val nickname = enterNicktext.text.toString()

            Intent(this, activity_question::class.java).also{
                it.putExtra("EXTRA_NICKNAME", nickname)
                startActivity(it)

            }
        }
    }
}