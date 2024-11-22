package com.comunidadedevspace.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
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

       //configurando acao botao
        btnCalcular.setOnClickListener {
            val pesoStr: String = edtPeso.text.toString()
            val alturaStr : String  = edtAltura.text.toString()

            if(pesoStr == "" && alturaStr == ""){
                //Mostrar mensagem para o usuario
                Snackbar.make(
                    edtPeso,
                    "Preencha todos os campos",
                    Snackbar.LENGTH_LONG
                ).show()

            } else{
                val peso = pesoStr.toFloat()
                val altura = alturaStr.toFloat()

                val alturaQ2 = altura * altura
                val resultado = peso / alturaQ2

                //NAVEGAR PARA A PROXIMA TELA
                // CRIAR O LAYOUT DA PROXIMA TELA
                //PROGRAMAR A PROXIMA TELA

                //INTENT - CLASSE DO PROPRIO ANDROID

                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra(KEY_RESULT_IMC, resultado)
                startActivity(intent)

            }

        }



    }
}