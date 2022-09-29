package com.isjieman.memberdata.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.isjieman.memberdata.R

class Add6Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add6, container, false)
        val button = view.findViewById<Button>(R.id.tvSelanjutnyaSixth)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_add6Fragment_to_add7Fragment)
        }
        return view

    }

}