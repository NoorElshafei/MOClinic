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

class VaccineAdapter(
    var context: Context?,
    var activity: Activity?
) :
    RecyclerView.Adapter<VaccineAdapter.TripsViewHolder>() {

    /* var data = list
         set(value) {
             field = value
             notifyDataSetChanged()
         }*/

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TripsViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.drug_item, parent, false)

        return TripsViewHolder(view)

    }

    override fun getItemCount(): Int = 10

    override fun onBindViewHolder(holder: TripsViewHolder, position: Int) {
        holder.itemView.setOnClickListener {v->
            v.findNavController().navigate(R.id.action_drugListFragment_to_addDrugFragment)

        }

    }

    class TripsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}



