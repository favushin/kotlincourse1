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
    lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.bMessage.setOnClickListener {
            val resultValue = bindingClass.ptEnter.text.toString()
            when(resultValue) {
                "Yerlan" -> {
                    bindingClass.tvMessage.visibility = View.VISIBLE
                    bindingClass.tvMessage.text = "you are ceo,\n" + "take your 100000$"
                }
                "Adilet" -> {
                    bindingClass.tvMessage.visibility = View.VISIBLE
                    bindingClass.tvMessage.text = "you are engineer,\n" + "take your 12000$"
                }
                "Serik" -> {
                    bindingClass.tvMessage.visibility = View.VISIBLE
                    bindingClass.tvMessage.text = "you are waiter,\n" + "take your 1300$"
                }
                else -> {
                    bindingClass.tvMessage.visibility = View.VISIBLE
                    bindingClass.tvMessage.text = "you don't work in this corporation"
                }
            }
        }
    }
}