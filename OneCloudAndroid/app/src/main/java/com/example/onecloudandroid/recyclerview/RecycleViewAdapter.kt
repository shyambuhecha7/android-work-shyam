package com.example.onecloudandroid.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.onecloudandroid.databinding.RecyclerItemBinding

class RecycleViewAdapter(val lists: MutableList<ItemData>) :
    RecyclerView.Adapter<RecycleViewAdapter.ViewHolder>() {

    class ViewHolder(private val binding: RecyclerItemBinding) : RecyclerView.ViewHolder(binding.root) {
      fun bind(data: ItemData) {
          binding.data = data

      }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(

        RecyclerItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun getItemCount(): Int {
       return lists.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(lists[position])

    }
}

