package com.reift.recyclerview_theme.string_recyclerview

import android.content.Context
import com.reift.recyclerview_theme.R

class StringModel(val context: Context){
    fun getAnimalList(): Array<String> {
        return context.resources.getStringArray(R.array.animalList)
    }
}
