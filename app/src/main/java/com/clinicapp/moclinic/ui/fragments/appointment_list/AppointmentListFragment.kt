package com.clinicapp.moclinic.ui.fragments.appointment_list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.clinicapp.moclinic.databinding.AppointmentListFragmentBinding

class AppointmentListFragment : Fragment() {
    private var binding: AppointmentListFragmentBinding? = null


    companion object {
        fun newInstance() = AppointmentListFragment()
    }

    private lateinit var viewModel: AppointmentListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = AppointmentListFragmentBinding.inflate(inflater, container, false)

        return binding?.root

        onClick()

        //binding!!.calendarView.set

    }

    private fun onClick() {

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AppointmentListViewModel::class.java)
        // TODO: Use the ViewModel
    }


}