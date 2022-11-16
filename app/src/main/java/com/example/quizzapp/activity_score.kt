package com.example.quizzapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class activity_score : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)
        val score = intent.getStringExtra("wynik").toString()
        val nick = intent.getStringExtra("nick").toString()
        println(score)
        println(nick)
        val shownick = findViewById<TextView>(R.id.textView2)
        val showscore = findViewById<TextView>(R.id.textView3)
        shownick.text = "$nick"
        showscore.text = "$score"
    }
}