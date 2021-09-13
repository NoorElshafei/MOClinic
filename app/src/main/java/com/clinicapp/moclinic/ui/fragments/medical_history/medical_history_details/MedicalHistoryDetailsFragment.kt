package com.clinicapp.moclinic.ui.fragments.medical_history.medical_history_details

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.clinicapp.moclinic.R

class MedicalHistoryDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = MedicalHistoryDetailsFragment()
    }

    private lateinit var viewModel: MedicalHistoryDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.medical_history_details_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MedicalHistoryDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}