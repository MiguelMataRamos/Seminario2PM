//Ejercicio 14: Crea la clase circunferencia. El constructor primario recibirá el
//radio de la circunferencia y el secundario recibirá la posición del centro de la
//circunferencia y un punto cualquiera de la misma. Crear el método longitud()
//y sobrecargar el método toString() de forma que muestre toda la info de la
//circunferencia
package com.example.seminario2pm.ejercicio14

import kotlin.math.PI

open class Circunferencia(var radio:Double) {
    var centro = mutableListOf(0,0)

    constructor(radio: Double, centro:ArrayList<Int>, punto:ArrayList<Int>):this(radio){
        this.centro = centro
        this.radio = ((punto[0]-centro[0])*(punto[0]-centro[0]) + (punto[1] - centro[1]) * (punto[1] - centro[1])).toDouble()

    }

    fun longitud():Double{
        return 2 * PI * radio
    }

    @Override
    override fun toString(): String {
        return "Su radio es de "+longitud()+"\nSu centro es "+centro.toString()
    }
}