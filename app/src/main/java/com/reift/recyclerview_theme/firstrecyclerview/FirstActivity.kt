package com.reift.recyclerview_theme.firstrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.reift.recyclerview_theme.R
import com.reift.recyclerview_theme.databinding.ActivityFirstBinding

class FirstActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        binding.rvAnimal.apply {
            setHasFixedSize(true)
            adapter = AnimalAdapter(this@FirstActivity)
            layoutManager = LinearLayoutManager(this@FirstActivity)
        }
    }
}