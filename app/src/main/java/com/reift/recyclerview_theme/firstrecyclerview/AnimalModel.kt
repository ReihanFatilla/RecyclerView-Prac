package com.reift.recyclerview_theme.firstrecyclerview

import android.content.Context
import com.reift.recyclerview_theme.R

class AnimalModel(val context: Context){
    fun getAnimalList(): Array<String> {
        return context.resources.getStringArray(R.array.animalList)
    }
}
