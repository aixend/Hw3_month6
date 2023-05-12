package com.example.hw3_month6.ui.viewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw3_month6.BaseFragment
import com.example.hw3_month6.R
import com.example.hw3_month6.databinding.FragmentButtonBinding
import com.example.hw3_month6.databinding.FragmentHistoryBinding


class HistoryFragment : BaseFragment<FragmentHistoryBinding>() {
    override fun inflateViewBinding(layoutInflater: LayoutInflater): FragmentHistoryBinding {
        return FragmentHistoryBinding.inflate(layoutInflater)
    }

    override fun initListener() {
        super.initListener()
        viewModel.operation.observe(viewLifecycleOwner){
            binding.tvHistory.text = it
        }

    }




}