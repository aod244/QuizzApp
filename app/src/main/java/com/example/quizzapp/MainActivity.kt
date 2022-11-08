package com.example.quizzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    companion object {
        lateinit var nickName: EditText
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nickName = findViewById(R.id.enterNickText)

        val button = findViewById<Button>(R.id.enterNickButton)
        button.setOnClickListener(){
            intent = Intent(this, activity_question::class.java)
            startActivity(intent)

        }

    }
    fun submitNick (view: View?){
        println(nickName.text)
    }
}