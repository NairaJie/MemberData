package com.isjieman.memberdata.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.isjieman.memberdata.MainActivity
import com.isjieman.memberdata.R
import com.isjieman.memberdata.databinding.FragmentAdd7Binding

class Add7Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bind = FragmentAdd7Binding.inflate(layoutInflater)

        bind.btnLeftSeventh.setOnClickListener{
            val intent = Intent(this@Add7Fragment.requireContext(), MainActivity::class.java)
            startActivity(intent)
        }

        return bind.root
    }


}