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

    fun encontrar(anio:Int,plataforma: String){
        for (v in juegos){
            if (anio==v.anio && plataforma==v.plataforma){
                println(v.toString())
            }
        }
    }

    fun encontrar(anio:Int){
        for (v in juegos){
            if (anio==v.anio){
                println(v.toString())
            }
        }
    }

    fun encontrar(plataforma: String){
        for (v in juegos){
            if (plataforma==v.plataforma){
                println(v.toString())
            }
        }
    }


}
