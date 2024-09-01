package com.example.dis_farmacia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class EntradaActivity : AppCompatActivity() {
    lateinit var dniEntrada: EditText
    lateinit var pwdEntrada: EditText
    lateinit var btnIngresar: Button
    lateinit var respuesta:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_entrada)

        dniEntrada=findViewById(R.id.edtEntradaDni)
        pwdEntrada=findViewById(R.id.edtEntradaPwd)
        btnIngresar=findViewById(R.id.btnIngresar)

        btnIngresar.setOnClickListener(){
            ValidarIngreso();
        }

    }
    fun ValidarIngreso()
    {
        var dni:String=dniEntrada.text.toString()
        var contraseña:String=pwdEntrada.text.toString()
        //75669643 luis
        if(dni=="76905494" && contraseña =="luis")
        {
            respuesta="Bienvenido usuario"
            Toast.makeText(this,respuesta, Toast.LENGTH_LONG).show()
            val i = Intent(this@EntradaActivity, MenuActivity::class.java)
            startActivity(i)
            finish()
        }
        else
            respuesta="Datos incorrectos"
        dniEntrada.setText("")
        pwdEntrada.setText("")
        dniEntrada.requestFocus()
        Toast.makeText(this,respuesta, Toast.LENGTH_LONG).show()


    }
}