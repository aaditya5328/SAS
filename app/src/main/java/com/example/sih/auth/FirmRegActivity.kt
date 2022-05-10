package com.example.sih.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.sih.FDashboardActivity
import com.example.sih.MapsActivity
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
        binding.tbtnFReg.setOnClickListener {
            startActivity(Intent(this,FDashboardActivity::class.java))
        }
        binding.ivLocation.setOnClickListener{
            startActivity(Intent(this,MapsActivity::class.java))
        }
    }
}