package com.example.slyscloset.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.slyscloset.databinding.ActivityTshirtsBinding

class TShirts : AppCompatActivity() {
    private lateinit var binding: ActivityTshirtsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityTshirtsBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}