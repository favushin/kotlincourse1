package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
//    var boolean : Boolean = true
//    var char : Char = 'A'
//    var string : String = "ABC"
    var tvTest : TextView? = null // or lateinit var tvTest : TextView
    lateinit var bTest : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvTest = findViewById(R.id.tvTest)
        tvTest?.text = "text is changed"

        bTest = findViewById(R.id.bTest)
        bTest.setOnClickListener{
            tvTest?.text = "this works"
        }
    }

    override fun onPause() {
        super.onPause()
        tvTest?.text = "paused"
    }
}