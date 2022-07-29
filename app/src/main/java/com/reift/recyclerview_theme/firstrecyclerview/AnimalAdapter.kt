package com.reift.recyclerview_theme.firstrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.reift.recyclerview_theme.databinding.ItemAnimalBinding

class AnimalAdapter(context: Context): RecyclerView.Adapter<AnimalAdapter.ViewHolder>() {
    val listAnimal = AnimalModel(context).getAnimalList()

    inner class ViewHolder(val binding: ItemAnimalBinding)
        : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= ViewHolder(
        ItemAnimalBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvName.text = listAnimal[position]
    }

    override fun getItemCount() = listAnimal.size


}