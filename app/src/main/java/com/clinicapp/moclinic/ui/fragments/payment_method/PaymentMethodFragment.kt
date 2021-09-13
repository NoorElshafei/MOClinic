package com.clinicapp.moclinic.ui.fragments.payment_method

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.clinicapp.moclinic.R
import com.clinicapp.moclinic.databinding.InsuranceFragmentBinding
import com.clinicapp.moclinic.databinding.PaymentMethodFragmentBinding

class PaymentMethodFragment : Fragment() {
    private var binding: PaymentMethodFragmentBinding? = null

    companion object {
        fun newInstance() = PaymentMethodFragment()
    }

    private lateinit var viewModel: PaymentMethodViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = PaymentMethodFragmentBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PaymentMethodViewModel::class.java)
        // TODO: Use the ViewModel
    }

}