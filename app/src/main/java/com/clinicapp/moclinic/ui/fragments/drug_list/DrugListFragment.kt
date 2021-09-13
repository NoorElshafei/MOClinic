package com.clinicapp.moclinic.ui.fragments.drug_list

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
import com.clinicapp.moclinic.databinding.DrugListFragmentBinding
import com.clinicapp.moclinic.ui.activities.main.MainActivity
import com.clinicapp.moclinic.ui.adapters.DrugAdapter

class DrugListFragment : Fragment() {
    private var binding: DrugListFragmentBinding? = null

    companion object {
        fun newInstance() = DrugListFragment()
    }

    private lateinit var viewModel: DrugListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DrugListFragmentBinding.inflate(inflater, container, false)

        return binding?.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DrugListViewModel::class.java)
        // TODO: Use the ViewModel


        binding!!.drugsRecycler.layoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)

        val drugAdapter = DrugAdapter(context, activity)

        binding!!.drugsRecycler.adapter = drugAdapter

        binding!!.addDrug.setOnClickListener {
            findNavController().navigate(R.id.action_drugListFragment_to_addDrugFragment)
        }
    }

    override fun onStart() {
        super.onStart()
        (activity as MainActivity?)!!.getAppBarMain()?.visibility = View.GONE
        (activity as MainActivity?)!!.getAppBarDetails()?.visibility = View.VISIBLE
        (activity as MainActivity?)!!.getAppBarTitleDetails()?.text = "Drug List"

    }

}