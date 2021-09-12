package com.clinicapp.moclinic.ui.fragments.permission

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.clinicapp.moclinic.R

class PermissionFragment : Fragment() {

    companion object {
        fun newInstance() = PermissionFragment()
    }

    private lateinit var viewModel: PermissionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.permission_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PermissionViewModel::class.java)
        // TODO: Use the ViewModel
    }

}