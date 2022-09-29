package com.isjieman.memberdata.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.isjieman.memberdata.R

class OnboardingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)
        supportActionBar?.hide()
        Handler(mainLooper).postDelayed({
            startActivity(LoginActivity.getLaunchService(this))
            finish()
        }, 3000)

    }


}