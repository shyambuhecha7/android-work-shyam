package com.example.onecloudandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.onecloudandroid.databinding.ActivityHomeBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
class HomeActivity : AppCompatActivity() {
    lateinit var navController: NavController
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_home)


        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navigationController = navHostFragment.navController
        binding.bottomNavigationView.setupWithNavController(navigationController)

        navigationController.addOnDestinationChangedListener { controller, destination, arguments ->
            val currentFragment = navHostFragment.childFragmentManager.primaryNavigationFragment
            currentFragment?.let {
//                binding.toolbar.menu.clear()
//                binding.toolbar.inflateMenu(it)
                binding.tbName.text = destination.label.toString()
            }
        }
    }
}