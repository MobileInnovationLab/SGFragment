package com.example.sgfragment.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    private var fragmentList: MutableList<Fragment> = mutableListOf()
    private var fragmentTitleList: MutableList<String> = mutableListOf()

    override fun getItem(position: Int): Fragment {
        TODO("return fragmentList[position]")
    }

    override fun getCount(): Int {
        TODO("return fragmentList.size")
    }

    override fun getPageTitle(position: Int): String {
        TODO("return fragmentTitleList[position]")
    }

    fun addFragment(fragment: Fragment, title: String) {
        // TODO: Add fragment parameter to fragmentList using fragmentList.add(fragment)

        // TODO: Add title parameter to fragmentTitleList using fragmentTitleList.add(title)
    }
}
