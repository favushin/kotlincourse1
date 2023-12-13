package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfirstapp.databinding.ActivityEditBinding

class EditActivity : AppCompatActivity() {
    lateinit var binding: ActivityEditBinding
    private var indexImage = 0
    private var idImage = R.drawable.plant1
    private val imageList = listOf(
        R.drawable.plant1,
        R.drawable.plant2,
        R.drawable.plant3,
        R.drawable.plant4,
        R.drawable.plant5
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initButtons()
    }

    private fun initButtons() = with(binding) {
        buttonNext.setOnClickListener {
            indexImage++
            if(indexImage > imageList.size - 1) indexImage = 0
            idImage = imageList[indexImage]
            imageView.setImageResource(idImage)
        }
        buttonDone.setOnClickListener {
            val plant = Plant(idImage, ptFlowerName.text.toString(), ptFlowerDesciption.text.toString())
            val editIntent  = Intent().apply {
                putExtra("plant", plant)
            }
            setResult(RESULT_OK, editIntent)
            finish()
        }
    }
}