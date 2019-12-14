package com.example.calculocombustivel

import android.util.Log
import java.io.Serializable

data class Posto (
    var nome: String,
    var valorGasolina: Double,
    var valorAlcool: Double
) : Serializable{
    override fun toString(): String{
        return nome + " - Alcool: $valorAlcool : Gasolina $valorGasolina"
    }

     fun Calculo(): String {
         var resultado = ""
         if ((valorGasolina * 0.7) > valorAlcool) {

             resultado = "Use Gasolina."
             Log.i("RESULTADO", "GASOLINA")

         } else {

             resultado = "Use Alcool."
             Log.i("RESULTADO", "ALCOOL")
         }
         return resultado
     }
}
