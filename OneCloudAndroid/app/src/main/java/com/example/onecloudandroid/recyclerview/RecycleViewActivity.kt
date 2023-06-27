package com.example.onecloudandroid.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager.*
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.onecloudandroid.R
import com.example.onecloudandroid.databinding.ActivityRecycleViewBinding

class RecycleViewActivity : AppCompatActivity() {
    lateinit var binding : ActivityRecycleViewBinding
    lateinit var listOfItems : MutableList<ItemData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_recycle_view)

        listOfItems.add(ItemData("Item - 1"))
        listOfItems.add(ItemData("Item - 2"))
        listOfItems.add(ItemData("Item - 3"))
        listOfItems.add(ItemData("Item - 4"))
        listOfItems.add(ItemData("Item - 5"))
        listOfItems.add(ItemData("Item - 6"))
        listOfItems.add(ItemData("Item - 7"))

        binding.recycleView.layoutManager = LinearLayoutManager(this)
        binding.recycleView.adapter = RecycleViewAdapter(listOfItems)
    }
}

