package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.myfirstapp.constances.Constance
import com.example.myfirstapp.databinding.ActivityMainBinding

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val message = intent.getStringExtra("key2")
        bindingClass.tvMessageMain.text = message
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 100 && resultCode == RESULT_OK && data != null) {
            bindingClass.tvMessageMain.text = data.getStringExtra("key2")
        }
    }


    fun onClickGoTest1(view : View) {
        val intent = Intent(this, TestActivity1::class.java)
        intent.putExtra("key", "What is your name?")
        startActivityForResult(intent, 100)
    }
}