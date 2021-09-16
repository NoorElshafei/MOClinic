package com.clinicapp.moclinic.ui.activities.main


import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.clinicapp.moclinic.R
import com.clinicapp.moclinic.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var navController: NavController? = null
    private var appBarConfiguration: AppBarConfiguration? = null
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)


        setSupportActionBar(binding!!.contentLayout.toolbar)


        val drawerLayout: DrawerLayout = binding!!.drawerLayout
        val navView: NavigationView = binding!!.navView
        val navController = findNavController(R.id.nav_host_fragment1)

        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.dashBoardFragment,
                R.id.myClinicFragment,
                R.id.patientFragment,
                R.id.appointmentListFragment,
                R.id.financeFragment
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration!!)
        navView.setupWithNavController(navController)

    }


    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment1)
        return navController.navigateUp(appBarConfiguration!!) || super.onSupportNavigateUp()
    }

    override fun onClick(v: View?) {

    }


}