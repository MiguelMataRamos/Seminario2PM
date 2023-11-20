//Define una jerarquía de clases que permita almacenar datos sobre los
//planetas y satélites que forman parte del sistema solar (junto con el sol).
//Algunos atributos que puede ser interesante recoger son: la masa del
//cuerpo, su diámetro medio, el período de rotación sobre el propio eje,
//período de traslación alrededor del cuerpo que orbitan, distancia media a
//ese cuerpo, excentricidad de la órbita, etc.
//Define un método que, dado un objeto del sistema solar (planeta o satélite),
//imprima toda la información de que se dispone sobre el mismo.
package com.example.seminario2pm.ejercicio18

open class CuerpoCeleste(
    val nombre: String,
    val masa: Double,
    val diametro: Double,
    val periodoRotacion: Double,
    val distanciaMedia: Double
) {
    override fun toString(): String {
        return "Información sobre $nombre:\n" +
                "Masa: $masa kg\n" +
                "Diámetro medio: $diametro km\n" +
                "Período de rotación: $periodoRotacion horas\n" +
                "Distancia media al cuerpo que orbita: $distanciaMedia km\n"
    }
}

class Planeta(
    nombre: String,
    masa: Double,
    diametro: Double,
    periodoRotacion: Double,
    distanciaMedia: Double,
    val excentricidadOrbita: Double,
    val periodoTraslacion: Double
) : CuerpoCeleste(nombre, masa, diametro, periodoRotacion, distanciaMedia) {
    override fun toString(): String {
        return "---Soy un planeta---\n" + super.toString() +
                "Excentridad de la orbita: $excentricidadOrbita\n " +
                "Periodo translacion: $periodoTraslacion"
    }
}


class Satelite(
    nombre: String,
    masa: Double,
    diametro: Double,
    periodoRotacion: Double,
    distanciaMedia: Double,
    val periodoTraslacion: Double
) : CuerpoCeleste(nombre, masa, diametro, periodoRotacion, distanciaMedia) {
    override fun toString(): String {
        return "---Soy un satelite---\n" + super.toString() +
                "Periodo translacion: $periodoTraslacion"

    }
}

fun info(p: CuerpoCeleste) {
    println(p.toString())
}

fun main() {
    val tierra = Planeta("Tierra", 5.97e24, 12742.0, 24.0, 365.25, 149.6e6, 0.0167)
    val luna = Satelite("Luna", 7.35e22, 3475.0, 27.3, 27.3, 384400.0)
    info(tierra)
    info(luna)

}