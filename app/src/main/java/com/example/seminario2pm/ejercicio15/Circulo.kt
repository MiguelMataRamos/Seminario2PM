//Ejercicio 15: Crea la clase Círculo que hereda de circunferencia. Tendrá dos
//constructores, el primero recibirá el radio y el color del círculo y el segundo
//su centro, un punto cualquiera y su color. Crear el método área() y
//sobrecargar el método toString() de forma que muestre toda la info de la
//circunferencia
package com.example.seminario2pm.ejercicio15

import com.example.seminario2pm.ejercicio14.Circunferencia
import kotlin.math.PI


class Circulo(radio: Double, private val color: String) : Circunferencia(radio) {

    constructor(radio: Double, color: String, centro: ArrayList<Int>, punto: ArrayList<Int>) : this(radio,color) {
        this.centro = centro
        this.radio =
            ((punto[0] - centro[0]) * (punto[0] - centro[0]) + (punto[1] - centro[1]) * (punto[1] - centro[1])).toDouble()
    }

    private fun area(): String {
        return (PI * radio * radio).toString()
    }

    @Override
    override fun toString(): String {
        return super.toString() + "\nSu color es $color \nsu area es " + area()
    }

}

fun main() {
    var c = Circulo(2.0, "Rojo")
    println(c.toString())
}