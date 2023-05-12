package com.example.hw3_month6.ui.viewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw3_month6.BaseFragment
import com.example.hw3_month6.R
import com.example.hw3_month6.databinding.FragmentResultBinding

class ResultFragment : BaseFragment<FragmentResultBinding>() {

    override fun inflateViewBinding(layoutInflater: LayoutInflater): FragmentResultBinding {
       return FragmentResultBinding.inflate(layoutInflater)
    }

    override fun initViews() {
        viewModel.counter.observe(viewLifecycleOwner){
            binding.tvCount.text = it.toString()

        }
    }

}