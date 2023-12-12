package com.example.myfirstapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingView : ActivityMainBinding

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        bindingView = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingView.root)

        var array = arrayOf(1, 2, 3)
        var array2 : Array<Int> = arrayOf(1, 2, 3)
        var array3 : IntArray = intArrayOf(1, 2, 3)
        var array4 = intArrayOf(1, 2, 3)

        var array5 = IntArray(3)
        var array6 = arrayOfNulls<Int>(3)
        var array7 = emptyArray<Int>()

        array.contentToString()
        array.reverse()

        var list = listOf(1, 2, 3)
        var arrayList = arrayListOf(1, 2, 3)
        arrayList.add(4)
        arrayList.removeAt(3)
        arrayList.addAll(list)

        Log.d("MyLog", "output: $arrayList")
    }
}
