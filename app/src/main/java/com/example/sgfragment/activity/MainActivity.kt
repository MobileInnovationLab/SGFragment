package com.example.sgfragment.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.sgfragment.R
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
            when (menuItem.itemId) {
                R.id.menu_home -> {
                    // TODO: Load Home Fragment. Call loadFragment function with parameter HomeFragment()
                }
                R.id.menu_favorite -> {
                    // TODO: Load Favorite Fragment. Call loadFragment function with parameter FavoriteFragment()
                }
                R.id.menu_profile -> {
                    // TODO: Load Profile Fragment. Call loadFragment function with parameter ProfileFragment()
                }
            }
            true
        }

        // TODO: Load Home Fragment when MainActivity created. Call loadFragment function with parameter HomeFragment()
    }

    fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.commit()
    }
}
