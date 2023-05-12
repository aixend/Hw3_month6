package com.example.hw3_month6

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB: ViewBinding>: Fragment() {
    protected lateinit var viewModel: CounterViewModel
    protected lateinit var binding: VB
    protected abstract fun inflateViewBinding(layoutInflater: LayoutInflater): VB

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = inflateViewBinding(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewModel()
        initViews()
        initListener()
    }

    open fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity())[CounterViewModel::class.java]
    }
    open fun initListener() {}
    open fun initViews() {}
}
