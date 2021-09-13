package com.clinicapp.moclinic.ui.fragments.procedures

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
import com.clinicapp.moclinic.databinding.ProceduresFragmentBinding
import com.clinicapp.moclinic.ui.activities.main.MainActivity
import com.clinicapp.moclinic.ui.adapters.ProceduresAdapter

class ProceduresFragment : Fragment() {
    private var binding: ProceduresFragmentBinding? = null


    companion object {
        fun newInstance() = ProceduresFragment()
    }

    private lateinit var viewModel: ProceduresViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ProceduresFragmentBinding.inflate(inflater, container, false)
        return binding!!.root

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ProceduresViewModel::class.java)
        // TODO: Use the ViewModel


        binding?.proceduresRecycler?.layoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)

        val proceduresAdapter = ProceduresAdapter(context, activity)

        binding?.proceduresRecycler?.adapter = proceduresAdapter

        binding?.addProcedure?.setOnClickListener {
            findNavController().navigate(R.id.action_proceduresFragment_to_addProcedureFragment)
        }
    }

    override fun onStart() {
        super.onStart()
        (activity as MainActivity?)!!.getAppBarMain()?.visibility = View.GONE
        (activity as MainActivity?)!!.getAppBarDetails()?.visibility = View.VISIBLE
        (activity as MainActivity?)!!.getAppBarTitleDetails()?.text = "Procedures"

    }
}