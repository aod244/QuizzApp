package com.example.quizzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class activity_question : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        val nickname = intent.getStringExtra("EXTRA_NICKNAME")
        val showNickname: TextView = findViewById(R.id.showNickName) as TextView
        showNickname.setText("Czesc $nickname!")
        val button2 = findViewById<Button>(R.id.exitButton)
        button2.setOnClickListener(){
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }
    }

}