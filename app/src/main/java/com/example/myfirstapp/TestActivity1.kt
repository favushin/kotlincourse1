package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myfirstapp.databinding.ActivityTest1Binding

class TestActivity1 : AppCompatActivity() {
    lateinit var bindingClass : ActivityTest1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityTest1Binding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val message = intent.getStringExtra("key")
        bindingClass.tvMessage.text = message
    }

    fun onClickGoBack(view : View) {
        intent.putExtra("key2", bindingClass.ptAnswer.text.toString())
        setResult(RESULT_OK, intent)
        finish()
    }
}