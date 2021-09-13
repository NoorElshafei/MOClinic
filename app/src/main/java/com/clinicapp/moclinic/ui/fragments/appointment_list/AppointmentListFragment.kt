package com.clinicapp.moclinic.ui.fragments.appointment_list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.clinicapp.moclinic.R
import com.clinicapp.moclinic.ui.activities.main.MainActivity

class AppointmentListFragment : Fragment() {

    companion object {
        fun newInstance() = AppointmentListFragment()
    }

    private lateinit var viewModel: AppointmentListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.appointment_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AppointmentListViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onStart() {
        super.onStart()
        (activity as MainActivity?)!!.getAppBarMain()?.visibility = View.VISIBLE
        (activity as MainActivity?)!!.getAppBarDetails()?.visibility = View.GONE
        (activity as MainActivity?)!!.getAppBarTitleMain()?.text = "Appointment List"

    }

}