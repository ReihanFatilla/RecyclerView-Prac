package com.reift.recyclerview_theme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.reift.recyclerview_theme.databinding.ActivityMainBinding
import com.reift.recyclerview_theme.firstrecyclerview.FirstActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRecyclerview.setOnClickListener {
            startActivity(Intent(this, FirstActivity::class.java))
        }
    }
}