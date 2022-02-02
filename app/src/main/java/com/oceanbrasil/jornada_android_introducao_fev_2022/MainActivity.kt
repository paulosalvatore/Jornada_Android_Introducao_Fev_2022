package com.oceanbrasil.jornada_android_introducao_fev_2022

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Adicionar um Listener ao botão
        // 1 - Pegar o botão
        // 2 - Adicionar o listener

        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val etName = findViewById<EditText>(R.id.etName)

        // Dentro das chaves, o código que escrevemos será executado apenas
        // quando o botão for clicado
        btEnviar.setOnClickListener {
            // Código para executar quando o botão for clicado

            val name = etName.text.toString()

            if (name.isNotBlank()) {
                tvResultado.text = name
            } else {
                etName.error = "Digite um nome válido"
            }
        }
    }
}
