package com.example.myfirstapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import com.example.myfirstapp.databinding.Fragment1Binding

class BlankFragment : Fragment() {
    private val dataModel: DataModel by activityViewModels()
    lateinit var binding: Fragment1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = Fragment1Binding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        dataModel.messageForFragment1.observe(activity as LifecycleOwner, {
            binding.tvMessage.text = it
        })
        binding.buttonMessageFG2.setOnClickListener {
            dataModel.messageForFragment2.value = "Hello from FG1 to FG2!"
        }
        binding.buttonMessageMA.setOnClickListener {
            dataModel.messageForActivity.value = "Hello from FG1 to MA!"
        }
    }

    companion object {
        fun newInstance() = BlankFragment()
    }
}