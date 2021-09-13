package com.clinicapp.moclinic.ui.fragments.vaccines

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.clinicapp.moclinic.databinding.VaccineFragmentBinding
import com.clinicapp.moclinic.ui.activities.main.MainActivity

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
    }

    override fun onStart() {
        super.onStart()
        (activity as MainActivity?)!!.getAppBarMain()?.visibility = View.GONE
        (activity as MainActivity?)!!.getAppBarDetails()?.visibility = View.VISIBLE
        (activity as MainActivity?)!!.getAppBarTitleDetails()?.text = "Vaccine"

    }

}