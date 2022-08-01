package com.reift.recyclerview_theme.api_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.reift.recyclerview_theme.R
import com.reift.recyclerview_theme.api_recyclerview.network.ApiConfig
import com.reift.recyclerview_theme.databinding.ActivityApiBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ApiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityApiBinding
    private lateinit var viewModel: RecipeViewModel

    private var page = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityApiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(RecipeViewModel::class.java)

        viewModel.getRecipeListByPage(page.toString())
        viewModel.recipeResponse.observe(this){
            setUpRecyclerView(it)
        }

    }

    private fun setUpRecyclerView(it: RecipeResponse?) {
        binding.rvRecipe.apply {
            val mAdapter = ApiAdapter()
            layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            adapter = mAdapter
            mAdapter.setData(it?.results as List<ResultsItem>?)
        }
    }
}