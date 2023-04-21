package com.application.housefinder.appartment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.application.housefinder.appartment.databinding.ActivityRegisterBinding
import com.application.housefinder.appartment.fragment.AccountFragment
import com.application.housefinder.appartment.fragment.InfoFragment

class RegisterActivity : AppCompatActivity() {
    lateinit var binding : ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.vp.adapter = VpAdapter(supportFragmentManager)
        binding.vp.currentItem = 0
    }

    class VpAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {
        override fun getCount(): Int {
            return 2
        }

        override fun getItem(position: Int): Fragment {
            if (position == 0) {
                return AccountFragment()
            }
            return InfoFragment()
        }

    }
}