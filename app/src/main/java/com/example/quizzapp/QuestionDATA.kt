package com.example.quizzapp

object QuestionDATA {
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 =
            Question(0, "Kto prowadzi zajecia?", "Bakalarz", "Barczynski", "Kotwica", "Nowak", 2)
        questionsList.add(que1)

        val que2 = Question(
            1,
            "Jaki typ zmiennej przechowuje ciag znakow?",
            "Int",
            "Data Class",
            "String",
            "Mapa",
            3
        )
        questionsList.add(que2)

        val que3 = Question(2,"Co lubia jesc malpy?","Banana","Jablko","Marchew","Ziemniaka", 1)
        questionsList.add(que3)

        val que4 = Question(3,"W jakim budynku mamy zajecia?","W A", "W B", "W G", "W H", 1)
        questionsList.add(que4)

        val que5 = Question(4, "Kto parkuje tramwaj na petli?", "Seweryn", "Filip", "Paweł", "Norbert", 4)
        questionsList.add(que5)

    return questionsList
    }
}