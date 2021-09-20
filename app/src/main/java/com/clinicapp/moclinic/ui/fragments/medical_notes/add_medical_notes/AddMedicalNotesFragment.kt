package com.clinicapp.moclinic.ui.fragments.medical_notes.add_medical_notes

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.clinicapp.moclinic.R

class AddMedicalNotesFragment : Fragment() {

    companion object {
        fun newInstance() = AddMedicalNotesFragment()
    }

    private lateinit var viewModel: AddMedicalNotesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.add_medical_notes_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AddMedicalNotesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}