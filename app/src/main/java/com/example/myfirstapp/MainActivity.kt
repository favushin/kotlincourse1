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
            val resultValue = bindingClass.ptEnter.text.toString().toInt()
            when(resultValue) {
                in 0..1000 -> {
                    bindingClass.tvMessage.visibility = View.VISIBLE
                    bindingClass.tvMessage.text = "you are newbie bloger"
                }
                in 1000..100000 -> {
                    bindingClass.tvMessage.visibility = View.VISIBLE
                    bindingClass.tvMessage.text = "you are middle bloger"
                }
                else -> {
                    bindingClass.tvMessage.visibility = View.VISIBLE
                    bindingClass.tvMessage.text = "you are popular bloger"
                }
            }
        }
    }
}