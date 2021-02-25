package com.example.lksqu.quiz

import com.example.lksqu.R

object Constants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1,
            "siapa nama guru Fiqih antum?",

            "Ustadz Fikry",
            " Ustadz Gaoz",
            "Ustaz Umam",
            "Pa jidni",
            "Habib hidayatullah",
            1
        )
        questionsList.add(que1)
        // 2
        val que2 = Question(
            2, "siapa pencipta lagu indonesia raya?",

            "habib",
            "muhammad",
            "wr supratman",
            "bu macan",
            "pa tato",
            3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Siapa nama asli pa tato?",

            "ronal",
            "Tato",
            "abeng",
            "ahmad",
            "yanto",
            4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Siapa yang Membuat aplikasi ini?",

            "Muhammad",
            "Hapis",
            "Habib",
            "Kamu",
            "hapis habib muhammad benar",
            5
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Bagaimana Cara menghilangkan Hadast kecil",

            "Kake busnhin",
            "Berwudu atau tayamum",
            "mandi wajib",
            "Sholat",
            "Zakat",
            2
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Bagaimana cara menghilangkan hadast besar?",

            "Mandi wajib",
            "Tayamum",
            "berenang",
            "menghilang ",
            "gatau",
            1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Kapan Di turun kan nya al quran",

            "Bulan Ramadhan",
            "Bulan rajab",
            "Bulan syaban",
            "Bulan jumadil ula",
            "Bulan apa?",
            1
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Berapa jumlah rokaat sholat isya",

            "1",
            "2",
            "3",
            "4",
            "5",
            4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Hukum  sholat adalah?",

            "wajib",
            "mubah",
            "makruh",
            "gatau",
            "lupa",
            2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "apa itu ujikom?",

            "Ujian Kompentensi",
            "Ujian Komputer",
            "Ujian Komplek",
            "Ujian Komati",
            "Ujian Komeng",
            1
        )

        questionsList.add(que10)
        return questionsList

    }
}