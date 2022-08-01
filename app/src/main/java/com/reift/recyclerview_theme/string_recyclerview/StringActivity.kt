package com.reift.recyclerview_theme.string_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.reift.recyclerview_theme.databinding.ActivityFirstBinding

class StringActivity : AppCompatActivity() {
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
            adapter = StringAdapter(this@StringActivity)
            layoutManager = LinearLayoutManager(this@StringActivity)
        }
    }
}