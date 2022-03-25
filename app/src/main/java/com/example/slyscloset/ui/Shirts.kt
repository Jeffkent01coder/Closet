package com.example.slyscloset.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.slyscloset.databinding.ActivityShirtsBinding

class Shirts : AppCompatActivity() {
    private lateinit var binding: ActivityShirtsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityShirtsBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}