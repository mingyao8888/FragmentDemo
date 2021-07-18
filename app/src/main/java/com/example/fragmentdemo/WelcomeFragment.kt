package com.example.fragmentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.fragmentdemo.databinding.FragmentWelcomeBinding


class WelcomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding :FragmentWelcomeBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_welcome, container, false)

        binding.btnLogin.setOnClickListener(){
            Navigation.findNavController(it).navigate(R.id.action_welcomeFragment_to_gameFragment)
        }

        return binding.root
    }


}