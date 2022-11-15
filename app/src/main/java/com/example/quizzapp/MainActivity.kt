package com.example.quizzapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {



    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var StartGame = findViewById<Button>(R.id.EnterGame)
        var PlayerNick = findViewById<TextView>(R.id.enterNickText)

        val userName: String = "Nick"


        StartGame.setOnClickListener(){
            if(PlayerNick.text.toString().isEmpty()){
                Toast.makeText(this, "Please enter you Nick", Toast.LENGTH_SHORT).show()
            }else{
                val Intent = Intent(this, activity_question::class.java)
                intent.putExtra("PlayerNick", PlayerNick.text.toString())
                startActivity(Intent)
                finish()
            }
        }

    }
}