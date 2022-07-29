package com.reift.recyclerview_theme.object_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.reift.recyclerview_theme.databinding.ActivityObjectBinding

class ObjectActivity : AppCompatActivity() {
    private lateinit var binding: ActivityObjectBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityObjectBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        binding.rvAnimal.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = ObjectAdapter()
        }
    }
}