package com.example.databetweenfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity(), Communicator {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Execute Functions: */
        titleCenterActionBar()
        toGoToFragment()
    }

    private fun toGoToFragment(){
        val fragment001 = Fragment001()
        supportFragmentManager.beginTransaction().replace(R.id.container_id, fragment001).commit()
    }

    override fun passDataCommunicator(passText: String) {
        val bundle = Bundle()
        bundle.putString("input_txt", passText)

        val transaction = this.supportFragmentManager.beginTransaction()
        val frag2 = Fragment002()
        frag2.arguments = bundle

        transaction.replace(R.id.container_id, frag2)
        transaction.addToBackStack(null)
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        transaction.commit()
    }

    private fun titleCenterActionBar() {
        supportActionBar?.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar?.setCustomView(R.layout.component_center_title)
    }
}