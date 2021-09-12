package com.clinicapp.moclinic.ui.fragments.patient

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.clinicapp.moclinic.R
import com.clinicapp.moclinic.ui.activities.main.MainActivity
import com.clinicapp.moclinic.ui.adapters.PatientAdapter
import kotlinx.android.synthetic.main.patient_fragment.*

class PatientFragment : Fragment() {

    companion object {
        fun newInstance() = PatientFragment()
    }

    private lateinit var viewModel: PatientViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.patient_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PatientViewModel::class.java)
        // TODO: Use the ViewModel

        // TODO: Use the ViewModel
        patient_recycler.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)

        val patientAdapter = PatientAdapter(context, activity)

        patient_recycler.adapter = patientAdapter

        dflk.setOnClickListener {
            findNavController().navigate(R.id.action_patientFragment_to_patientDetailsFragment)

        }
    }

    override fun onStart() {
        super.onStart()
        (activity as MainActivity?)!!.getAppBar1()?.visibility = View.VISIBLE
        (activity as MainActivity?)!!.getAppBar2()?.visibility = View.GONE
    }


}