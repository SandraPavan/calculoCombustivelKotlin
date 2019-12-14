package com.example.calculocombustivel

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_resultado.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_resultado)
        setSupportActionBar(toolbar)

        val intent = intent
        if (intent != null) {
            val resultado = intent.getStringExtra("resultado")

            val campoResultado = findViewById<TextView>(R.id.resultado)
            campoResultado.text = resultado

        }

    }

}
