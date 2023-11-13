//Ejercicio 4: Registro de Estudiantes
//Crea una clase llamada Estudiante que contenga información como nombre, edad y
//calificaciones. Luego, crea una lista de objetos Estudiante y permite a los usuarios agregar
//nuevos estudiantes, mostrar la información de un estudiante en particular y calcular el promedio
//de calificaciones de todos los estudiantes.


package com.example.seminario2pm.ejercicio4

fun main() {
    var estudiante = Estudiante("Nombre",21,9.99)
    var clase = Estudiantes()
    clase.agregar(estudiante)
    clase.agregar("Nombre2",4,7.8)
    clase.calcularMedia()
    clase.mostrar("Nombre2")
}
class Estudiante {
    var nombre = ""
    var edad = 0
    var calificacion = 0.0

    constructor(n:String, e:Int, c:Double){
        this.nombre=n
        this.edad=e
        this.calificacion=c
    }
}

class Estudiantes{
    var estudiantes : MutableList<Estudiante> = mutableListOf()

    fun agregar(n: String,e: Int,c: Double){
        if (estudiantes.isEmpty()){
            println("NO HAY ESTUDIANTES")
        }else{
            var nuevo = Estudiante(n,e,c)
            estudiantes.add(nuevo)
        }

    }
    fun agregar(estudiante: Estudiante){
        if (estudiantes.isEmpty()){
            println("NO HAY ESTUDIANTES")
        }else {
            estudiantes.add(estudiante)
        }
    }

    fun mostrar(n: String){
        if (estudiantes.isEmpty()){
            println("NO HAY ESTUDIANTES")
        }else{
            for (e in estudiantes){
                if (e.nombre==n){
                    println("-------------------")
                    println(e.nombre)
                    println(e.edad)
                    println(e.calificacion)
                    println("-------------------")
                }

            }

        }

    }

    fun calcularMedia(){
        if (estudiantes.isEmpty()){
            println("NO HAY ESTUDIANTES")
        }else{
            var cont = 0
            var suma = 0.0

            for (e in estudiantes){
                suma += e.calificacion
                cont ++
            }

            var media = suma/cont

            println("LA MEDIA DE LOS ALUMNOS ES DE "+media)

        }

    }


}