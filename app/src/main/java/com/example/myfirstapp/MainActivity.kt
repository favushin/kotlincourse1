package com.example.myfirstapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Bottom Navigation Bar"

        binding.bottomMenu.selectedItemId = R.id.draw
        binding.bottomMenu.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.draw -> {
                    Toast.makeText(this, "Draw", Toast.LENGTH_SHORT).show()
                }
                R.id.attach_file -> {
                    Toast.makeText(this, "Attach File", Toast.LENGTH_SHORT).show()
                }
                R.id.mark -> {
                    Toast.makeText(this, "Mark", Toast.LENGTH_SHORT).show()
                }
                R.id.done -> {
                    Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show()
                }
            }
            true
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            android.R.id.home -> finish()
            R.id.search -> {
                Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show()
            }

            R.id.sync -> {
                Toast.makeText(this, "Sync", Toast.LENGTH_SHORT).show()
            }

            R.id.save -> {
                Toast.makeText(this, "Save", Toast.LENGTH_SHORT).show()
            }

            R.id.delete -> {
                Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show()
            }
        }
        return true
    }
}