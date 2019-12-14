package com.example.calculocombustivel

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_posto.*

class PostoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_posto)
                val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, posto)
                var lista = findViewById<ListView>(R.id.lstpostos) as ListView
                lista.adapter = adapter

                lista.setOnItemClickListener {parent, view, position, id ->
                    var postoPosicao: Posto = posto.get(position)
                    var resultadoPosto = postoPosicao.Calculo()
                    var nome = postoPosicao.nome
                    Toast.makeText(this, " $resultadoPosto No $nome",Toast.LENGTH_SHORT).show()
                }
            }


            companion object {
                var posto1: Posto = Posto(nome="Shell",valorAlcool = 2.89,valorGasolina = 4.27)
                var posto2: Posto = Posto(nome="Petrobras",valorAlcool = 2.99,valorGasolina = 4.35)
                var posto3: Posto = Posto(nome="Ipiranga",valorAlcool = 2.79,valorGasolina = 4.17)
            internal val posto = arrayOf(posto2, posto3,posto1,posto2)
        }
}


