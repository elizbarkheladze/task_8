package com.example.davaleba_8_elizbar_kheladze

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.example.davaleba_8_elizbar_kheladze.R
import com.example.davaleba_8_elizbar_kheladze.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {
    var binding: ActivityUserBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(
            layoutInflater
        )
        setContentView(binding!!.root)
        val intent = this.intent
        if (intent != null) {
            val name = intent.getStringExtra("name")
            val phone = intent.getStringExtra("phone")
            val country = intent.getStringExtra("country")
            val imageid = intent.getIntExtra("imageid", R.drawable.b1)
            binding!!.nameProfile.text = name
            binding!!.phoneProfile.text = phone
            binding!!.countryProfile.text = country
            binding!!.profileImage.setImageResource(imageid)
        }
    }
}