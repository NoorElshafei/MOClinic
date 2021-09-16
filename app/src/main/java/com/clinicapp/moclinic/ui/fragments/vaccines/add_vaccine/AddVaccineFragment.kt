package com.clinicapp.moclinic.ui.fragments.vaccines.add_vaccine

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.clinicapp.moclinic.R

class AddVaccineFragment : Fragment() {

    companion object {
        fun newInstance() = AddVaccineFragment()
    }

    private lateinit var viewModel: AddVaccineViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.add_vaccine_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AddVaccineViewModel::class.java)
        // TODO: Use the ViewModel
    }

}