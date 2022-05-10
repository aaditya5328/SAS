package com.example.sih

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.sih.databinding.ActivityFdashboardBinding

class FDashboardActivity : AppCompatActivity() {
    lateinit var binding:ActivityFdashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_fdashboard)
        binding.ivBackBtn.setOnClickListener {
            finish()
        }
    }
}