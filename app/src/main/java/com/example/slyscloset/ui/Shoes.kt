package com.example.slyscloset.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.slyscloset.databinding.ActivityShoesBinding

class Shoes : AppCompatActivity() {
    private lateinit var binding: ActivityShoesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        binding = ActivityShoesBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.ivBack.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }

        binding.addToCart.setOnClickListener {
            startActivity(Intent(this, Order::class.java))
        }

        binding.addToCart1.setOnClickListener {
            startActivity(Intent(this, Order::class.java))
        }

        binding.addToCart2.setOnClickListener {
            startActivity(Intent(this, Order::class.java))
        }

        binding.addToCart3.setOnClickListener {
            startActivity(Intent(this, Order::class.java))
        }

        binding.addToCart4.setOnClickListener {
            startActivity(Intent(this, Order::class.java))
        }


        binding.addToCart5.setOnClickListener {
            startActivity(Intent(this, Order::class.java))
        }
    }
}