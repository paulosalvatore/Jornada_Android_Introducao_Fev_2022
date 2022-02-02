package com.oceanbrasil.jornada_android_introducao_fev_2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        // Pega a informação recebida da intent (usando o nome que passamos anteriormente)
        val nomeDigitado = intent.getStringExtra("NOME_DIGITADO")

        // Buscamos o elemento TextView na tela (usando o ID)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        // Atualizamos o texto do elemento para o valor que foi recebido
        tvResultado.text = nomeDigitado
    }
}
