package com.example.myfirstapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    val spentMoney = arrayOf(200, 345, 1000, 8000, 10, 4566)
    val earnedMoney = arrayOf(300, 5500, 40, 6565, 1000, 1610)
    val resultArray = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val names = resources.getStringArray(R.array.names)

        for((index, name) in names.withIndex()) {
            resultArray.add("Name: $name / income: ${earnedMoney[index] - spentMoney[index]}")
            Log.d("MyLog", "${resultArray[index]}")
        }
    }
}