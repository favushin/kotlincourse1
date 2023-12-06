package com.example.myfirstapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding

    val maxPeople = 35
    val currentPeople = 12

    val x = 5
    val y = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.buttonPlus.setOnClickListener {
            if (maxPeople >= currentPeople) {
                bindingClass.textViewResult.text = "$currentPeople is ok"
                bindingClass.textViewResult.setBackgroundColor(Color.GREEN)
                bindingClass.textViewResult.setTextColor(Color.BLACK)
            } else {
                bindingClass.textViewResult.text = "$currentPeople is not ok"
                bindingClass.textViewResult.setBackgroundColor(Color.RED)
                bindingClass.textViewResult.setTextColor(Color.BLACK)
            }
        }

        bindingClass.buttonMinus.setOnClickListener {
            when(5) {
                1 -> {
                    bindingClass.textViewResult.text = "number is one"
                }
                5 -> {
                    bindingClass.textViewResult.text = "number is five"
                }
            }
        }

        bindingClass.buttonMultiply.setOnClickListener {
            bindingClass.textViewResult.text =
                when(y / x) {
                    in 0..10 -> "the result is between zero and ten"
                    !in 0..10 -> "the result is not between zero and ten"
                    else -> "error"
                }
        }
    }
}