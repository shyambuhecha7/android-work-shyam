package com.example.onecloudandroid.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.onecloudandroid.R
import com.example.onecloudandroid.databinding.FragmentCallBinding
import com.example.onecloudandroid.databinding.FragmentProfileBinding
import com.example.onecloudandroid.databinding.ProfileItemBinding

class ProfileFragment : Fragment() {
    lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.item1.title = "Status"
        binding.item1.description = "Available"

        binding.item2.title = "Status Message"
        binding.item2.description = "The unseen of spending three years at Pixelgra"

        binding.item3.title = "Meeting ID"
        binding.item3.description = "Generate Automatically"

        binding.item4.title = "Person Info"

        binding.item5.title = "Help"

    }
}


