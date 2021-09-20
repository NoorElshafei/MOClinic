package com.clinicapp.moclinic.ui.fragments.patient_details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.clinicapp.moclinic.R
import com.clinicapp.moclinic.databinding.PatientDetailsFragmentBinding

class PatientDetailsFragment : Fragment() {
    private var binding: PatientDetailsFragmentBinding? = null


    companion object {
        fun newInstance() = PatientDetailsFragment()
    }

    private lateinit var viewModel: PatientDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = PatientDetailsFragmentBinding.inflate(inflater, container, false)

        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(PatientDetailsViewModel::class.java)

        onClick()
    }


    private fun onClick() {
        binding?.editProfileButton?.setOnClickListener {
            findNavController().navigate(R.id.action_patientDetailsFragment_to_addEditPatientProfileFragment)
        }
        binding?.medicalHistory?.setOnClickListener {
            findNavController().navigate(R.id.action_patientDetailsFragment_to_medicalHistoryFragment)
        }
        binding?.vitalSigns?.setOnClickListener {
            findNavController().navigate(R.id.action_patientDetailsFragment_to_vitalSignsFragment)
        }
        binding?.medicalNotes?.setOnClickListener {
            findNavController().navigate(R.id.action_patientDetailsFragment_to_medicalNotesFragment)
        }
        binding?.vaccines?.setOnClickListener {
            findNavController().navigate(R.id.action_patientDetailsFragment_to_vaccinePateintFragment)
        }
    }


}