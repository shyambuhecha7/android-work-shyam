package com.example.onecloudandroid.tabbar

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyPagerAdapter(fragmentactivity: FragmentActivity) : FragmentStateAdapter(fragmentactivity) {

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FirstTabFragment()
            1 -> SecondTabFragment()
            else -> throw IllegalArgumentException("Invalid tab position")
        }
    }
}