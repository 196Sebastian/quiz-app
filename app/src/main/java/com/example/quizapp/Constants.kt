package com.example.quizapp

object Constants {

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(1, "What Hiragana character is this?",
        R.drawable.hiragana1, "A", "U", "E", "O",  1)
        questionsList.add(que1)

        val que2 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana2, "A", "I", "E", "O", 2)
        questionsList.add(que2)

        val que3 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana3, "A", "U", "E", "I", 2)
        questionsList.add(que3)

        val que4 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana4, "E", "U", "I", "O", 1)
        questionsList.add(que4)

        val que5 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana5, "A", "U", "E", "O", 4)
        questionsList.add(que5)

        val que6 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana6, "Ku", "Ko", "Ki", "Ka", 4)
        questionsList.add(que6)

        val que7 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana7, "Ki", "Ka", "Ke", "Ko", 1)
        questionsList.add(que6)

        val que8 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana8, "Ki", "Ku", "Ke", "Ko", 2)
        questionsList.add(que6)

        val que9 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana9, "Ki", "Ke", "Ku", "Ka", 2)
        questionsList.add(que9)

        val que10 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana10, "Ka", "Ke", "Ko", "Ku", 3)
        questionsList.add(que10)

        val que11 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana11, "Sa", "Shi", "So", "Se", 1)
        questionsList.add(que11)

        val que12 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana12, "Sa", "Su", "So", "Shi", 4)
        questionsList.add(que12)

        val que13 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana13, "Sa", "Su", "Se", "Shi", 2)
        questionsList.add(que13)

        val que14 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana14, "Sa", "Su", "Se", "Shi", 3)
        questionsList.add(que14)

        val que15 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana15, "Shi", "Su", "Se", "So", 4)
        questionsList.add(que15)

        val que16 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana16, "Chi", "Tsu", "Te", "Ta", 4)
        questionsList.add(que16)

        val que17 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana17, "Chi", "To", "Te", "Ta", 1)
        questionsList.add(que17)

        val que18 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana18, "Chi", "To", "Tsu", "Ta", 3)
        questionsList.add(que18)

        val que19 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana19, "Te", "To", "Tsu", "Ta", 1)
        questionsList.add(que19)

        val que20 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana20, "Te", "To", "Tsu", "Ta", 2)
        questionsList.add(que20)

        val que21 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana21, "Na", "No", "Nu", "Ni", 1)
        questionsList.add(que21)

        val que22 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana22, "Na", "Ne", "Nu", "Ni", 4)
        questionsList.add(que22)

        val que23 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana23, "No", "Ne", "Nu", "Ni", 3)
        questionsList.add(que23)

        val que24 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana24, "No", "Ne", "Nu", "Na", 2)
        questionsList.add(que24)

        val que25 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana25, "No", "Ne", "Nu", "Na", 1)
        questionsList.add(que25)

        val que26 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana26, "Fu", "He", "Ha", "Hi", 3)
        questionsList.add(que26)

        val que27 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana27, "Fu", "Ho", "Ha", "Hi", 4)
        questionsList.add(que27)

        val que28 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana28, "Fu", "Ho", "Ha", "Hi", 1)
        questionsList.add(que28)

        val que29 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana29, "He", "Ho", "Ha", "Hi", 1)
        questionsList.add(que29)

        val que30 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana30, "He", "Ho", "Ha", "Hi", 2)
        questionsList.add(que30)

        val que31 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana31, "Me", "Mu", "Ma", "Mi", 3)
        questionsList.add(que31)

        val que32 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana32, "Me", "Mu", "Ma", "Mi", 4)
        questionsList.add(que32)

        val que33 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana33, "Mo", "Mu", "Ma", "Mi", 2)
        questionsList.add(que33)

        val que34 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana34, "Mo", "Me", "Mu", "Mi", 2)
        questionsList.add(que34)

        val que35 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana35, "Mo", "Me", "Mu", "Mi", 1)
        questionsList.add(que35)

        val que36 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana36, "Ya", "Yu", "Yo", "Shi", 1)
        questionsList.add(que36)

        val que37 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana37, "Ba", "Yu", "Yo", "Shi", 2)
        questionsList.add(que37)

        val que38 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana38, "Y0", "Yu", "Yo", "Ya", 3)
        questionsList.add(que38)

        val que39 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana39, "Ra", "Ru", "Ro", "Re", 1)
        questionsList.add(que39)

        val que40 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana40, "Re", "Ru", "Ro", "Ri", 4)
        questionsList.add(que40)

        val que41 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana41, "Re", "Ru", "Ro", "Ri", 2)
        questionsList.add(que41)

        val que42 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana42, "Re", "Ru", "Ro", "Ri", 1)
        questionsList.add(que42)

        val que43 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana43, "Re", "Ru", "Ro", "Ri", 3)
        questionsList.add(que43)

        val que44 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana44, "A", "n", "Wa", "Ka", 3)
        questionsList.add(que44)

        val que45 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana45, "Ko", "n", "Wa", "O", 4)
        questionsList.add(que45)

        val que46 = Question(1, "What Hiragana character is this?",
            R.drawable.hiragana46, "No", "n", "Ni", "O", 2)
        questionsList.add(que46)

        return questionsList    }
}