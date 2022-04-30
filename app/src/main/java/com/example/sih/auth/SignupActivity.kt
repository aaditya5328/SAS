package com.example.sih.auth


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.sih.CameraActivity
import com.example.sih.R
import com.example.sih.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    lateinit var binding:ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_signup)
        binding.tbtnLogin.setOnClickListener {
            startActivity(Intent(this, CameraActivity::class.java))
        }

    }
}