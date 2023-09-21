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

class Fragment001 : Fragment() {

    /**
     * NOTE:
     * ▬ CRIA INTÂNCIA DA CLASSE VIEW MODEL.
     */

    private val viewModelCommunicator: ViewModelCommunicator by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_001, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        receiveDataViewModel()
    }

    private fun receiveDataViewModel() {

        /**
         * NOTE:
         * ▬ RECEBE OS DADOS DE CPF 001 + CPF 002 + CPF 003 E POPULA AS TEXTVIEWS.
         */

        val textViewCpf001 =
            view?.findViewById<MaterialTextView>(R.id.txtVw_cpfNumber001_fragment001_id)

        viewModelCommunicator.cpf001Fragment001.observe(viewLifecycleOwner) {
            if (textViewCpf001 != null) {
                textViewCpf001.text = it
            }
        }

        val textViewCpf002 =
            view?.findViewById<MaterialTextView>(R.id.txtVw_cpfNumber002_fragment001_id)
        viewModelCommunicator.cpf002Fragment001.observe(viewLifecycleOwner) {
            if (textViewCpf002 != null) {
                textViewCpf002.text = it
            }
        }

        val textViewCpf003 =
            view?.findViewById<MaterialTextView>(R.id.txtVw_cpfNumber003_fragment001_id)
        viewModelCommunicator.cpf003Fragment001.observe(viewLifecycleOwner) {
            if (textViewCpf003 != null) {
                textViewCpf003.text = it
            }
        }
    }
}