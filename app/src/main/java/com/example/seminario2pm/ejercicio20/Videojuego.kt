//Ejercicio 20. Crea la clase de datos Videojuego, que tendrá nombre, año y plataforma del
//juego. Crea una lista con 8 videojuegos de tres plataformas distintas. Crea una función
//que dada una lista de juegos, una año y una plataforma devuelve los juegos de la lista de
//dicho año y plataforma. La función también debe poder usarse especificando solo el año
//o solo la plataforma.

package com.example.seminario2pm.ejercicio20

class Videojuego(var nombre: String, var anio: Int, var plataforma: String)

fun main() {
    var juegos = mutableListOf(
        Videojuego("The Legend of Zelda: Breath of the Wild", 2017, "Nintendo Switch"),
        Videojuego("God of War", 2018, "PlayStation 4"),
        Videojuego("Super Mario Odyssey", 2017, "Nintendo Switch"),
        Videojuego("Red Dead Redemption 2", 2018, "PlayStation 4"),
        Videojuego("Fortnite", 2017, "Multiplataforma"),
        Videojuego("Minecraft", 2011, "Multiplataforma"),
        Videojuego("Overwatch", 2016, "Multiplataforma"),
        Videojuego("The Witcher 3: Wild Hunt", 2015, "Multiplataforma")
    )

    fun encontrar(lista: MutableList<Videojuego>, anio: Int, plataforma: String) {
        for (v in lista) {
            if (anio == v.anio && plataforma == v.plataforma) {
                println(v.toString())
            }
        }
    }

    fun encontrar(lista: MutableList<Videojuego>, anio: Int) {
        for (v in lista) {
            if (anio == v.anio) {
                println(v.toString())
            }
        }
    }

    fun encontrar(lista: MutableList<Videojuego>, plataforma: String) {
        for (v in lista) {
            if (plataforma == v.plataforma) {
                println(v.toString())
            }
        }
    }

    //    Ejercicio 21. Crear una función que dada una lista de videojuegos, lista de años y lista de
//    plataformas devuelva los juegos de la lista que fueron creados en esos años y para esas
//    plataformas. La función debe poder usarse si solo se especifica la lista de años o la lista
//    de plataformas.

    var anios = mutableListOf(2018, 2017, 2015)
    var plataformas = mutableListOf("PlayStation 4", "Nintendo Switch")

    fun encontrar(lista_j: MutableList<Videojuego>, lista_p: MutableList<String>) {
        for (v in lista_j){
            if (v.plataforma in lista_p){
                println(v.toString())
            }
        }
    }

    fun encontrar(lista_j: MutableList<Videojuego>, lista_a: MutableList<Int>) {
        for (v in lista_j){
            if (v.anio in lista_a){
                println(v.toString())
            }
        }
    }


    //    Ejercicio 22. Crea una función que reciba una lista de juegos y devuelva un mapa
//    donde las claves sean las plataformas y el valor el número de juegos para dicha
//    plataforma.

    fun toMap(lista: MutableList<Videojuego>) {
        var mapa = mutableMapOf<String,Int>()

        for (v in lista){
            var cant = mapa.getOrDefault(v.plataforma,0)
            mapa.put(v.plataforma,cant+1)
        }

        println(mapa)

    }

    toMap(juegos)

}
