package com.example.myfirstapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myfirstapp.databinding.FragmentBlank2Binding

class BlankFragment2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentBlank2Binding.inflate(inflater)
        return binding.root
    }

    companion object {
        fun newInstance() = BlankFragment2()
    }
}