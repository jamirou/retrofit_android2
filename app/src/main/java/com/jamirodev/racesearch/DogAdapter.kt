package com.jamirodev.racesearch

import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView

class DogAdapter(private val images: List<String>) : RecyclerView.Adapter<DogViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return DogViewHolder(layoutInflater.inflate(R.layout.item_dog ,parent, false))

    }

    override fun getItemCount():Int =  images.size


    @RequiresApi(Build.VERSION_CODES.S)
    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        val item = images[position]
        holder.bind(item)
    }
}