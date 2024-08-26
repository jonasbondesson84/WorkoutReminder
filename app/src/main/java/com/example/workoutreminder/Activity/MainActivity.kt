package com.example.workoutreminder.Activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.workoutreminder.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNav: BottomNavigationView
    private lateinit var navHostFragment: NavHostFragment
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNav = findViewById(R.id.bottom_nav)
        navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        bottomNav.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.start_fragment -> {
                    navController.navigate(R.id.start_fragment)
                    true
                }
                R.id.workout_fragment -> {
                    navController.navigate(R.id.workout_fragment)
                    true
                }
                R.id.account_fragment -> {
                    navController.navigate(R.id.account_fragment)
                    true
                }
                else -> false
            }

        }
    }
}