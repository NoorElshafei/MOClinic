package com.clinicapp.moclinic.ui.fragments.my_clinic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.clinicapp.moclinic.R
import com.clinicapp.moclinic.databinding.MyClinicFragmentBinding

class MyClinicFragment : Fragment() {
    private var binding: MyClinicFragmentBinding? = null

    companion object {
        fun newInstance() = MyClinicFragment()
    }

    private lateinit var viewModel: MyClinicViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MyClinicFragmentBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MyClinicViewModel::class.java)
        // TODO: Use the ViewModel
        onClick()
    }


    private fun onClick() {
        binding!!.clinicProfile.setOnClickListener {
            findNavController().navigate(R.id.action_myClinicFragment_to_clinicProfileFragment)
        }
        binding!!.drugListLayout.setOnClickListener {
            findNavController().navigate(R.id.action_myClinicFragment_to_drugListFragment)

        }
        binding!!.procedureLinear.setOnClickListener {
            findNavController().navigate(R.id.action_myClinicFragment_to_proceduresFragment)

        }
        binding!!.insuranceLinear.setOnClickListener {
            findNavController().navigate(R.id.action_myClinicFragment_to_insuranceFragment)

        }
        binding!!.paymentMethodLinear.setOnClickListener {
            findNavController().navigate(R.id.action_myClinicFragment_to_paymentMethodFragment)

        }
        binding!!.vaccineLinear.setOnClickListener {
            findNavController().navigate(R.id.action_myClinicFragment_to_vaccineFragment)

        }

    }
}