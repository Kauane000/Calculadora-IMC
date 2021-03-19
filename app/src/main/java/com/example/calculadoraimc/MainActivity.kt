package com.example.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.doOnAttach
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners(){
        altura.doOnAttach { text ->
             //Toast.makeText( "this", Toast.LENGTH_SHORT).show()

        }
        peso.doOnAttach { text ->
          //  title.text = text
        }
        button.setOnClickListener{
            Calcular(peso.text.toString(), altura.text.toString())
        }
    }

    private fun Calcular(peso: String, altura: String) {
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()
        if(peso != null && altura != null){
            val imc = peso / (altura * altura)
            retorno.text = "Seu IMC é $imc"
        }

    }
}