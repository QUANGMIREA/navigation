package com.example.navi

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class Fragment2 : Fragment(R.layout.fragment_2) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.buttonToFragment3).setOnClickListener {
            findNavController().navigate(R.id.action_fragment2_to_fragment3)
        }
    }

}
