package com.pjurado.sharedviewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.pjurado.sharedviewmodel.databinding.FragmentBBinding

class FragmentB : Fragment(R.layout.fragment_b) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewModel: SharedViewModel by activityViewModels()
        val binding = FragmentBBinding.bind(view).apply {
            boton.setOnClickListener {
                viewModel.setNombre(texto.text.toString())
            }
        }


    }
}