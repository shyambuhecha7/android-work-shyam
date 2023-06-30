package com.example.onecloudandroid.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.ViewPager2
import com.example.onecloudandroid.MyPagerAdapter
import com.example.onecloudandroid.R
import com.example.onecloudandroid.databinding.ActivityTabBinding
import com.example.onecloudandroid.databinding.FragmentChatBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class ChatFragment : Fragment() {
    lateinit var binding: FragmentChatBinding
    lateinit var adapter: MyPagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =  DataBindingUtil.inflate(inflater,
            R.layout.fragment_chat, container, false)
        adapter = MyPagerAdapter(requireActivity())
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        TabLayoutMediator(binding.tablayout,binding.viewpager2) {tab,postion ->

            when(postion){
                0 -> tab.text = "Home"
                1 -> tab.text = "Call"
                else -> tab.text = "Home"
            }
        }
    }
}