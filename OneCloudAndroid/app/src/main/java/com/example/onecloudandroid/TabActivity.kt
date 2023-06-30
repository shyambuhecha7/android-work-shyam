package com.example.onecloudandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.ViewPager2
import com.example.onecloudandroid.databinding.ActivityTabBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class TabActivity : AppCompatActivity() {
    lateinit var binding: ActivityTabBinding
    lateinit var adapter: MyPagerAdapter

    lateinit var viewPager2: ViewPager2
    lateinit var tabLayout: TabLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_tab)
        setContentView(binding.root)


        tabLayout = binding.tablayout
        viewPager2 = binding.viewpager2

        binding.viewpager2.adapter = MyPagerAdapter(this)

        TabLayoutMediator(tabLayout,viewPager2) {tab,postion ->

            when(postion){
                0 -> tab.text = "Home"
                1 -> tab.text = "Call"
                else -> tab.text = "Home"
            }
        }.attach()
    }
}