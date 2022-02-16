package com.example.viewpagercombinationwithtablayout.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.navigation.fragment.findNavController
import com.example.viewpagercombinationwithtablayout.R
import com.example.viewpagercombinationwithtablayout.adapters.FragmentAdapter2
import com.example.viewpagercombinationwithtablayout.databinding.FragmentSecondBinding
import com.example.viewpagercombinationwithtablayout.models.Data2
import com.google.android.material.tabs.TabLayoutMediator

class SecondFragment : Fragment() {

    lateinit var binding: FragmentSecondBinding

    lateinit var list: ArrayList<Data2>
    lateinit var fragmentAdapter2: FragmentAdapter2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        binding = FragmentSecondBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().window.statusBarColor = resources.getColor(R.color.white)
        requireActivity().window.navigationBarColor = resources.getColor(R.color.white)

        list = ArrayList()
        list.add(Data2(R.drawable.image1_1,
            "Geoaxborot",
            "Geoaxborot moduli orqali siz o'zingizga yaqin bo'lgan migrantlar va boshqa muassasalar haqida ma'lumot olishingiz mumkin"))
        list.add(Data2(R.drawable.image2_2,
            "Huquqiy axborot",
            "Huquqiy axborot moduli orqali siz migratsiya sohasiga oid yangiliklardan, qonunlardan xabardor bo'lishingiz va online konsultatsiya olishingiz mumkin"))
        list.add(Data2(R.drawable.image3_3,
            "To'lovlar xizmatlari",
            "To'lov xizmatlari moduli orqali siz masofadan turib turli xil xizmatlarga to'lovlar haqida ma'lumot olishingiz va to'lovlarni amalga oshirishingiz mumkin"))
        list.add(Data2(R.drawable.image4_4,
            "Qo'shimcha imkoniyat",
            "Qo'shimcha imkoniyatlar moduli orqali siz interaktiv so'zlashgichlar va lug'atlar yordamida til bilish savodxonligingizni oshirishingiz mumkin"))


        fragmentAdapter2 = FragmentAdapter2(list)
        binding.viewPager22.adapter = fragmentAdapter2

        binding.dotsIndicator.setViewPager2(binding.viewPager22)


        binding.royhatdanOtish.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_registrationPageFragment)
        }

        binding.otkazibYuboriw.setOnClickListener {
            binding.viewPager22.currentItem = list.size - 1
        }
    }
}