package com.example.databetweenfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.Button
import android.widget.EditText
import com.google.android.material.button.MaterialButton
import com.google.android.material.textview.MaterialTextView


class Fragment001 : Fragment() {

    private lateinit var communicator: Communicator
    private lateinit var textViewShow: MaterialTextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_001, container, false)

        /* Instância do Comunicador */
        communicator = requireActivity() as Communicator

        /* Envia o Conteúdo do TextView para o Comunicador */
        val butttonEnter = rootView.findViewById<MaterialButton>(R.id.enter_btn_id)
        val textViewShow = rootView.findViewById<MaterialTextView>(R.id.txtVw_showText_fragment001_id)
        butttonEnter.setOnClickListener {
            communicator.passDataCommunicator(textViewShow.text.toString())
        }

        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        globalVariablesScope()
        myText()
    }

    private fun myText(){
        textViewShow.text = "G... Santos"
    }

    private fun globalVariablesScope(): View {
        textViewShow = view?.findViewById(R.id.txtVw_showText_fragment001_id)!!
        return view as View
    }
}