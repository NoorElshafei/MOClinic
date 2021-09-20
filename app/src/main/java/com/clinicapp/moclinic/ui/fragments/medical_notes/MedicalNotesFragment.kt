package com.clinicapp.moclinic.ui.fragments.medical_notes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.clinicapp.moclinic.R
import com.clinicapp.moclinic.databinding.MedicalNotesFragmentBinding

class MedicalNotesFragment : Fragment() {
    private var binding: MedicalNotesFragmentBinding? = null


    companion object {
        fun newInstance() = MedicalNotesFragment()
    }

    private lateinit var viewModel: MedicalNotesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MedicalNotesFragmentBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MedicalNotesViewModel::class.java)
        // TODO: Use the ViewModel

        onClick()
    }

    private fun onClick() {
        binding?.addMedicalNotesButton?.setOnClickListener {
            findNavController().navigate(R.id.action_medicalNotesFragment_to_addMedicalNotesFragment)
        }

    }

}