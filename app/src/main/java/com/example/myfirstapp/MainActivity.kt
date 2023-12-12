package com.example.myfirstapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var user = User("Adilet", "54565", 20)
        var user2 = User("Yermek", "65581", 32)

        user.addAge(10)
        user2.addAge(5)

        user.printUserInfo()
    }
}