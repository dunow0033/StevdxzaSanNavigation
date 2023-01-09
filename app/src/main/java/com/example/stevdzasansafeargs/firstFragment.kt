package com.example.stevdzasansafeargs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import com.example.stevdzasansafeargs.databinding.FragmentFirstBinding

class firstFragment : Fragment() {

    private lateinit var _binding: FragmentFirstBinding
    private val binding: FragmentFirstBinding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFirstBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textView1.setOnClickListener {
            val action = firstFragmentDirections.navigateToSecondFragment(22)
            findNavController(binding.root).navigate(action)
        }
    }
}