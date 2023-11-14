//Crea la clase PNJ que representa un personaje en un juego de rol.
//La clase tendrá los atributos, nombre, PV –Puntos de Vida-, PM
//–Puntos mágicos- y LVL. Crea las clases hijas de PNJ Guerrero y
//Mago. Dichas clases implementarán el método levelUp() que
//incrementa el atributo LVL del personaje y sus atributos PV y MP.
//Los guerreros por cada nuevo nivel tendrán un 8% más de PV y un
//1% más de PM mientras que los magos tendrán un 4% más de PV y
//un 3% más de PM.
package com.example.seminario2pm.ejercicio19

open class Pnj(val nombre: String, var PV: Double, var PM: Double, var LVL: Int = 0)

class Guerrero(nombre: String, PV: Double, PM: Double, LVL: Int) : Pnj(nombre, PV, PM, LVL){
    fun levelUp(niveles:Int){
        LVL += niveles
        for (i in 0 .. niveles){
            PV += PV * 8 / 100
            PM += PM / 100
        }
        PV += PV * (niveles*8)
    }
}

class Mago(nombre: String, PV: Double, PM: Double, LVL: Int) : Pnj(nombre, PV, PM, LVL){
    fun levelUp(niveles:Int){
        LVL += niveles
        for (i in 0 .. niveles){
            PV += PV * 4 / 100
            PM += PM * 3 / 100
        }
        PV += PV * (niveles*8)
    }
}

//Crear un guerrero de nivel 1 con 400PV y 50PM y
//un mago de nivel 1 con 1600PV y 150PM. Partiendo del hecho de
//que ambos personajes subirán de nivel siempre a la vez ¿en qué
//nivel el guerrero tendrá más PV que el mago?
fun main() {
    var guerrero = Guerrero("Jinete del Apocalipsis", 400.0,50.0,1)
    var mago = Mago("El susio potter",1600.0,150.0, 0)

    var cont=0
    do {
        guerrero.levelUp(1)
        mago.levelUp(1)
        cont ++
    }while (guerrero.PV<mago.PV)

    println("En el nivel $cont")

}