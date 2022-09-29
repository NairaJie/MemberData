
package com.isjieman.memberdata.Activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.isjieman.memberdata.MainActivity
import com.isjieman.memberdata.R
import com.isjieman.memberdata.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var profileBinding: ActivityProfileBinding

    companion object{
        fun getLaunchService (from: Context) = Intent(from, ProfileActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        profileBinding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(profileBinding.root)
        supportActionBar?.hide()
        profileBinding.btnLeftProfile.setOnClickListener(this)
        profileBinding.tvLogout.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        when (p0.id){
            R.id.btnLeftProfile -> startActivity(MainActivity.getLaunchService(this))
            R.id.tvLogout -> startActivity(LoginActivity.getLaunchService(this))
        }

    }
}