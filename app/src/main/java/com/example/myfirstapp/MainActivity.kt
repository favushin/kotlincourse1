package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var counter = 5
    var counter2 = 9

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvTest = findViewById<TextView>(R.id.tvTest)
        var counter3 = counter + counter2
        tvTest.text = counter3.toString()
    }

    fun onClickTest(view : View) {
    }
}