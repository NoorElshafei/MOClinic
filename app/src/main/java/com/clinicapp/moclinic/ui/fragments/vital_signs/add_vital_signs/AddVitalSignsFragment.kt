package com.clinicapp.moclinic.ui.fragments.vital_signs.add_vital_signs

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.clinicapp.moclinic.R

class AddVitalSignsFragment : Fragment() {

    companion object {
        fun newInstance() = AddVitalSignsFragment()
    }

    private lateinit var viewModel: AddVitalSignsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.add_vital_signs_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AddVitalSignsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}