package com.example.databetweenfragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.example.databetweenfragments.R
import com.example.databetweenfragments.viewModel.ViewModelCommunicator
import com.google.android.material.textview.MaterialTextView

class Fragment003 : Fragment() {

    /**
     * NOTE:
     * ▬ CHAMA A CLASSE VIEWMODEL.
     */

    private val viewModelCommunicator: ViewModelCommunicator by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_003, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       receiveDataModel()
    }

    private fun receiveDataModel(){

        /**
         * NOTE:
         * ▬ RECEBE OS DADOS DE CPF 004 + E POPULA A TEXTVIEW.
         */

        val textViewCpf001 =
            view?.findViewById<MaterialTextView>(R.id.txtVw_cpfNumber001_fragment003_id)

        viewModelCommunicator.cpf001Fragment003.observe(viewLifecycleOwner) {
            if (textViewCpf001 != null) {
                textViewCpf001.text = it
            }
        }

        val textViewCpf005 =
            view?.findViewById<MaterialTextView>(R.id.txtVw_cpfNumber005_fragment003_id)

        viewModelCommunicator.cpf005Fragment003.observe(viewLifecycleOwner) {
            if (textViewCpf005 != null) {
                textViewCpf005.text = it
            }
        }
    }
}


