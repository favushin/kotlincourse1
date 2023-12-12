package com.example.myfirstapp

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapp.databinding.ActivityMainBinding
import kotlin.math.pow
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClickCalc(view: View) {
        if(!isFieldEmpty()) {
            val result = getString(R.string.result_info) + getResult()
            binding.tvResult.text = result
        }
    }

    private fun isFieldEmpty(): Boolean {
        binding.apply {
            if(tietInputA.text.isNullOrEmpty()) tietInputA.error = "Field must be filled!"
            if(tietInputB.text.isNullOrEmpty()) tietInputB.error = "Field must be filled!"
            return tietInputA.text.isNullOrEmpty() || tietInputB.text.isNullOrEmpty()
        }
    }

    private fun getResult(): String {
        val a: Double
        val b: Double
        binding.apply {
            a = tietInputA.text.toString().toDouble()
            b = tietInputB.text.toString().toDouble()
        }
        return sqrt(a.pow(2) + b.pow(2)).toString()
    }
}