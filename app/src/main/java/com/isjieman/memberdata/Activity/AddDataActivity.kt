package com.isjieman.memberdata.Activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.isjieman.memberdata.R

class AddDataActivity : AppCompatActivity() {
    private lateinit var navController: NavController

    companion object{
        fun getLaunchService (from: Context) = Intent(from, AddDataActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_data)
        supportActionBar?.hide()


        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.cvOnboard) as NavHostFragment
        navController = navHostFragment.navController

    }
}