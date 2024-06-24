package com.example.wikidex.view.lobby

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.wikidex.R
import com.example.wikidex.databinding.FragmentLobbyBinding

class LobbyFragment : Fragment() {
    private var _binding: FragmentLobbyBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLobbyBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Navegar del Lobby a la info de Regiones
        binding.button1.setOnClickListener{
            findNavController().navigate(R.id.regionLobby_to_regionFragment)
        }

        //Navegar del Lobby a la info de los Iniciales
        binding.button2.setOnClickListener{
            findNavController().navigate(R.id.inicialesLobby_to_inicialesFragment)
        }

        //Navegar del Lobby a la info de las Pokeballs
        binding.button3.setOnClickListener{
            findNavController().navigate(R.id.pokeballsLobby_to_pokeballsFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}