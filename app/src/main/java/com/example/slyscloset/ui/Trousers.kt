package com.example.slyscloset.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.slyscloset.databinding.ActivityTrousersBinding

class Trousers : AppCompatActivity() {
    private lateinit var binding: ActivityTrousersBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityTrousersBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}