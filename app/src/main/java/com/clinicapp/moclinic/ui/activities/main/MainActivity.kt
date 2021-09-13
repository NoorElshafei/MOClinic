package com.clinicapp.moclinic.ui.activities.main

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.clinicapp.moclinic.R
import com.clinicapp.moclinic.databinding.ActivityMainBinding
import com.google.android.material.appbar.AppBarLayout


class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var navController: NavController? = null
    private var appBarConfiguration: AppBarConfiguration? = null
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)


        //setSupportActionBar(toolbar)
        navController = findNavController(R.id.nav_host_fragment1)
        //setupActionBarWithNavController(navController!!,drawer_layout)
        binding!!.navView.setupWithNavController(navController!!)
        appBarConfiguration = AppBarConfiguration(navController!!.graph, binding!!.drawerLayout)


        binding!!.contentLayout.menuImage.setOnClickListener(this)
        binding!!.contentLayout.backImage.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            binding!!.contentLayout.menuImage -> {
                if (getDrawer()!!.isDrawerOpen(GravityCompat.START)) {
                    getDrawer()!!.closeDrawer(GravityCompat.START)
                } else {
                    getDrawer()!!.openDrawer(GravityCompat.START)
                }
            }
            binding!!.contentLayout.backImage -> {
                onBackPressed()
            }
        }
    }

    private fun getDrawer(): DrawerLayout? {
        return binding?.drawerLayout
    }

    fun getAppBarMain(): AppBarLayout? {
        return binding?.contentLayout?.appBarContainer
    }

    fun getAppBarDetails(): AppBarLayout? {
        return binding?.contentLayout?.appBarContainer2
    }

    fun getAppBarTitleMain(): TextView? {
        return binding?.contentLayout?.appBarTitle
    }

    fun getAppBarTitleDetails(): TextView? {
        return binding?.contentLayout?.appBarTitle1
    }


    override fun onBackPressed() {
        if (getDrawer()!!.isDrawerOpen(GravityCompat.START)) {
            getDrawer()!!.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}