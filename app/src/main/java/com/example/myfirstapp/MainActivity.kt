package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MyLog", "onCreate1")
        Log.d("MyLog", "onCreate2")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MyLog", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MyLog", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MyLog", "onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyLog", "onDestroy")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyLog", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MyLog", "onRestart")
    }
}