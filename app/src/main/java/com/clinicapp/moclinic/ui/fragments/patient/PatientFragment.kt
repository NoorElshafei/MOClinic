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
import com.clinicapp.moclinic.databinding.MyClinicFragmentBinding
import com.clinicapp.moclinic.databinding.PatientFragmentBinding
import com.clinicapp.moclinic.ui.activities.main.MainActivity
import com.clinicapp.moclinic.ui.adapters.PatientAdapter

class PatientFragment : Fragment() {
    private var binding: PatientFragmentBinding? = null


    companion object {
        fun newInstance() = PatientFragment()
    }

    private lateinit var viewModel: PatientViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = PatientFragmentBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PatientViewModel::class.java)
        // TODO: Use the ViewModel

        // TODO: Use the ViewModel
        binding?.patientRecycler?.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)

        val patientAdapter = PatientAdapter(context, activity)

        binding?.patientRecycler?.adapter = patientAdapter


    }

    override fun onStart() {
        super.onStart()
        (activity as MainActivity?)!!.getAppBar1()?.visibility = View.VISIBLE
        (activity as MainActivity?)!!.getAppBar2()?.visibility = View.GONE
    }


}