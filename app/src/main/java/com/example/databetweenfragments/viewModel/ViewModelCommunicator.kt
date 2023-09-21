package com.example.databetweenfragments.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelCommunicator : ViewModel() {

    val data = MutableLiveData<String>()

    fun setData(newData: String) {
        data.value = newData
    }
}