package com.isjieman.memberdata.Activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.isjieman.memberdata.MainActivity
import com.isjieman.memberdata.R
import com.isjieman.memberdata.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var loginBinding: ActivityLoginBinding

    companion object{
        fun getLaunchService (from: Context) = Intent(from, LoginActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(loginBinding.root)
        supportActionBar?.hide()
        loginBinding.btnSignInLogin.setOnClickListener(this)
    }



    override fun onClick(p0: View) {
        when(p0.id){
            R.id.btnSignInLogin -> startActivity(MainActivity.getLaunchService(this))
        }

    }
}