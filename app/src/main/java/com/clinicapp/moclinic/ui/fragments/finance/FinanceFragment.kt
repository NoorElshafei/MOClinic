package com.clinicapp.moclinic.ui.fragments.finance

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.clinicapp.moclinic.R
import com.clinicapp.moclinic.ui.activities.main.MainActivity

class FinanceFragment : Fragment() {

    companion object {
        fun newInstance() = FinanceFragment()
    }

    private lateinit var viewModel: FinanceViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.finance_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FinanceViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onStart() {
        super.onStart()
        (activity as MainActivity?)!!.getAppBar1()?.visibility = View.VISIBLE
        (activity as MainActivity?)!!.getAppBar2()?.visibility = View.GONE
    }


}