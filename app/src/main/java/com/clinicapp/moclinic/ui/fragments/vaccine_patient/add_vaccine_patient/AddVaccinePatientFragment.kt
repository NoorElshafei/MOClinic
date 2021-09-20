package com.clinicapp.moclinic.ui.fragments.vaccine_patient.add_vaccine_patient

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.clinicapp.moclinic.R

class AddVaccinePatientFragment : Fragment() {

    companion object {
        fun newInstance() = AddVaccinePatientFragment()
    }

    private lateinit var viewModel: AddVaccinePatientViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.add_vaccine_patient_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AddVaccinePatientViewModel::class.java)
        // TODO: Use the ViewModel
    }

}