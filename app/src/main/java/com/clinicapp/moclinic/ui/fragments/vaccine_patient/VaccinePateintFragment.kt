package com.clinicapp.moclinic.ui.fragments.vaccine_patient

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.clinicapp.moclinic.R
import com.clinicapp.moclinic.databinding.FragmentVaccinePateintBinding

class VaccinePateintFragment : Fragment() {
    private var binding: FragmentVaccinePateintBinding? = null


    companion object {
        fun newInstance() = VaccinePateintFragment()
    }

    private lateinit var viewModel: VaccinePateintViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentVaccinePateintBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(VaccinePateintViewModel::class.java)
        // TODO: Use the ViewModel

        onClick()
    }

    private fun onClick() {
        binding?.addVaccineButton?.setOnClickListener {
            findNavController().navigate(R.id.action_vaccinePateintFragment_to_addVaccinePatientFragment)
        }

    }

}