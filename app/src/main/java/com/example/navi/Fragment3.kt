package com.example.navi

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class Fragment3 : Fragment(R.layout.fragment_3) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.buttonBackToFragment1).setOnClickListener {
            findNavController().navigate(R.id.action_fragment3_to_fragment1)
        }
    }
}
