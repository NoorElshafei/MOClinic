package com.clinicapp.moclinic.ui.fragments.prescription

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.clinicapp.moclinic.R

class PrescriptionFragment : Fragment() {

    companion object {
        fun newInstance() = PrescriptionFragment()
    }

    private lateinit var viewModel: PrescriptionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.prescription_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PrescriptionViewModel::class.java)
        // TODO: Use the ViewModel
    }

}