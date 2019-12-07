package com.example.calculocombustivel

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_main)

        calcular.setOnClickListener {

          var gasolina =  gasolina.text.toString().toFloat()
          var  alcool =  alcool.text.toString().toFloat()

            if((gasolina * 0.7) > alcool){

                resultado.text = "Gasolina"
                Log.i("RESULTADO", "GASOLINA")

            }else{

                resultado.text = "Alcool"
                Log.i("RESULTADO", "ALCOOL")
            }

        }
    }

}
