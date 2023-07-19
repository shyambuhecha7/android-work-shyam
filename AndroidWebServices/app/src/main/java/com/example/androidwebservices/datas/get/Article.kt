package com.example.androidwebservices.datas.get

import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop

data class Article(
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val source: Source,
    val title: String,
    val url: String,
    val urlToImage: String
)
@BindingAdapter("imageUrl")
fun setImage(imageView: ImageView,urlToImage: String?){
    urlToImage?.let {
        val imgUri = urlToImage.toUri().buildUpon().scheme("https").build()
        Glide.with(imageView).load(urlToImage).transform(CenterCrop()).into(imageView)
    }
}
