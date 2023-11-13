package com.example.seminario2pm.`ejercicio11-13`


//Ejercicio 11. Crea la clase equipo de fútbol que contenga el nombre y país del equipo
class Equipo(val nombre:String, val pais:String)


fun main() {

    //Ejercicio 12. Crea una lista con 16 equipos de fútbol de países distintos (no puede
    //haber más de cuatro equipos por país)
    var lista = mutableListOf(
        Equipo("1","ESPAÑA"),
        Equipo("2","ESPAÑA"),
        Equipo("3","ESPAÑA"),
        Equipo("4","ESPAÑA"),

        Equipo("5","FRANCIA"),
        Equipo("6","FRANCIA"),
        Equipo("7","FRANCIA"),
        Equipo("8","FRANCIA"),

        Equipo("9","BRASIL"),
        Equipo("10","BRASIL"),
        Equipo("11","BRASIL"),
        Equipo("12","BRASIL"),

        Equipo("13","MURCIA"),
        Equipo("14","MURCIA"),
        Equipo("15","MURCIA"),
        Equipo("16","MURCIA"),

    )


    //Ejercicio 13. Crea la función championsLeagueque recibe como entrada la lista con
    //los 16 equipos y muestra por pantalla un sorteo de octavos* de final de la Champions.
    //*(no tengas en cuenta que equipos de un mismo país no pueden enfrentarse)
    println(championsLeague(lista))


}


fun championsLeague(equipos:List<Equipo>):String{
    var lista = equipos.toMutableList()
    var out = ""

    for (i in 1 .. equipos.size/2){
        var local = lista.random()
        lista.remove(local)

        var visitante = lista.random()
        lista.remove(visitante)

        out += "Partido $i\n"
        out += local.nombre+" -> "+visitante.nombre+"\n"
        out += "--------------------------------\n"

    }

    return out

}

