package com.example.seminario2pm.`ejercicio6-10`

import com.example.seminario2pm.ejercicio1.Planeta


fun main() {

    //Ejercicio 7
//    var s = SistemaSolar()
//    s.mostrarInfo()

    //Ejercicio 8
//    s.mostrarPorLetra('M')

    //Ejercicio 9
//    s.gaseosoMasa20Veces()

    //Ejercicio 10
//    s.masaMedia()

}

class SistemaSolar {
    //Ejercicio 6. Crea una lista con los nueve planeta del Sistema Solar.
    //Usa la clase planeta creada en el ejercicio 1

    var lista = mutableListOf<Planeta>(
        Planeta("Tierra","Rocoso",5.0),
        Planeta("Mercurio","Rocoso",10.0),
        Planeta("Venus","Gaseoso",13.0),
        Planeta("Marte","Gaseoso",15.0),
        Planeta("Júpiter","Rocoso",12.0),
        Planeta("Saturno","Gaseoso",132.0),
        Planeta("Urano","Gaseoso",18.0),
        Planeta("Neptuno","Gaseoso",111.0)
        )

    fun planetaMayor(): Planeta {
        lista.sortBy { it.masa }
        return lista[0]
    }

    fun planetaMenor(): Planeta {
        lista.sortByDescending { it.masa }
        return lista[0]
    }



    //Ejercicio 7. Muestra por pantalla toda la información de todos los planetas
    fun mostrarInfo(){
        for (p in lista){
            println("-----------------")
            println(p.nombre)
            println(p.tipo)
            println(p.masa)
            println("-----------------")
        }
    }


    //Ejercicio 8. Muestra por pantalla todos los planetas que empiecen por la letra ‘M’
    fun mostrarPorLetra(letra:Char){
        for (p in lista){
            if (p.nombre[0] == letra){
                println("-----------------")
                println(p.nombre)
                println(p.tipo)
                println(p.masa)
                println("-----------------")
            }
        }
    }


    //Ejercicio 9. Muestra por pantalla todos los planetas gaseosos cuya masa sea superior a 20
    //veces la de la tierra
    fun gaseosoMasa20Veces(){
        for (p in lista){
            if (p.tipo=="Gaseoso" && p.masa>20.0){
                println("-----------------")
                println(p.nombre)
                println(p.tipo)
                println(p.masa)
                println("-----------------")
            }
        }
    }


    //Ejercicio 10. Muestra por pantalla la masa media de los planetas del sistema solar
    fun masaMedia(){
        var cont = 0
        var suma = 0.0

        for (p in lista){
            suma += p.masa
            cont++
        }

        var media = suma/cont

        println(media)

    }

}