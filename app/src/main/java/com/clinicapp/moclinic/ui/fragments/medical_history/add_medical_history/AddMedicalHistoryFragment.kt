package com.clinicapp.moclinic.ui.fragments.medical_history.add_medical_history

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.clinicapp.moclinic.R

class AddMedicalHistoryFragment : Fragment() {

    companion object {
        fun newInstance() = AddMedicalHistoryFragment()
    }

    private lateinit var viewModel: AddMedicalHistoryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.add_medical_history_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AddMedicalHistoryViewModel::class.java)
        // TODO: Use the ViewModel
    }

}