package com.reift.recyclerview_theme.object_recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.reift.recyclerview_theme.databinding.ItemObjectBinding

class ObjectAdapter: RecyclerView.Adapter<ObjectAdapter.ObjectViewHolder>() {

    private val listObjectAnimal = ObjectData.listObjectAnimal

    class ObjectViewHolder(val binding: ItemObjectBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ObjectViewHolder(
        ItemObjectBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ObjectViewHolder, position: Int) {
        holder.binding.apply {
            tvAnimal.text = listObjectAnimal[position].title
            Glide.with(holder.itemView.context)
                .load(listObjectAnimal[position].image)
                .override(1000, 1000)
                .into(imgAnimal)
        }
    }

    override fun getItemCount() = listObjectAnimal.size
}