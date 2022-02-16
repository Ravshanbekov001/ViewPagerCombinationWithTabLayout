package com.example.viewpagercombinationwithtablayout.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.example.viewpagercombinationwithtablayout.R
import com.example.viewpagercombinationwithtablayout.adapters.FragmentAdapter
import com.example.viewpagercombinationwithtablayout.databinding.ActivityMainBinding
import com.example.viewpagercombinationwithtablayout.databinding.FragmentFirstBinding
import com.example.viewpagercombinationwithtablayout.models.Data
import com.google.android.material.tabs.TabLayoutMediator

class FirstFragment : Fragment() {

    lateinit var binding: FragmentFirstBinding

    lateinit var list: ArrayList<Data>
    lateinit var fragmentAdapter: FragmentAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        binding = FragmentFirstBinding.inflate(layoutInflater)

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().window.statusBarColor = resources.getColor(R.color.white)
        requireActivity().window.navigationBarColor = resources.getColor(R.color.white)

        list = ArrayList()
        list.add(Data(R.drawable.image1,
            "Click va Paymega o’tish xizmati",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum."))
        list.add(Data(R.drawable.image2,
            "Barcha operatorlar bo’yicha statistika",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum."))
        list.add(Data(R.drawable.image3,
            "Tariflarni filtrlash",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum."))
        list.add(Data(R.drawable.image4,
            "Yangi imkoniyatlar",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum."))


        fragmentAdapter = FragmentAdapter(list)
        binding.viewPager2.adapter = fragmentAdapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager2) { tab, position -> }.attach()


        binding.otkazibYuborish.setOnClickListener {
            binding.viewPager2.currentItem = list.size - 1
        }

        binding.keyingi.setOnClickListener {
            if (binding.viewPager2.currentItem != list.size - 1) {
                binding.viewPager2.currentItem += 1
            }
        }
    }
}