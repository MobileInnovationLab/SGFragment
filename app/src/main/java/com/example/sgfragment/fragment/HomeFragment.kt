package com.example.sgfragment.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager

import com.example.sgfragment.R
import com.example.sgfragment.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import org.jetbrains.anko.find

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_home, container, false)

        val tab_layout: TabLayout = v.find(R.id.tab_layout)
        val view_pager: ViewPager = v.find(R.id.view_pager)

        // TODO: Setup all child fragment into view_pager. Call setupViewPager with parameter view_pager.

        // TODO: Set the view_pager into tab_layout using tab_layout.setupWithViewPager(view_pager)

        return v
    }

    private fun setupViewPager(view_pager: ViewPager) {
        val viewPagerAdapter = ViewPagerAdapter(childFragmentManager)
        // TODO: Add all child fragment into viewPagerAdapter
        // TODO: Call addFragment function from viewPagerAdapter with parameter fragment and title
        // TODO: viewPagerAdapter.addFragment(HomeOneFragment(), "ONE")
        view_pager.adapter = viewPagerAdapter
    }
}
