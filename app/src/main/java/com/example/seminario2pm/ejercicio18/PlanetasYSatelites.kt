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
    val nombre: String, val masa: Double,
    val diametro: Double,
    val periodoRotacion: Double,
    val distanciaMediaAlCuerpo: Double
) {
    override fun toString(): String {
        return "Información sobre $nombre:\n" +
                "Masa: $masa kg\n" +
                "Diámetro medio: $diametro km\n" +
                "Período de rotación: $periodoRotacion horas\n" +
                "Distancia media al cuerpo que orbita: $distanciaMediaAlCuerpo km\n"
    }
}

class Planeta(nombre: String,diametro: Double,periodoRotacion: Double,distanciaMediaAlCuerpo: Double)



