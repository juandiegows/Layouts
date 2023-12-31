package com.example.layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var  binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            btnConstraint.setOnClickListener {
                startActivity(Intent(this@MainActivity, ConstraintLayoutActivity::class.java))
            }
            btnLinearLayout.setOnClickListener {
                startActivity(Intent(this@MainActivity, LinearLayoutActivity::class.java))
            }
            btnRelativeLayout.setOnClickListener {
                startActivity(Intent(this@MainActivity, FrameLayoutActivity::class.java))
            }
            btnFrameLayout.setOnClickListener {
                startActivity(Intent(this@MainActivity, FrameLayoutActivity::class.java))
            }
            btnGridLayout.setOnClickListener {
                startActivity(Intent(this@MainActivity, GridLayoutActivity::class.java))
            }

            btnTableLayout.setOnClickListener {
                startActivity(Intent(this@MainActivity, TableActivity::class.java))
            }
        }
    }
}