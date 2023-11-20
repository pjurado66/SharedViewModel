package com.pjurado.sharedviewmodel

import android.os.Bundle
import android.text.Editable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.pjurado.sharedviewmodel.databinding.FragmentABinding

class FragmentA : Fragment(R.layout.fragment_a) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewModel: SharedViewModel by activityViewModels()
        val binding = FragmentABinding.bind(view).apply {
            viewModel.nombre.observe(viewLifecycleOwner, Observer {
                val edit: Editable = Editable.Factory.getInstance().newEditable(it)
                texto.text = edit
            })
        }

        }


}