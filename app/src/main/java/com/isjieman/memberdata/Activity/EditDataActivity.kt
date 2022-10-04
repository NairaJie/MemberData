package com.isjieman.memberdata.Activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.isjieman.memberdata.MainActivity
import com.isjieman.memberdata.R
import com.isjieman.memberdata.databinding.ActivityEditDataBinding

class EditDataActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var editDataBinding: ActivityEditDataBinding

    companion object{
        fun getLaunchService (from: Context) = Intent(from, EditDataActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        editDataBinding = ActivityEditDataBinding.inflate(layoutInflater)
        setContentView(editDataBinding.root)
        supportActionBar?.hide()

        editDataBinding.btnLeftEdit.setOnClickListener(this)
        editDataBinding.btnSubmitEdit.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        when(p0.id){
            R.id.btnLeftEdit -> startActivity(DetailActivity.getLaunchService(this))
            R.id.btnSubmitEdit -> startActivity(MainActivity.getLaunchService(this))
        }
    }
}