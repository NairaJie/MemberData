package com.isjieman.memberdata.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.isjieman.memberdata.R


class Add2Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add2, container, false)

        view.findViewById<View>(R.id.tvSelanjutnyaSecond).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_add2Fragment_to_add3Fragment)
        }
//        val button = view.findViewById<Button>(R.id.tvSelanjutnyaSecond)
//        button.setOnClickListener {
//            findNavController().navigate(R.id.action_add2Fragment_to_add3Fragment)
//        }

        return view

    }

}