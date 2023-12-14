package com.example.myfirstapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import com.example.myfirstapp.databinding.Fragment2Binding

class BlankFragment2 : Fragment() {
    private val dataModel: DataModel by activityViewModels()
    lateinit var binding: Fragment2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = Fragment2Binding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        dataModel.messageForFragment2.observe(activity as LifecycleOwner, {
            binding.tvMessage.text = it
        })
        binding.buttonMessageFG1.setOnClickListener {
            dataModel.messageForFragment1.value = "Hello from FG2 to FG1!"
        }
        binding.buttonMessageMA.setOnClickListener {
            dataModel.messageForActivity.value = "Hello from FG2 to MA!"
        }
    }

    companion object {
        fun newInstance() = BlankFragment2()
    }
}