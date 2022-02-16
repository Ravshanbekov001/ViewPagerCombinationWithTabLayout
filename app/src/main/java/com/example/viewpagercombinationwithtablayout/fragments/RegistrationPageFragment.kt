package com.example.viewpagercombinationwithtablayout.fragments

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.viewpagercombinationwithtablayout.R
import com.example.viewpagercombinationwithtablayout.databinding.FragmentRegistrationPageBinding

class RegistrationPageFragment : Fragment() {

    lateinit var binding: FragmentRegistrationPageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        binding = FragmentRegistrationPageBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().window.statusBarColor = resources.getColor(R.color.no_name)
        requireActivity().window.navigationBarColor = resources.getColor(R.color.white)

        binding.submit.setOnClickListener {
            Toast.makeText(requireActivity(), "Saqlandi", Toast.LENGTH_SHORT).show()
            if (binding.etEmail.text!!.isNotEmpty() && binding.etName.text!!.isNotEmpty() && binding.etPassword.text!!.isNotEmpty()) {
                findNavController().popBackStack()
            } else {
                Toast.makeText(requireActivity(),
                    "Kerakli maydonni to'ldiring!",
                    Toast.LENGTH_SHORT)
                    .show()
            }
        }

    }
}