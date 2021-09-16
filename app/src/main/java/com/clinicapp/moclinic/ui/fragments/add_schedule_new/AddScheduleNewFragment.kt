package com.clinicapp.moclinic.ui.fragments.add_schedule_new

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.clinicapp.moclinic.R
import com.clinicapp.moclinic.ui.activities.main.MainActivity

class AddScheduleNewFragment : Fragment() {

    companion object {
        fun newInstance() = AddScheduleNewFragment()
    }

    private lateinit var viewModel: AddScheduleNewViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.add_schedule_new_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AddScheduleNewViewModel::class.java)
        // TODO: Use the ViewModel
    }


}