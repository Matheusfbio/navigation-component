package com.br.navigation_component.fragments

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.br.navigation_component.databinding.FragmentAddressBinding
import com.br.navigation_component.fragments.extensions.text
import com.br.navigation_component.model.PersonModel

class AddressFragment : Fragment() {
    private var _binding: FragmentAddressBinding? = null
    private val binding get() = _binding!!

    private val args by navArgs<AddressFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater,
        group: ViewGroup?,
        saved: Bundle?
    ): View? {
        _binding = FragmentAddressBinding.inflate(inflater, group, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.e(TAG, "onViewCreated: ${args.model}")
        binding.btnNext.setOnClickListener {
            val model = PersonModel(
                street = binding.tilStreet.text,
                houseNumber = binding.tilNumber.text.toInt()
            )
            Toast.makeText(requireContext(), model.toString(), Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}