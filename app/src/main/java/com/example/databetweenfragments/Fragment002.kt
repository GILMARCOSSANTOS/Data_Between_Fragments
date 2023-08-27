package com.example.databetweenfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class Fragment002 : Fragment() {

    private var inputText: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_002, container, false)

       inputText = arguments?.getString("input_txt").toString()

        val outputTextView = rootView.findViewById<TextView>(R.id.outPut_TextView_id)
        outputTextView.text = inputText

        return rootView
    }
}