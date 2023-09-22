package com.example.databetweenfragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.databetweenfragments.R
import com.example.databetweenfragments.viewModel.ViewModelCommunicator
import com.google.android.material.textview.MaterialTextView

class Fragment002 : Fragment() {

    /**
     * NOTE:
     * ▬ CHAMA A CLASSE VIEWMODEL.
     */

    /* Dependência = implementation 'androidx.fragment:fragment-ktx:1.1.0' */
    private val viewModelCommunicator: ViewModelCommunicator by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_002, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

     receiveDataViewModelXXX()
    }

    private fun receiveDataViewModelXXX() {

        /**
         * NOTE:
         * ▬ RECEBE OS DADOS DE CPF 004 + E POPULA A TEXTVIEW.
         */

        val textViewCpf004 =
            view?.findViewById<MaterialTextView>(R.id.txtVw_cpfNumber_fragment002_id)

        viewModelCommunicator.keyCpf004Fragment002.observe(viewLifecycleOwner) {
            if (textViewCpf004 != null) {
                textViewCpf004.text = it
            }
        }
    }
}