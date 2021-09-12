package com.clinicapp.moclinic.ui.fragments.sign_in

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.clinicapp.moclinic.R
import com.clinicapp.moclinic.databinding.SignInFragmentBinding

class SignInFragment : Fragment(), View.OnClickListener {
    private var binding: SignInFragmentBinding? = null


    companion object {
        fun newInstance() = SignInFragment()
    }

    private lateinit var viewModel: SignInViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SignInFragmentBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SignInViewModel::class.java)
        // TODO: Use the ViewModel

        binding?.signInButton?.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            binding?.signInButton -> findNavController().navigate(R.id.action_signInFragment_to_mainActivity)
        }
    }

}