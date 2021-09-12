package com.clinicapp.moclinic.ui.fragments.my_clinic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.clinicapp.moclinic.R
import com.clinicapp.moclinic.ui.activities.main.MainActivity
import kotlinx.android.synthetic.main.my_clinic_fragment.*

class MyClinicFragment : Fragment() {

    companion object {
        fun newInstance() = MyClinicFragment()
    }

    private lateinit var viewModel: MyClinicViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.my_clinic_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MyClinicViewModel::class.java)
        // TODO: Use the ViewModel
        onClick()
    }

    override fun onStart() {
        super.onStart()
        (activity as MainActivity?)!!.getAppBar1()?.visibility = View.VISIBLE
        (activity as MainActivity?)!!.getAppBar2()?.visibility = View.GONE
    }


    private fun onClick() {
        clinic_profile.setOnClickListener {
            findNavController().navigate(R.id.action_myClinicFragment_to_clinicProfileFragment)
        }
        drug_list_layout.setOnClickListener {
            findNavController().navigate(R.id.action_myClinicFragment_to_drugListFragment)

        }
        procedure_Linear.setOnClickListener {
            findNavController().navigate(R.id.action_myClinicFragment_to_proceduresFragment)

        }
    }
}