package com.example.quizzapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var nickName: EditText

    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var StartGame = findViewById<Button>(R.id.EnterGame)

        nickName = findViewById(R.id.enterNickText)


        StartGame.setOnClickListener(){
            setContentView(R.layout.activity_category)
        }

    }
    fun submitNick (view: View?){
        println(nickName.text)

    }
}