package com.reift.recyclerview_theme.json_recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.reift.recyclerview_theme.databinding.ItemJsonBinding
import com.reift.recyclerview_theme.object_recyclerview.ObjectData


class JsonAdapter(private val listJsonPahlawan: MutableList<JsonModel>): RecyclerView.Adapter<JsonAdapter.JsonViewHolder>() {

    class JsonViewHolder(val binding: ItemJsonBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = JsonViewHolder(
        ItemJsonBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: JsonViewHolder, position: Int) {
        holder.binding.apply {
            tvNamaPahlawan.text = listJsonPahlawan[position].nama
            tvNamaLengkap.text = listJsonPahlawan[position].namaLengkap
            Glide.with(holder.itemView.context)
                .load(listJsonPahlawan[position].image)
                .override(1000, 1000)
                .into(imagePahlawan)
        }
    }

    override fun getItemCount() = listJsonPahlawan.size
}