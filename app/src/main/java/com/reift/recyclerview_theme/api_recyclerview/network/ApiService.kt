package com.reift.recyclerview_theme.api_recyclerview.network

import com.reift.recyclerview_theme.api_recyclerview.RecipeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("/api/recipes/{page}")
    fun getRecipeList(
        @Path("page")
        page: String
    ): Call<RecipeResponse>
}