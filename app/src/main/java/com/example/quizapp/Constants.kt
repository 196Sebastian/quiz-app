package com.example.quizapp

object Constants {

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(1, "What Hiragana character is this?",
        R.drawable.hiragana1, "A", "U", "E", "O", 1)
        questionsList.add(que1)

        val que2 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana1, "A", "U", "E", "O", 1)
        questionsList.add(que2)

        val que3 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana1, "A", "U", "E", "O", 1)
        questionsList.add(que3)

        val que4 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana1, "A", "U", "E", "O", 1)
        questionsList.add(que4)

        val que5 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana1, "A", "U", "E", "O", 1)
        questionsList.add(que5)

        return questionsList
    }
}