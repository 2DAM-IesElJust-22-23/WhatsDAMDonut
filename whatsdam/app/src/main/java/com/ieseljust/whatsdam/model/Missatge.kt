package com.ieseljust.whatsdam.model

data class Missatge (val nomUsuari: String, val text: String)

object Gestor {
    val llistaMissatges = mutableListOf<Missatge>()

    fun afegirMissatge(nomUsuari: String, text: String){
        val missatge = Missatge(nomUsuari, text)
        llistaMissatges.add(missatge)
    }
}