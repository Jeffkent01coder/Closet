package com.example.slyscloset.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.slyscloset.databinding.ActivitySocksSlidesBinding

class SocksSlides : AppCompatActivity() {
    private lateinit var binding: ActivitySocksSlidesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySocksSlidesBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.ivBack.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
    }
}