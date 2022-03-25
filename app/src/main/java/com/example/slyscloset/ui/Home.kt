package com.example.slyscloset.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.slyscloset.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        binding = ActivityHomeBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.about.setOnClickListener {
            startActivity(Intent(this, About::class.java))
        }

        binding.orders.setOnClickListener {
            startActivity(Intent(this, Order::class.java))
        }

        binding.settings.setOnClickListener {
            startActivity(Intent(this, Settings::class.java))
        }

        binding.shirts.setOnClickListener {
            startActivity(Intent(this, Shirts::class.java))
        }

        binding.shoes.setOnClickListener {
            startActivity(Intent(this, Shoes::class.java))
        }

        binding.socksSlides.setOnClickListener {
            startActivity(Intent(this, SocksSlides::class.java))
        }

        binding.trousers.setOnClickListener {
            startActivity(Intent(this, Trousers::class.java))
        }

        binding.tshirts.setOnClickListener {
            startActivity(Intent(this, TShirts::class.java))
        }


    }
}