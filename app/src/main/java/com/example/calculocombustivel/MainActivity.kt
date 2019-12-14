package com.example.calculocombustivel

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.content_calculo.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_calculo)

        listarPosto.setOnClickListener{
            val intent = Intent(this@MainActivity, PostoActivity::class.java)
            startActivity(intent)
        }

        calcular.setOnClickListener {

          var gasolina =  gasolina.text.toString().toFloat()
          var  alcool =  alcool.text.toString().toFloat()
          var resultado = ""

            if((gasolina * 0.7) > alcool){

                resultado  = "Gasolina"
                Log.i("RESULTADO", "GASOLINA")

            }else{

                resultado =  "Alcool"
                Log.i("RESULTADO", "ALCOOL")
            }

            val intent = Intent(this@MainActivity, Main2Activity::class.java)
            intent.putExtra("resultado", resultado)
            startActivity(intent)




        }
    }

}
