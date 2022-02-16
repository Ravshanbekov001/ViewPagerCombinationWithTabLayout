package com.example.viewpagercombinationwithtablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.viewpagercombinationwithtablayout.adapters.FragmentAdapter
import com.example.viewpagercombinationwithtablayout.databinding.ActivityMainBinding
import com.example.viewpagercombinationwithtablayout.fragments.ItemFragment
import com.example.viewpagercombinationwithtablayout.models.Data
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}