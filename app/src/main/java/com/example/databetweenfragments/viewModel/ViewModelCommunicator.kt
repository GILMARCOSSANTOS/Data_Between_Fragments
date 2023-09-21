package com.example.databetweenfragments.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelCommunicator : ViewModel() {

    val data001 = MutableLiveData<String>()
    val data002 = MutableLiveData<String>()
    val data003 = MutableLiveData<String>()

    fun sendDataToFragment001(cpf1: String, cpf2: String, cpf3: String) {
        data001.value = cpf1
        data002.value = cpf2
        data003.value = cpf3
    }
}