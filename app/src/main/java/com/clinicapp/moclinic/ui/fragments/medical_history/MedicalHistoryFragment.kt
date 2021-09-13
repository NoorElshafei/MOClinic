package com.clinicapp.moclinic.ui.fragments.medical_history

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.clinicapp.moclinic.R
import com.clinicapp.moclinic.databinding.MedicalHistoryFragmentBinding
import com.clinicapp.moclinic.ui.activities.main.MainActivity

class MedicalHistoryFragment : Fragment() {
    private var binding: MedicalHistoryFragmentBinding? = null


    companion object {
        fun newInstance() = MedicalHistoryFragment()
    }

    private lateinit var viewModel: MedicalHistoryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MedicalHistoryFragmentBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(MedicalHistoryViewModel::class.java)

        onClick()
    }


    private fun onClick() {
        binding?.addMedicalButton?.setOnClickListener {
            findNavController().navigate(R.id.action_medicalHistoryFragment_to_addMedicalHistoryFragment)
        }


    }

    override fun onStart() {
        super.onStart()
        (activity as MainActivity?)!!.getAppBarMain()?.visibility = View.GONE
        (activity as MainActivity?)!!.getAppBarDetails()?.visibility = View.VISIBLE
        (activity as MainActivity?)!!.getAppBarTitleDetails()?.text = "Medical History"

    }

}