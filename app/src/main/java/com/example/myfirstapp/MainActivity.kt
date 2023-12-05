package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding

    val a = 324
    val b = 34

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.buttonPlus.setOnClickListener {
            val result = a + b
            bindingClass.textViewResult.text = result.toString()
        }

        bindingClass.buttonMinus.setOnClickListener {
            val result = a - b
            bindingClass.textViewResult.text = result.toString()
        }

        bindingClass.buttonMultiply.setOnClickListener {
            val result = a * b
            bindingClass.textViewResult.text = result.toString()
        }
    }
}