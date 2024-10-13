package com.example.cp2mobile

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnEnviar: Button
    private lateinit var btnRest1: ImageView
    private lateinit var btnRest2: ImageView
    private lateinit var btnCompras: ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



        spinnerExibicao()

        btnEnviar = findViewById(R.id.btnEnviar)
        btnEnviar.setOnClickListener {
            spinnerSelecionado()

        }

        btnCompras = findViewById(R.id.btnCompras)
        btnCompras.setOnClickListener{
            val navegarCompras = Intent(this,compras::class.java)
            startActivity(navegarCompras)
        }


        btnRest1 = findViewById(R.id.btnRest1)
        btnRest1.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView2, restaurante1()).commit()
        }

        btnRest2 = findViewById(R.id.btnRest2)
        btnRest2.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView2, restaurante2()).commit()
        }





    }

    private fun spinnerExibicao() {
        val zona =
            listOf("Escolha sua Região", "Zona Sul", "Zona Norte", "Zona Leste", "Zona Oeste")
        var spinnerZona: Spinner = findViewById(R.id.spinnerZona)

        spinnerZona.adapter = ArrayAdapter(
            this, android.R.layout.simple_spinner_dropdown_item,
            zona
        )
    }

    private fun spinnerSelecionado() {
        var spinnerZona: Spinner = findViewById(R.id.spinnerZona)
        var itemSelecionado = spinnerZona.selectedItem
        var txtResultado: TextView = findViewById(R.id.txtResultado)

        txtResultado.text = "Melhor Avaliado da ${itemSelecionado}:"

    }
}
