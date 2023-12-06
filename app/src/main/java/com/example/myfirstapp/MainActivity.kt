package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myfirstapp.constances.Constance
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
                Constance.ceo -> {
                    bindingClass.tvMessage.visibility = View.VISIBLE
                    val tempText = "you are ceo,\n" + "take your ${Constance.salaryOfCeo}$"
                    if(bindingClass.ptPassword.text.toString() == Constance.passwordOfCeo) {
                        bindingClass.tvMessage.text = tempText
                    }
                    else {
                        bindingClass.tvMessage.text = "Uncorrect password!"
                    }
                }

                Constance.engineer -> {
                    bindingClass.tvMessage.visibility = View.VISIBLE
                    val tempText = "you are engineer,\n" + "take your ${Constance.salaryOfEngineer}$"
                    if(bindingClass.ptPassword.text.toString() == Constance.passwordOfEngineer) {
                        bindingClass.tvMessage.text = tempText
                    }
                    else {
                        bindingClass.tvMessage.text = "Uncorrect password!"
                    }
                }

                Constance.waiter -> {
                    bindingClass.tvMessage.visibility = View.VISIBLE
                    val tempText = "you are waiter,\n" + "take your ${Constance.salaryOfWaiter}$"
                    if(bindingClass.ptPassword.text.toString() == Constance.passwordOfWaiter) {
                        bindingClass.tvMessage.text = tempText
                    }
                    else {
                        bindingClass.tvMessage.text = "Uncorrect password!"
                    }
                }

                else -> {
                    bindingClass.tvMessage.visibility = View.VISIBLE
                    val tempText = "you don't work in this corporation"
                    bindingClass.tvMessage.text = tempText
                }
            }
        }
    }
}