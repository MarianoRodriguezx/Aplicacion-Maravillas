package com.mariano.projectobase.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.ContextThemeWrapper
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.PopupMenu
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.fragment.NavHostFragment
import com.mariano.projectobase.*
import com.mariano.projectobase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),
    NavController.OnDestinationChangedListener,
    PopupMenu.OnMenuItemClickListener {

    private lateinit var navController: NavController
    private lateinit var popup: PopupMenu

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)

        val navHostFragment: NavHostFragment = binding.frmContent.getFragment()
        navController = navHostFragment.navController
        navController.addOnDestinationChangedListener(this)


        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when(item.itemId){

                R.id.home -> {
                    navController.navigate((NavAppDirections.globalHome()))
                }

                R.id.calendar -> {
                    navController.navigate(NavAppDirections.globalCalendar())
                }

                R.id.outlet -> {
                    navController.navigate(NavAppDirections.globalPromociones())
                }

                R.id.fav -> {
                    navController.navigate(NavAppDirections.globalFavorites())
                }
            }
            return@setOnItemSelectedListener true
        }

        setContentView(binding.root)

        fun setMenu() {
            popup = PopupMenu(this, binding.btnMenu)
            popup.setOnMenuItemClickListener(this)

            popup.menuInflater.inflate(R.menu.menu_superior, popup.menu)
        }

        binding.btnMenu.setOnClickListener{
            setMenu()
            popup.show()
        }

        var noti_img = findViewById<ImageView>(R.id.noti_img)
        noti_img.setOnClickListener {
            goToNotifications()
        }

        /*var btn_menu = findViewById<ImageView>(R.id.btn_menu)
        btn_menu.setOnClickListener {
            goToProfile()
        }*/
    }

    override fun onDestinationChanged(
        controller: NavController,
        destination: NavDestination,
        arguments: Bundle?
    ) {

    }

    override fun onMenuItemClick(p0: MenuItem): Boolean {

        when(p0.itemId)
        {
            R.id.cuenta -> {
                navController.navigate((NavAppDirections.globalProfile()))
            }

            R.id.metodos -> {
                navController.navigate((NavAppDirections.globalMetodos()))
            }

            R.id.logout -> {

                val app = App.getInstance()
                val editor = app.getSharedPrefs().edit()

                editor.remove("email")
                editor.apply()

                Handler().postDelayed({
                    val intent = Intent(this, Login::class.java)
                    startActivity(intent)
                    finish()
                }, 2000)
            }
        }
        return true
    }

    fun goToNotifications(){
        startActivity(Intent(this, Notificaciones::class.java))
    }

    /*fun goToProfile(){
        startActivity(Intent(this, Perfil::class.java))
    }*/
}