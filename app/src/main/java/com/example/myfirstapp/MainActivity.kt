package com.example.myfirstapp

import android.os.Bundle
import android.os.CountDownTimer
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private var timer: CountDownTimer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            buttonStart.setOnClickListener {
                startCountDownTimer(20000)
            }
        }
    }

    private fun startCountDownTimer(timeMillis: Long) {
        timer?.cancel()
        timer = object : CountDownTimer(timeMillis, 1000) {
            override fun onTick(timeM: Long) {
                binding.tvTimer.text = timeM.toString()
            }

            override fun onFinish() {
                binding.tvTimer.text = "Finish"
            }
        }.start()
    }
}