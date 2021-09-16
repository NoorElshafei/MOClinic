package com.clinicapp.moclinic.ui.fragments.insurance

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
import com.clinicapp.moclinic.databinding.InsuranceFragmentBinding
import com.clinicapp.moclinic.ui.activities.main.MainActivity
import com.clinicapp.moclinic.ui.adapters.InsuranceAdapter

class InsuranceFragment : Fragment() {
    private var binding: InsuranceFragmentBinding? = null

    companion object {
        fun newInstance() = InsuranceFragment()
    }

    private lateinit var viewModel: InsuranceViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = InsuranceFragmentBinding.inflate(inflater, container, false)
        return binding!!.root

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(InsuranceViewModel::class.java)
        // TODO: Use the ViewModel
        onClick()

        binding!!.insuranceRecycler.layoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)

        val insuranceAdapter = InsuranceAdapter(context, activity)

        binding!!.insuranceRecycler.adapter = insuranceAdapter

    }



    private fun onClick() {
        binding?.addInsurance?.setOnClickListener {
            findNavController().navigate(R.id.action_insuranceFragment_to_addInsuranceFragment)
        }


    }
}