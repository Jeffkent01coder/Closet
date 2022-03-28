package com.example.slyscloset.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.slyscloset.databinding.ActivityOrderBinding

class Order : AppCompatActivity() {
    private lateinit var binding: ActivityOrderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityOrderBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.ivBack.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }

        binding.btncancel.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }

        binding.btnsend.setOnClickListener {
            startActivity(Intent(this, Home::class.java ))
            Toast.makeText(this, "Payment made Successfully to SLY's CLOSET",Toast.LENGTH_LONG).show()
        }


    }
}