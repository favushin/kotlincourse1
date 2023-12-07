package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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
            Log.d("MyLog", "${R.drawable.engineer}")
            val resultValue = bindingClass.ptEnter.text.toString()
            bindingClass.ivAvatar.visibility = View.VISIBLE
            when(resultValue) {
                Constance.ceo -> {
                    bindingClass.tvMessage.visibility = View.VISIBLE
                    val tempText = "you are ceo,\n" + "take your ${Constance.salaryOfCeo}$"
                    if(bindingClass.ptPassword.text.toString() == Constance.passwordOfCeo) {
                        bindingClass.tvMessage.text = tempText
                        bindingClass.ivAvatar.setImageResource(R.drawable.ceo)
                    }
                    else {
                        bindingClass.tvMessage.text = "Uncorrect password!"
                        bindingClass.ivAvatar.setImageResource(R.drawable.x)
                    }
                }

                Constance.engineer -> {
                    bindingClass.tvMessage.visibility = View.VISIBLE
                    val tempText = "you are engineer,\n" + "take your ${Constance.salaryOfEngineer}$"
                    if(bindingClass.ptPassword.text.toString() == Constance.passwordOfEngineer) {
                        bindingClass.tvMessage.text = tempText
                        bindingClass.ivAvatar.setImageResource(R.drawable.engineer)
                    }
                    else {
                        bindingClass.tvMessage.text = "Uncorrect password!"
                        bindingClass.ivAvatar.setImageResource(R.drawable.x)
                    }
                }

                Constance.waiter -> {
                    bindingClass.tvMessage.visibility = View.VISIBLE
                    val tempText = "you are waiter,\n" + "take your ${Constance.salaryOfWaiter}$"
                    if(bindingClass.ptPassword.text.toString() == Constance.passwordOfWaiter) {
                        bindingClass.tvMessage.text = tempText
                        bindingClass.ivAvatar.setImageResource(R.drawable.waiter)
                    }
                    else {
                        bindingClass.tvMessage.text = "Uncorrect password!"
                        bindingClass.ivAvatar.setImageResource(R.drawable.x)
                    }
                }

                else -> {
                    bindingClass.tvMessage.visibility = View.VISIBLE
                    val tempText = "you don't work in this corporation"
                    bindingClass.tvMessage.text = tempText
                    bindingClass.ivAvatar.setImageResource(R.drawable.x)
                }
            }
        }
    }
}