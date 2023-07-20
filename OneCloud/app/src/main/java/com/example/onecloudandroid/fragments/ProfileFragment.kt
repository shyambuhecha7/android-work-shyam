package com.example.onecloudandroid.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.onecloudandroid.activities.MainActivity
import com.example.onecloudandroid.databinding.FragmentProfileBinding

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
        val sharedPreferences =
            this.activity?.getSharedPreferences("loginData", Context.MODE_PRIVATE)
        binding.tvEmail.text = sharedPreferences?.getString("emailData", "Guest")

        var userName = binding.tvEmail.text.removeSuffix("@gmail.com").toString()
        userName = "@$userName"
        binding.profileName.text = userName

        binding.item1.title = "Status"
        binding.item1.description = "Available"

        binding.item2.title = "Status Message"
        binding.item2.description = "The unseen of spending three years at Pixelgra"

        binding.item3.title = "Meeting ID"
        binding.item3.description = "Generate Automatically"

        binding.item4.title = "Person Info"

        binding.item5.title = "Help"

        //MARK:Logout and remove sharepreference data
        binding.logout.root.setOnClickListener {

            val sharedPreference =
                this.activity?.getSharedPreferences("loginData", Context.MODE_PRIVATE)
            val editor = sharedPreference?.edit()
            editor?.remove("passwordData")
            editor?.remove("emailData")
            editor?.clear()
            editor?.apply()

            val intent = Intent(activity, MainActivity::class.java)
            activity?.startActivity(intent)


        }
    }
}


