package com.example.hw3_month6

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {
    private var count = 0
    private var plus = ""

    val counter = MutableLiveData<String>()
    val operation = MutableLiveData<String>()

    fun increment(){
        ++count
        counter.value= count.toString()
        plus= "\n + $plus"
        operation.value = plus
    }
    fun decrement(){
        --count
        counter.value= count.toString()
        plus= "\n - $plus"
        operation.value = plus
    }


}