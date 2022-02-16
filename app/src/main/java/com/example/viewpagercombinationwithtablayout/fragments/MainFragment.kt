package com.example.viewpagercombinationwithtablayout.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.viewpagercombinationwithtablayout.R
import com.example.viewpagercombinationwithtablayout.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    lateinit var bindingFragment: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        bindingFragment = FragmentMainBinding.inflate(layoutInflater)

        return bindingFragment.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().window.statusBarColor = resources.getColor(R.color.no_name)
        requireActivity().window.navigationBarColor = resources.getColor(R.color.no_name)

        bindingFragment.btn1.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_firstFragment)
        }

        bindingFragment.btn2.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_secondFragment)
        }

    }

}