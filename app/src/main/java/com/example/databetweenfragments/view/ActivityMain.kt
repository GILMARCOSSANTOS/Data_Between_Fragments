package com.example.databetweenfragments.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.example.databetweenfragments.R
import com.example.databetweenfragments.fragments.Fragment001
import com.example.databetweenfragments.fragments.Fragment002
import com.example.databetweenfragments.fragments.Fragment003
import com.example.databetweenfragments.viewModel.ViewModelCommunicator
import com.google.android.material.button.MaterialButton

class ActivityMain : AppCompatActivity() {

    /* Dependência = implementation 'androidx.fragment:fragment-ktx:1.1.0' */
    private val viewModelCommunicator: ViewModelCommunicator by viewModels()
    private lateinit var cpf001: String
    private lateinit var cpf002: String
    private lateinit var cpf003: String
    private lateinit var cpf004: String
    private lateinit var cpf005: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Execute Functions: */
       // cpf()
        toGoToFragments()
        titleCenterActionBar()
    }

    private fun toGoToFragments() {

        val fragment001 = Fragment001()
        val fragment002 = Fragment002()
        val fragment003 = Fragment003()

        val buttonFragment001 = findViewById<MaterialButton>(R.id.bttn_fragment001_id)
        val buttonFragment002 = findViewById<MaterialButton>(R.id.bttn_fragment002_id)
        val buttonFragment003 = findViewById<MaterialButton>(R.id.bttn_fragment003_id)

        buttonFragment001.setOnClickListener {
            if (buttonFragment001.isClickable) {

                val cpf001xxx = "sdsdsxxx001"
                viewModelCommunicator.setData(cpf001xxx)
//                viewModelCommunicator.setData(cpf002)
//                viewModelCommunicator.setData(cpf003)
//                viewModelCommunicator.setData(cpf004)
//                viewModelCommunicator.setData(cpf005)

                supportFragmentManager.beginTransaction()
                    .replace(R.id.containerFragment_activityMain_id, fragment001).commit()
            }
        }

        buttonFragment002.setOnClickListener {
            if (buttonFragment002.isClickable) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.containerFragment_activityMain_id, fragment002).commit()
            }
        }

        buttonFragment003.setOnClickListener {
            if (buttonFragment003.isClickable) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.containerFragment_activityMain_id, fragment003).commit()
            }
        }
    }


    private fun cpf() {
        cpf001 = "CPF 001 = 000.000.000-01"
        cpf002 = "CPF 002 = 000.000.000-02"
        cpf003 = "CPF 003 = 000.000.000-03"
        cpf004 = "CPF 003 = 000.000.000-04"
        cpf005 = "CPF 003 = 000.000.000-05"
    }

    private fun titleCenterActionBar() {
        supportActionBar?.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar?.setCustomView(R.layout.component_center_title)
    }
}