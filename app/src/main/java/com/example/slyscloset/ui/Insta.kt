package com.example.slyscloset.ui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.slyscloset.databinding.ActivityInstaBinding

class Insta : AppCompatActivity() {
    private lateinit var binding: ActivityInstaBinding
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityInstaBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.web.settings.javaScriptEnabled = true
        binding.web.settings.loadWithOverviewMode = true
        binding.web.settings.useWideViewPort = true
        binding.web.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url!!)
                return false
            }
        }
        binding.web.loadUrl("https://www.instagram.com/gaga_sly/")
    }
}