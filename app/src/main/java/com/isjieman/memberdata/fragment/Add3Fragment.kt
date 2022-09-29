package com.isjieman.memberdata.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.isjieman.memberdata.R


class Add3Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add3, container, false)
        val button = view.findViewById<Button>(R.id.tvSelanjutnyaThird)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_add3Fragment_to_add4Fragment)
        }
        return view

    }
}