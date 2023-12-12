package com.example.myfirstapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingView: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingView = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingView.root)

//        for (index in 0..9) {
//            Log.d("MyLog", "index: $index")
//        }

//        val listOfFruits = listOf("apple", "banana", "kiwi")
//        for(index in 0..2) {
//            Log.d("MyLog", "fruits: ${listOfFruits[index]}")
//        }

//        val listOfFruits = listOf("apple", "banana", "kiwi")
//        for(fruit in listOfFruits) {
//            Log.d("MyLog", "fruits: $fruit")
//        }

//        val listOfFruits = listOf("apple", "banana", "kiwi")
//        for((index, item) in listOfFruits.withIndex()) {
//            Log.d("MyLog", "index: $index | item: $item")
//        }

//        for(index in 10 downTo 4 step 3) {
//            Log.d("MyLog", "index: $index")
//        }

//        val listOfFruits = listOf("apple", "banana", "kiwi")
//        for(index in 1..listOfFruits.size - 1) {
//            Log.d("MyLog", "index: ${listOfFruits[index]}")
//        }

//        val listOfFruits = listOf("apple", "banana", "kiwi")
//        for(index in 1 until listOfFruits.size) {
//            Log.d("MyLog", "index: ${listOfFruits[index]}")
//        }

//        for(index in 0..100) {
//            if(index == 7) {
//                Log.d("MyLog", "index: $index")
//                break
//            }
//        }

//        val listOfFruits = listOf("apple", "banana", "kiwi")
//        listOfFruits.forEach {
//            Log.d("MyLog", "fruit: $it")
//        }

//        val listOfFruits = listOf("apple", "banana", "kiwi")
//        var fruit = ""
//        var index = 0
//        while(fruit != "banana") {
//            fruit = listOfFruits[index]
//            index++
//            Log.d("MyLog", "Fruit: $fruit")
//        }

//        do{
//            Log.d("MyLog", "Done")
//        } while(false)
    }
}