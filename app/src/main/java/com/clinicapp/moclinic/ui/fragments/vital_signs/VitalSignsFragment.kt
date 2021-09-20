package com.clinicapp.moclinic.ui.fragments.vital_signs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.clinicapp.moclinic.R
import com.clinicapp.moclinic.databinding.VitalSignsFragmentBinding

class VitalSignsFragment : Fragment() {
    private var binding: VitalSignsFragmentBinding? = null

    companion object {
        fun newInstance() = VitalSignsFragment()
    }

    private lateinit var viewModel: VitalSignsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = VitalSignsFragmentBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(VitalSignsViewModel::class.java)
        // TODO: Use the ViewModel

        onClick()
    }

    private fun onClick() {
        binding?.addVitalButton?.setOnClickListener {
            findNavController().navigate(R.id.action_vitalSignsFragment_to_addVitalSignsFragment)
        }

    }

}