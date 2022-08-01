package com.reift.recyclerview_theme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.reift.recyclerview_theme.api_recyclerview.ApiActivity
import com.reift.recyclerview_theme.databinding.ActivityMainBinding
import com.reift.recyclerview_theme.json_recyclerview.JsonActivity
import com.reift.recyclerview_theme.string_recyclerview.StringActivity
import com.reift.recyclerview_theme.object_recyclerview.ObjectActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRecyclerview.setOnClickListener {
            startActivity(Intent(this, StringActivity::class.java))
        }

        binding.btnAnotherRecyclerview.setOnClickListener {
            startActivity(Intent(this, ObjectActivity::class.java))
        }

        binding.btnFurtherRecyclerview.setOnClickListener {
            startActivity(Intent(this, JsonActivity::class.java))
        }

        binding.btnHardestRecyclerview.setOnClickListener {
            startActivity(Intent(this, ApiActivity::class.java))
        }

    }

}