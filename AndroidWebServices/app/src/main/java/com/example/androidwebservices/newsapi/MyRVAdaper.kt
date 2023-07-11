package com.example.androidwebservices.newsapi

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidwebservices.databinding.NewsItemBinding
import com.example.androidwebservices.newsapi.model.Article

class MyRVAdaper(list: ArrayList<Article>): RecyclerView.Adapter<MyRVAdaper.ViewHolder>() {
    val listOfArticle = list
    class ViewHolder(val binding: NewsItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Article) {
            binding.data = data
            binding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
       NewsItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    )

    override fun getItemCount(): Int {
        return listOfArticle.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listOfArticle[position])
    }
}