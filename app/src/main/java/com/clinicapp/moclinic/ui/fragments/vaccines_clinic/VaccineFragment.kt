package com.clinicapp.moclinic.ui.fragments.vaccines_clinic

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
import com.clinicapp.moclinic.databinding.VaccineFragmentBinding
import com.clinicapp.moclinic.ui.adapters.VaccineAdapter

class VaccineFragment : Fragment() {
    private var binding: VaccineFragmentBinding? = null

    companion object {
        fun newInstance() = VaccineFragment()
    }

    private lateinit var viewModel: VaccineViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = VaccineFragmentBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(VaccineViewModel::class.java)
        // TODO: Use the ViewModel
        onClick()

        binding!!.vaccineRecycler.layoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)

        val vaccineAdapter = VaccineAdapter(context, activity)

        binding!!.vaccineRecycler.adapter = vaccineAdapter

    }



    private fun onClick() {
        binding?.addVaccine?.setOnClickListener {
            findNavController().navigate(R.id.action_vaccineFragment_to_addVaccineFragment)
        }


    }

}