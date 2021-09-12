package com.clinicapp.moclinic.ui.fragments.add_drug

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.clinicapp.moclinic.R

class AddDrugFragment : Fragment() {

    companion object {
        fun newInstance() = AddDrugFragment()
    }

    private lateinit var viewModel: AddDrugViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.add_drug_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AddDrugViewModel::class.java)
        // TODO: Use the ViewModel
    }

}