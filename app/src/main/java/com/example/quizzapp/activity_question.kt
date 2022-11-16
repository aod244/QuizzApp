package com.example.quizzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat


class activity_question : AppCompatActivity() {

    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var selectedOption: Int = 0
    private var score: Int = 0
    val correctanswer = 1
    var mNickname = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)


        println(mNickname)
        val button2 = findViewById<Button>(R.id.exitButton)
        button2.setOnClickListener(){
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }

        mQuestionsList = QuestionDATA.getQuestions()

        set_question()
    }
    fun onClick(v: View?) {

        when (v?.id) {

            R.id.answerbutton1 -> {
                if (correctanswer == 1){
                    score++
                    mCurrentPosition++
                    if(mCurrentPosition <= mQuestionsList!!.size) {
                        set_question()
                    }
                    else {
                        scoreActivity()
                    }
                }
                else{
                    mCurrentPosition++
                    if(mCurrentPosition <= mQuestionsList!!.size) {
                        set_question()
                    }
                    else {
                        scoreActivity()
                    }
                }

            }
            R.id.answerbutton2 -> {
                if (correctanswer == 2){
                    score++
                    mCurrentPosition++
                    if(mCurrentPosition <= mQuestionsList!!.size) {
                        set_question()
                    }
                    else {
                        scoreActivity()
                    }
                }
                else{
                    mCurrentPosition++
                    if(mCurrentPosition <= mQuestionsList!!.size) {
                        set_question()
                    }
                    else {
                        scoreActivity()
                    }
                }

            }
            R.id.answerbutton3 -> {
                if (correctanswer == 3){
                    score++
                    mCurrentPosition++
                    if(mCurrentPosition <= mQuestionsList!!.size) {
                        set_question()
                    }
                    else {
                        scoreActivity()
                    }
                }
                else{
                    mCurrentPosition++
                    if(mCurrentPosition <= mQuestionsList!!.size) {
                        set_question()
                    }
                    else {
                        scoreActivity()
                    }
                }

            }
            R.id.answerbutton4 -> {
                if (correctanswer == 4){
                    score++
                    mCurrentPosition++
                    if(mCurrentPosition <= mQuestionsList!!.size) {
                        set_question()
                    }
                    else {
                        scoreActivity()
                    }
                }
                else{
                    mCurrentPosition++
                    if(mCurrentPosition <= mQuestionsList!!.size) {
                        set_question()
                    }
                    else {
                        scoreActivity()

                    }
                }

            }



        }


    }
    private fun set_question() {
        val question = mQuestionsList!!.get(mCurrentPosition - 1)
        val questionName = findViewById<TextView>(R.id.questionName)
        val questionText = findViewById<TextView>(R.id.question)
        val option1 = findViewById<TextView>(R.id.answerbutton1)
        val option2 = findViewById<TextView>(R.id.answerbutton2)
        val option3 = findViewById<TextView>(R.id.answerbutton3)
        val option4 = findViewById<TextView>(R.id.answerbutton4)
        val correctanswer = question.correctAnswer
        mNickname = intent.getStringExtra("MSG").toString()
        questionName.text = "Pytanie "+"$mCurrentPosition/5"
        questionText.text = question.question
        option1.text = question.optionOne
        option2.text = question.optionTwo
        option3.text = question.optionThree
        option4.text = question.optionFour
        println(mNickname)


    }
    private fun scoreActivity(){
        val Intent = Intent(this, activity_score::class.java)
        val wynik: String = score.toString()
        Intent.putExtra("wynik",wynik)
        Intent.putExtra("nick",mNickname)
        startActivity(Intent)
    }
}