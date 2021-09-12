package com.clinicapp.moclinic.ui.adapters

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.clinicapp.moclinic.R

class ProceduresAdapter(
    var context: Context?,
    var activity: Activity?
) :
    RecyclerView.Adapter<ProceduresAdapter.TripsViewHolder>() {

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
        holder.itemView.setOnClickListener { v ->
            v.findNavController().navigate(R.id.action_proceduresFragment_to_addProcedureFragment)
        }

    }

    class TripsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}



