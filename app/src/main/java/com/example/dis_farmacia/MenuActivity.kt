package com.example.dis_farmacia

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MenuActivity : AppCompatActivity() {
    lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        bottomNavigationView=findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.bottom_contacto ->{
                    replaceFragment(ContactoFragment())
                    true
                }
                R.id.bottom_nosotros ->{
                    replaceFragment(NosotrosFragment())
                    true
                }
                R.id.bottom_menu->{
                    replaceFragment(MenuFragment())
                    true
                }
                else -> false
            }
        }
        replaceFragment(MenuFragment())
    }


    fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame_container,fragment).commit()
    }

}