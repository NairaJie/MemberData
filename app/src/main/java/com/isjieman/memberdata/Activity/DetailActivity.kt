package com.isjieman.memberdata.Activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.isjieman.memberdata.MainActivity
import com.isjieman.memberdata.R
import com.isjieman.memberdata.databinding.ActivityDetailBinding
import com.isjieman.memberdata.databinding.ActivityProfileBinding

class DetailActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var detailBinding: ActivityDetailBinding

    companion object{
        fun getLaunchService (from: Context) = Intent(from, DetailActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(detailBinding.root)
        supportActionBar?.hide()
        detailBinding.btnLeftDetail.setOnClickListener(this)
        detailBinding.tvEditData.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
       when(p0.id){
           R.id.btnLeftDetail -> startActivity(MainActivity.getLaunchService(this))
           R.id.tvEditData -> startActivity(EditDataActivity.getLaunchService(this))

       }
    }
}