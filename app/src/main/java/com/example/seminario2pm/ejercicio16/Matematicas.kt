//Ejercicio 16: Clase de matemáticas. Crea una clase Matemáticas con métodos para realizar
//operaciones matemáticas como sumar, restar, multiplicar y dividir. Luego, utiliza esta clase en tu
//programa principal.
package com.example.seminario2pm.ejercicio16

class Matematicas {
    fun sumar(n1: Int, n2: Int): Int {
        return n1 + n2
    }
    fun sumar(n1: Double, n2: Double): Double {
        return n1 + n2
    }


    fun restar(n1: Int, n2: Int): Int {
        return n1 - n2
    }
    fun restar(n1: Double, n2: Double): Double {
        return n1 - n2
    }


    fun dividir(n1: Int, n2: Int): Int {
        return n1/n2
    }
    fun dividir(n1: Double, n2: Double): Double {
        return n1/n2
    }


}

fun main() {
    var m = Matematicas()
    println(m.sumar(1,2))
    println(m.sumar(5.2,5.9))

    println(m.restar(2,5))
    println(m.restar(6.2,2.5))

    println(m.dividir(2,3))
    println(m.dividir(4.5,6.0))

}

