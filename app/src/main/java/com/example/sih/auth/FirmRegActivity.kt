package com.example.sih.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.sih.R
import com.example.sih.databinding.ActivityFirmregBinding

class FirmRegActivity : AppCompatActivity() {
    lateinit var binding: ActivityFirmregBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_firmreg)
        binding.ivBackBtn.setOnClickListener {
            startActivity(Intent(this, RegistrationActivity::class.java))
        }
    }
}