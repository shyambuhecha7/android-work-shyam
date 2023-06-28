package com.example.onecloudandroid.recyclerview

import android.os.Bundle
import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager.*
import com.example.onecloudandroid.R
import com.example.onecloudandroid.databinding.ActivityRecycleViewBinding

class RecycleViewActivity : AppCompatActivity() {
    lateinit var binding : ActivityRecycleViewBinding

    lateinit var adapter: RecycleViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_recycle_view)
        val listOfItems : MutableList<ItemData> = mutableListOf()

        listOfItems.add(ItemData("Savannah Nguyen",R.drawable.avatar1,R.drawable.call,R.drawable.calendar,"30min 45sec","10Mar, 8:35AM"))
        listOfItems.add(ItemData("Robert Fox",R.drawable.avatar2,R.drawable.call,R.drawable.calendar,"30min 45sec","10Mar, 8:35AM"))
        listOfItems.add(ItemData("Kristin Watson",R.drawable.avatar3,R.drawable.greencall,R.drawable.calendar,"30min 45sec","10Mar, 8:35AM"))
        listOfItems.add(ItemData("Marvin McKinney",R.drawable.avatar4,R.drawable.greencall,R.drawable.calendar,"30min 45sec","10Mar, 8:35AM"))
        listOfItems.add(ItemData("Floyd Miles",R.drawable.avatar5,R.drawable.orangecall,R.drawable.calendar,"30min 45sec","10Mar, 8:35AM"))
        listOfItems.add(ItemData("Kathryn Murphy",R.drawable.avatar6,R.drawable.call,R.drawable.calendar,"30min 45sec","10Mar, 8:35AM"))
        listOfItems.add(ItemData("Wade Warren",R.drawable.avatar7,R.drawable.greencall,R.drawable.calendar,"30min 45sec","10Mar, 8:35AM"))
        listOfItems.add(ItemData("Cameron Williamson",R.drawable.avatar8,R.drawable.call,R.drawable.calendar,"30min 45sec","10Mar, 8:35AM"))

        adapter = RecycleViewAdapter(listOfItems)
        binding.recycleView.adapter = adapter
        binding.recycleView.layoutManager = LinearLayoutManager(this)

    }


}

@BindingAdapter("android:src")
fun ImageView.setImageView(@DrawableRes id: Int) {
    setImageDrawable(
        ContextCompat.getDrawable(context, id)
    )
}