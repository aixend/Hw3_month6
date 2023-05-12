package com.example.hw3_month6.ui.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class AdapterVP(fm: FragmentActivity): FragmentStateAdapter(fm)
{
    override fun getItemCount(): Int = 3


    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> ButtonFragment()
            1 -> ResultFragment()
            3 -> HistoryFragment()
            else -> ButtonFragment()
        }
    }

}