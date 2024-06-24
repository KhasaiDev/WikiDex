package com.example.wikidex.view.regiones

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wikidex.R
import com.example.wikidex.databinding.FragmentPokebolaBinding
import com.example.wikidex.databinding.FragmentRegionesBinding

class RegionesFragment : Fragment() {
    private var _binding: FragmentRegionesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRegionesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}