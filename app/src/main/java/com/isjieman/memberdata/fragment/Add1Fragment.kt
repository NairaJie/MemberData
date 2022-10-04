package com.isjieman.memberdata.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.isjieman.memberdata.MainActivity
import com.isjieman.memberdata.R
import com.isjieman.memberdata.databinding.FragmentAdd1Binding
import com.isjieman.memberdata.databinding.FragmentAdd7Binding

class Add1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add1, container, false)
        view.findViewById<View>(R.id.tvSelanjutnyafirst).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_add1Fragment_to_add2Fragment)
        }

        return view

//        val bind = FragmentAdd1Binding.inflate(layoutInflater)
//
//        bind.btnLeftFirst.setOnClickListener{
//            val intent = Intent(this@Add1Fragment.requireContext(), MainActivity::class.java)
//            startActivity(intent)
//        }
//
//        return bind


    }

}