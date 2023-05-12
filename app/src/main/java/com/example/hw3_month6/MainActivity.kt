package com.example.hw3_month6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw3_month6.databinding.ActivityMainBinding
import com.example.hw3_month6.ui.viewpager.AdapterVP

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter : AdapterVP
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter= AdapterVP(this)
        binding.viewPager2.adapter = adapter
    }
}