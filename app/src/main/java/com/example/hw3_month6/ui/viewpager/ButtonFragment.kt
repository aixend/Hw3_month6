package com.example.hw3_month6.ui.viewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw3_month6.BaseFragment
import com.example.hw3_month6.R
import com.example.hw3_month6.databinding.FragmentButtonBinding

class ButtonFragment : BaseFragment<FragmentButtonBinding>() {
    override fun inflateViewBinding(layoutInflater: LayoutInflater): FragmentButtonBinding {
        return FragmentButtonBinding.inflate(layoutInflater)
    }

    override fun initListener() {
        super.initListener()
        binding.increment.setOnClickListener {
            viewModel.increment()
        }
        binding.decrement.setOnClickListener {
            viewModel.decrement()
        }
    }


}