package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Recuperar os componentes edit text
        // Criar uma váriavel que armazene a entrada do usuário UI TextInputEditText

        //Recuperar edit text - Campos de textos
        val edtPeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)

        //Recuperando botao calcular
        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnCalcular.setOnClickListener {
            val peso = edtPeso.text
            val altura = edtAltura.text

            //val imc = peso / altura * altura

            println("Seu IMC é de altura")
        }



    }
}