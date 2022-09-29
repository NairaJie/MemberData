package com.isjieman.memberdata

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.isjieman.memberdata.Activity.AddDataActivity
import com.isjieman.memberdata.Activity.ProfileActivity
import com.isjieman.memberdata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var mainBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        supportActionBar?.hide()
        mainBinding.btnAdd.setOnClickListener(this)
        mainBinding.btnProfile.setOnClickListener(this)
    }
    companion object{
        fun getLaunchService (from: Context) = Intent(from, MainActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
    }

    override fun onClick(p0: View) {
        when (p0.id){
            R.id.btnAdd -> startActivity(AddDataActivity.getLaunchService(this))
            R.id.btnProfile -> startActivity(ProfileActivity.getLaunchService(this))
        }


    }
}