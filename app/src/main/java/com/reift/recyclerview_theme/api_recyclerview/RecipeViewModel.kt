package com.reift.recyclerview_theme.api_recyclerview

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.reift.recyclerview_theme.api_recyclerview.network.ApiConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RecipeViewModel: ViewModel() {

    var recipeResponse = MutableLiveData<RecipeResponse>()

    fun getRecipeListByPage(page: String){
        ApiConfig.getApiService().getRecipeList(page)
            .enqueue(object : Callback<RecipeResponse> {
                override fun onResponse(
                    call: Call<RecipeResponse>,
                    response: Response<RecipeResponse>
                ) {
                    if (response.isSuccessful) recipeResponse.postValue(response.body())
                }

                override fun onFailure(call: Call<RecipeResponse>, t: Throwable) {
                }
            })
    }
}