package com.clinicapp.moclinic.ui.fragments.patient_details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.clinicapp.moclinic.R
import com.clinicapp.moclinic.ui.activities.main.MainActivity

class PatientDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = PatientDetailsFragment()
    }

    private lateinit var viewModel: PatientDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


//        app_bar_container.visibility=View.GONE
        return inflater.inflate(R.layout.patient_details_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PatientDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onStart() {
        super.onStart()
        (activity as MainActivity?)!!.getAppBar1()?.visibility = View.GONE
        (activity as MainActivity?)!!.getAppBar2()?.visibility = View.VISIBLE
    }


}