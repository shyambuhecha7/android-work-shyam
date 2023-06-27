package com.example.onecloudandroid.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.onecloudandroid.R
import com.example.onecloudandroid.databinding.RecyclerItemBinding

class RecycleViewAdapter(val list: MutableList<ItemData>) :
    RecyclerView.Adapter<RecycleViewAdapter.ViewHolder>() {

    class ViewHolder(private val binding: RecyclerItemBinding) : RecyclerView.ViewHolder(binding.root) {
      fun bind(data: ItemData) {
          binding.data = data
          binding.executePendingBindings()
      }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
      RecyclerItemBinding.inflate( LayoutInflater.from(parent.context),parent,false)
    )

    override fun getItemCount(): Int {
       return list.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bind(data = list[position])
    }


}

