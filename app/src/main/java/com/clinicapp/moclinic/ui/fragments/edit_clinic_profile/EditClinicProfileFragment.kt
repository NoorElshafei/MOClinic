package com.clinicapp.moclinic.ui.fragments.edit_clinic_profile

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.clinicapp.moclinic.R

class EditClinicProfileFragment : Fragment() {

    companion object {
        fun newInstance() = EditClinicProfileFragment()
    }

    private lateinit var viewModel: EditClinicProfileViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.edit_clinic_profile_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(EditClinicProfileViewModel::class.java)
        // TODO: Use the ViewModel
    }

}