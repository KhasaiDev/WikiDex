package com.example.wikidex.view.iniciales

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wikidex.R
import com.example.wikidex.databinding.FragmentInicialesBinding
import com.example.wikidex.databinding.FragmentLobbyBinding


class InicialesFragment : Fragment() {
    private var _binding: FragmentInicialesBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentInicialesBinding.inflate(inflater, container, false)
        return binding.root
    }
}