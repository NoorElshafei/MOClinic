package com.clinicapp.moclinic.ui.fragments.drug_list

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.clinicapp.moclinic.R

class DrugListFragment : Fragment() {

    companion object {
        fun newInstance() = DrugListFragment()
    }

    private lateinit var viewModel: DrugListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.drug_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DrugListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}