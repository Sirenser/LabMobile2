package com.example.labmobile.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.labmobile.activity.FirstFragment
import com.example.labmobile.activity.SecondFragment
import com.example.labmobile.activity.ThirdFragment

class ListContainerAdapter(fragment: Fragment) :
    FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> ThirdFragment()
            1 -> FirstFragment()
            else -> SecondFragment()
        }
    }
}