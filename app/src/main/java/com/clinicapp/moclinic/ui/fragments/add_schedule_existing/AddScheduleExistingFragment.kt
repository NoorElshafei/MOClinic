package com.clinicapp.moclinic.ui.fragments.add_schedule_existing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.clinicapp.moclinic.R

class AddScheduleExistingFragment : Fragment() {

    companion object {
        fun newInstance() = AddScheduleExistingFragment()
    }

    private lateinit var viewModel: AddScheduleExistingViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.add_schedule_existing_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AddScheduleExistingViewModel::class.java)
        // TODO: Use the ViewModel
    }

}