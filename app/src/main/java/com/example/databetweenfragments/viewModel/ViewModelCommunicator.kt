package com.example.databetweenfragments.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelCommunicator : ViewModel() {

    /**
     * NOTE:
     * ▬ CLASSE VIEWMODEL.
     */


    val cpf001Fragment001 = MutableLiveData<String>()
    val cpf002Fragment001 = MutableLiveData<String>()
    val cpf003Fragment001 = MutableLiveData<String>()
    val cpf004Fragment002 = MutableLiveData<String>()
    val cpf001Fragment003 = MutableLiveData<String>()
    val cpf005Fragment003 = MutableLiveData<String>()

    fun sendDataToFragment001(cpf1: String, cpf2: String, cpf3: String) {

        cpf001Fragment001.value = cpf1
        cpf002Fragment001.value = cpf2
        cpf003Fragment001.value = cpf3
    }

    fun sendDataToFragment002(cpf4: String) {

        cpf004Fragment002.value = cpf4
    }

    fun sendDataToFragment003(cpf1: String, cpf5: String) {

        cpf001Fragment003.value = cpf1
        cpf005Fragment003.value = cpf5
    }
}