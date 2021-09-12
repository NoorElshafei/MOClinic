package com.clinicapp.moclinic.ui.adapters

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.clinicapp.moclinic.R

class PatientAdapter(
    var context: Context?,
    var activity: Activity?
) :
    RecyclerView.Adapter<PatientAdapter.TripsViewHolder>() {

    /* var data = list
         set(value) {
             field = value
             notifyDataSetChanged()
         }*/

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TripsViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.patient_item, parent, false)

        return TripsViewHolder(view)

    }

    override fun getItemCount(): Int = 10

    override fun onBindViewHolder(holder: TripsViewHolder, position: Int) {
        holder.itemView.setOnClickListener {v->
            v.findNavController().navigate(R.id.action_patientFragment_to_patientDetailsFragment)

            /* findNavController(
                 activity!!,
                 R.id.nav_host_fragment1
             ).navigate(R.id.action_patientFragment_to_patientDetailsFragment)*/
          //  Navigation.createNavigateOnClickListener(R.id.action_patientFragment_to_patientDetailsFragment).onClick(holder.itemView)

            //Navigation.createNavigateOnClickListener(R.id.action_patientFragment_to_patientDetailsFragment)


        }

    }

    class TripsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}



