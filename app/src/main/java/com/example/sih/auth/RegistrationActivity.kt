package com.example.sih.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.sih.R
import com.example.sih.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {
    lateinit var binding: ActivityRegistrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_registration)
        binding.tbtnFLogin.setOnClickListener {
           startActivity(Intent(this, FirmRegActivity::class.java))
        }
        binding.tbtnELogin.setOnClickListener {
            startActivity(Intent(this, SignupActivity::class.java))
        }

    }
}