package com.reift.recyclerview_theme.api_recyclerview

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class RecipeResponse(

	@field:SerializedName("results")
	val results: List<ResultsItem?>? = null,

) : Parcelable

@Parcelize
data class ResultsItem(

	@field:SerializedName("thumb")
	val thumb: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("key")
	val key: String? = null,

	@field:SerializedName("dificulty")
	val dificulty: String? = null
) : Parcelable
