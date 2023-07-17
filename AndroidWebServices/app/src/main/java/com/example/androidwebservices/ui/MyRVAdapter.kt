package com.example.androidwebservices.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidwebservices.databinding.NewsItemBinding
import com.example.androidwebservices.data.get.Article

class MyRVAdapter(private val list: List<Article>): RecyclerView.Adapter<MyRVAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
       NewsItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    )

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    class ViewHolder(val binding: NewsItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Article) {
            binding.data = data
            binding.executePendingBindings()
        }
    }
}