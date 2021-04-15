package com.shiqiliu.andoridassessment.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shiqiliu.andoridassessment.R
import com.shiqiliu.andoridassessment.fragment.LoginFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        supportFragmentManager.beginTransaction().add(R.id.fragment_container,LoginFragment()).commit()
    }
}