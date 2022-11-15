package com.example.quizzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat


class activity_question : AppCompatActivity() {

    private var mCurrentPosition: Int = 1
    private var mNickname: String? = null
    private var mQuestionsList: ArrayList<Question>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        val mNickname = intent.getStringExtra("PlayerNick")
        val button2 = findViewById<Button>(R.id.exitButton)
        button2.setOnClickListener(){
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }

        mQuestionsList = QuestionDATA.getQuestions()

        set_question()
    }
    private fun set_question() {
        val question = mQuestionsList!!.get(mCurrentPosition - 1)
        val questionName = findViewById<TextView>(R.id.questionName)
        val questionText = findViewById<TextView>(R.id.question)
        val option1 = findViewById<TextView>(R.id.answerbutton1)
        val option2 = findViewById<TextView>(R.id.answerbutton2)
        val option3 = findViewById<TextView>(R.id.answerbutton3)
        val option4 = findViewById<TextView>(R.id.answerbutton4)


        questionName.text = "Pytanie "+"$mCurrentPosition/5"
        questionText.text = question.question
        option1.text = question.optionOne
        option2.text = question.optionTwo
        option3.text = question.optionThree
        option4.text = question.optionFour
    }
}