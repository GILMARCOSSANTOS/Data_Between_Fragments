package com.example.databetweenfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText


class Fragment001 : Fragment() {

    private lateinit var communicator: Communicator

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_001, container, false)

        communicator = requireActivity() as Communicator

        val enterBtn = rootView.findViewById<Button>(R.id.enter_btn_id)
        val inputEditText = rootView.findViewById<EditText>(R.id.input_editText_id)
        enterBtn.setOnClickListener {
            communicator.passDataCommunicator(inputEditText.text.toString())
        }

        return rootView
    }
}