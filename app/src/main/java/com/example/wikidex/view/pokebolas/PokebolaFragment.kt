package com.example.wikidex.view.pokebolas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wikidex.R
import com.example.wikidex.databinding.FragmentLobbyBinding
import com.example.wikidex.databinding.FragmentPokebolaBinding

class PokebolaFragment : Fragment() {
    private var _binding: FragmentPokebolaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPokebolaBinding.inflate(inflater, container, false)
        return binding.root
    }
}