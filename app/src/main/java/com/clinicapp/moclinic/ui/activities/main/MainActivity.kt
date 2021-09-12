package com.clinicapp.moclinic.ui.activities.main

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.clinicapp.moclinic.R
import com.google.android.material.appbar.AppBarLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var navController: NavController? = null
    private var appBarConfiguration: AppBarConfiguration? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // setSupportActionBar(toolbar)
        navController = findNavController(R.id.nav_host_fragment1)
        //setupActionBarWithNavController(navController!!,drawer_layout)
        nav_view.setupWithNavController(navController!!)
        appBarConfiguration = AppBarConfiguration(navController!!.graph, drawer_layout)


        menu_image.setOnClickListener(this)
        back_image.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            menu_image -> {
                if (getDrawer()!!.isDrawerOpen(GravityCompat.START)) {
                    getDrawer()!!.closeDrawer(GravityCompat.START)
                } else {
                    getDrawer()!!.openDrawer(GravityCompat.START)
                }
            }
            back_image -> {
                onBackPressed()
            }
        }
    }

    private fun getDrawer(): DrawerLayout? {
        return drawer_layout
    }

    fun getAppBar1(): AppBarLayout? {
        return app_bar_container
    }

    fun getAppBar2(): AppBarLayout? {
        return app_bar_container2
    }


    override fun onBackPressed() {
        if (getDrawer()!!.isDrawerOpen(GravityCompat.START)) {
            getDrawer()!!.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}