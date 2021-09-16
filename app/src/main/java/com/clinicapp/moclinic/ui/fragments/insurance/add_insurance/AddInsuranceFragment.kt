package com.clinicapp.moclinic.ui.fragments.insurance.add_insurance

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.clinicapp.moclinic.R
import com.clinicapp.moclinic.ui.activities.main.MainActivity

class AddInsuranceFragment : Fragment() {

    companion object {
        fun newInstance() = AddInsuranceFragment()
    }

    private lateinit var viewModel: AddInsuranceViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.add_insurance_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AddInsuranceViewModel::class.java)
        // TODO: Use the ViewModel
    }



}