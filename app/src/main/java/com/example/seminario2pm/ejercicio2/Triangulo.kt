//Ejercicio 2. Crear la clase triangulo. Propiedades: longitud de los tres lados, perímetro,
//tipo de triángulo (isósceles, escaleno o equilátero). Implementar el método
//.rectangulo():Boolean que calcula si el triángulo es rectángulo. Nota (se parte de la
//hipótesis de que la longitud de los lados dados crean un triángulo)

package com.example.seminario2pm.ejercicio2

fun main() {
    val triangulo1 = Triangulo(3.0, 4.0, 5.0)
    println("Triángulo 1:")
    println("Perímetro: "+triangulo1.perimetro)
    println("Tipo: "+triangulo1.tipo)
    println("¿Es rectángulo? "+triangulo1.esRectangulo())

    val triangulo2 = Triangulo(2.0, 2.0, 3.0)
    println("Triángulo 2:")
    println("Perímetro: "+triangulo2.perimetro)
    println("Tipo: "+triangulo2.tipo)
    println("¿Es rectángulo? "+triangulo2.esRectangulo())
}
class Triangulo (var lado1 : Double,var lado2 : Double,var lado3 : Double){
    var perimetro : Double = lado1 + lado2 + lado3

    var tipo : String = when {
        lado1 == lado2 && lado2 == lado3 -> "Equilatero"
        lado1 == lado2 || lado2 == lado3 -> "Isosceles"
        else -> "Escaleno"
    }

    /*
    fun tipoTriangulo(){
        if (lado1 == lado2 && lado2 == lado3){
            tipo = "Equilatero"
        }else if (lado1 == lado2 || lado2 == lado3){
            tipo = "Isosceles"
        }else{
            tipo =  "Escaleno"
        }
    }
     */

    fun esRectangulo():Boolean{
        val lados = listOf(lado1, lado2, lado3)
        lados.sorted()

        return (lados[0] * lados[0] + lados[1] * lados[1] == lados[2] * lados[2])
    }

}