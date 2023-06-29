package com.example.onecloudandroid.tabbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.ViewPager2
import com.example.onecloudandroid.R
import com.example.onecloudandroid.databinding.ActivityTabBinding
import com.example.onecloudandroid.databinding.FragmentProfileBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class TabActivity : AppCompatActivity() {
    lateinit var binding: ActivityTabBinding
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_tab)
        setContentView(binding.root)

        val adapter = MyPagerAdapter(this)
        viewPager.adapter = adapter
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            // Set the tab text or icon for each position
            tab.text = when (position) {
                0 -> "Tab 1"
                1 -> "Tab 2"
                else -> throw IllegalArgumentException("Invalid tab position")
            }
        }.attach()

    }
}