package com.example.sgfragment.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.sgfragment.R
import com.example.sgfragment.fragment.FavoriteFragment
import com.example.sgfragment.fragment.HomeFragment
import com.example.sgfragment.fragment.ProfileFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        supportActionBar.apply {
            title = "SG Fragment"
        }

        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            val currFragment = supportFragmentManager.findFragmentById(R.id.container)
            when (menuItem.itemId) {
                R.id.menu_home -> {
                    if (currFragment !is HomeFragment) {
                        loadFragment(HomeFragment())
                    }
                }
                R.id.menu_favorite -> {
                    if (currFragment !is FavoriteFragment) {
                        loadFragment(FavoriteFragment())
                    }
                }
                R.id.menu_profile -> {
                    if (currFragment !is ProfileFragment) {
                        loadFragment(ProfileFragment())
                    }
                }
            }
            false
        }
    }

    fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.commit()
    }
}
