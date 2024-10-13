package com.example.cp2mobile

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class compras : AppCompatActivity() {

    private lateinit var listViewCompras: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_compras)




        val listaDeCompras = listOf("RobDonald", "RobKing", "RobBack", "Rodeiro", "Robleto")


        listViewCompras = findViewById(R.id.listViewCompras)
        listViewCompras.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            android.R.id.text1,
            listaDeCompras
        )



    }
}