package com.example.seminario2pm.ejercicio17

//clase Nota. Una nota contiene un identificador numérico y una línea de texto. Define
//constructor, accedentes y toString.
open class Nota(val id: Int, private val texto: String) {
    override fun toString(): String {
        return "Nota -> $id:\n texto -> $texto"
    }
}

//clase NotaAlarma. Una nota que además contiene la hora en la que sonará la alarma. Define
//constructor, accedentes y toString.
class NotaAlarma(id: Int, texto: String, private val hora: String) : Nota(id, texto) {


    override fun toString(): String {
        return super.toString() + "\nSonara a las $hora"
    }
}

//clase BlocNotas que modela un bloc de notas en el que se pueden introducir notas, listar
//todas las notas, eliminar una nota mediante su posición en el bloc de notas o saber cuantas
//notas contiene el bloc de notas. Debes utilizar una colección.
class BlocNotas {
    companion object {
        var cont = 1
    }

    private var notas: MutableMap<Int, Nota> = mutableMapOf()

    fun addNota(nota: Nota) {
        if (notas.containsKey(nota.id)) {
            println("Ya existe esa nota")
        } else {
            notas[cont] = nota
            cont++
        }

    }

    fun verNotas() {
        println("\nESTAS SON TODAS LAS NOTAS DEL BLOC")
        for (n in notas) {
            println(n.toString())
            println("-------------------")
        }
    }

    fun delNota(posicion: Int) {
        notas.remove(posicion)
    }

    fun cantidadNotas(){
        println("Hay "+notas.size+" notas en total")
    }

}

fun main() {
    var nota1 = Nota(1,"SOY LA NOTA 1")
    var nota2 = Nota(2,"SOY LA NOTA 2")
    var nota3 = Nota(3,"SOY LA NOTA 3")
    var nota4 = Nota(4,"SOY LA NOTA 4")
    println(nota3.toString())

    var notaAlarma1 = NotaAlarma(5,"SOY LA NOTA ALARMA 5","08:45")
    var notaAlarma2 = NotaAlarma(6,"SOY LA NOTA ALARMA 6","09:00")
    var notaAlarma3 = NotaAlarma(7,"SOY LA NOTA ALARMA 7","10:00")
    println(notaAlarma2.toString())

    var bloc = BlocNotas()

    bloc.addNota(nota1)
    bloc.addNota(nota2)
    bloc.addNota(nota3)
    bloc.addNota(nota4)
    bloc.addNota(notaAlarma1)
    bloc.addNota(notaAlarma2)
    bloc.addNota(notaAlarma3)
    bloc.verNotas()
    bloc.cantidadNotas()

    bloc.delNota(4)
    bloc.delNota(5)
    bloc.delNota(6)
    bloc.verNotas()
    bloc.cantidadNotas()


}