package com.clinicapp.moclinic.ui.fragments.clinic_profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.clinicapp.moclinic.R
import com.clinicapp.moclinic.ui.activities.main.MainActivity

class ClinicProfileFragment : Fragment() {

    companion object {
        fun newInstance() = ClinicProfileFragment()
    }

    private lateinit var viewModel: ClinicProfileViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.clinic_profile_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ClinicProfileViewModel::class.java)
        // TODO: Use the ViewModel
    }

}