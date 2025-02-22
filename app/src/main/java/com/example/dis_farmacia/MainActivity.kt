package com.example.dis_farmacia

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Handler().postDelayed({
            val i = Intent(this@MainActivity, EntradaActivity::class.java)
            startActivity(i)
            finish()
        }, 2000)
    }
}