package com.example.onecloudandroid.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.onecloudandroid.R
import com.example.onecloudandroid.databinding.ActivityRecycleViewBinding
import com.example.onecloudandroid.databinding.FragmentCallBinding
import com.example.onecloudandroid.recyclerview.ItemData
import com.example.onecloudandroid.recyclerview.RecycleViewAdapter

class CallFragment : Fragment() {
    lateinit var binding : FragmentCallBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentCallBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recycleView.apply {

            val listOfItems : MutableList<ItemData> = mutableListOf()

            listOfItems.add(ItemData("Savannah Nguyen",R.drawable.avatar1,R.drawable.call,R.drawable.calendar,"30min 45sec","10Mar, 8:35AM"))
            listOfItems.add(ItemData("Robert Fox",R.drawable.avatar2,R.drawable.call,R.drawable.calendar,"30min 45sec","10Mar, 8:35AM"))
            listOfItems.add(ItemData("Kristin Watson",R.drawable.avatar3,R.drawable.greencall,R.drawable.calendar,"30min 45sec","10Mar, 8:35AM"))
            listOfItems.add(ItemData("Marvin McKinney",R.drawable.avatar4,R.drawable.greencall,R.drawable.calendar,"30min 45sec","10Mar, 8:35AM"))
            listOfItems.add(ItemData("Floyd Miles",R.drawable.avatar5,R.drawable.orangecall,R.drawable.calendar,"30min 45sec","10Mar, 8:35AM"))
            listOfItems.add(ItemData("Kathryn Murphy",R.drawable.avatar6,R.drawable.call,R.drawable.calendar,"30min 45sec","10Mar, 8:35AM"))
            listOfItems.add(ItemData("Wade Warren",R.drawable.avatar7,R.drawable.greencall,R.drawable.calendar,"30min 45sec","10Mar, 8:35AM"))
            listOfItems.add(ItemData("Cameron Williamson",R.drawable.avatar8,R.drawable.call,R.drawable.calendar,"30min 45sec","10Mar, 8:35AM"))
            binding.recycleView.layoutManager = LinearLayoutManager(activity)
            binding.recycleView.adapter = RecycleViewAdapter(listOfItems)
        }
    }



}