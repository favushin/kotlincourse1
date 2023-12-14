package com.example.myfirstapp

import android.os.Bundle
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.example.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            nvMenu.setNavigationItemSelectedListener {
                when(it.itemId) {
                    R.id.item_1 -> {
                        Toast.makeText(this@MainActivity, "Item 1", Toast.LENGTH_SHORT).show()
                    }
                    R.id.item_2 -> {
                        Toast.makeText(this@MainActivity, "Item 2", Toast.LENGTH_SHORT).show()
                    }
                }
                drawer.closeDrawer(GravityCompat.START)
                true
            }

            button.setOnClickListener {
                drawer.openDrawer(GravityCompat.START)
            }
        }
    }
}