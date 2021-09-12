package com.clinicapp.moclinic.ui.fragments.sign_in

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.clinicapp.moclinic.R
import kotlinx.android.synthetic.main.sign_in_fragment.*

class SignInFragment : Fragment(), View.OnClickListener {

    companion object {
        fun newInstance() = SignInFragment()
    }

    private lateinit var viewModel: SignInViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.sign_in_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SignInViewModel::class.java)
        // TODO: Use the ViewModel

        sign_in_button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            sign_in_button -> findNavController().navigate(R.id.action_signInFragment_to_mainActivity)
        }
    }

}