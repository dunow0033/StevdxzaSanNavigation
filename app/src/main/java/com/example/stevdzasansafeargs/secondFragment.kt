package com.example.stevdzasansafeargs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.stevdzasansafeargs.databinding.FragmentFirstBinding
import com.example.stevdzasansafeargs.databinding.FragmentSecondBinding
import kotlinx.android.synthetic.main.fragment_second.view.*

class secondFragment : Fragment() {

    private lateinit var _binding: FragmentSecondBinding
    private val binding: FragmentSecondBinding get() = _binding

    val args: secondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSecondBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val myNumber = args.number
        view.textView2.setText(myNumber.toString())

        binding.textView2.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.navigateToFirstFragment)
        }
    }
}