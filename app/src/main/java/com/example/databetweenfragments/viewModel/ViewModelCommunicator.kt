package com.example.databetweenfragments.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelCommunicator : ViewModel() {

    /**
     * NOTE:
     * ▬ CLASSE VIEWMODEL.
     **/

    val keyCpf001Fragment001 = MutableLiveData<String>()
    val KeyCpf002Fragment001 = MutableLiveData<String>()
    val KeyCpf003Fragment001 = MutableLiveData<String>()

    fun sendDataToFragment001(cpf1: String, cpf2: String, cpf3: String) {

        keyCpf001Fragment001.value = cpf1
        KeyCpf002Fragment001.value = cpf2
        KeyCpf003Fragment001.value = cpf3
    }

    val keyCpf004Fragment002 = MutableLiveData<String>()
    fun sendDataToFragment002(cpf4: String) {

        keyCpf004Fragment002.value = cpf4
    }

    val keyCpf001Fragment003 = MutableLiveData<String>()
    val keyCpf005Fragment003 = MutableLiveData<String>()
    fun sendDataToFragment003(cpf1: String, cpf5: String) {

        keyCpf001Fragment003.value = cpf1
        keyCpf005Fragment003.value = cpf5
    }
}