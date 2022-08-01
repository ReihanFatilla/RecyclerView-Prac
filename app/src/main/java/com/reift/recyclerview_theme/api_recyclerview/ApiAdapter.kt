package com.reift.recyclerview_theme.api_recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.reift.recyclerview_theme.databinding.ItemApiBinding
import com.reift.recyclerview_theme.databinding.ItemJsonBinding

class ApiAdapter(): RecyclerView.Adapter<ApiAdapter.ApiViewHolder>() {

    var listRecipe = ArrayList<ResultsItem>()

    fun setData(listRecipe: List<ResultsItem>?) {
        if (listRecipe == null) return
        this.listRecipe.clear()
        this.listRecipe.addAll(listRecipe)
    }

    class ApiViewHolder(val binding: ItemApiBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)=
        ApiViewHolder(ItemApiBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: ApiViewHolder, position: Int) {
        holder.binding.apply {
            tvTitle.text = listRecipe[position].title
            Glide.with(holder.itemView.context)
                .load(listRecipe[position].thumb)
                .into(imgRecipe)
        }
    }

    override fun getItemCount() = listRecipe.size
}