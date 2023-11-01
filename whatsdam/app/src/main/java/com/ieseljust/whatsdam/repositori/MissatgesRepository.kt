package com.ieseljust.whatsdam.repositori
import com.ieseljust.whatsdam.model.Missatge
import com.ieseljust.whatsdam.model.Gestor

class MissatgesRepository private constructor(){


    companion object {
        private var INSTANCE: MissatgesRepository? = null

        fun getInstance(): MissatgesRepository {
            if (INSTANCE == null){
                INSTANCE = MissatgesRepository()
            }
            return INSTANCE!!
        }
    }
    fun getLlista() = Gestor.llistaMissatges
    fun getQuanMiss() = Gestor.llistaMissatges.size
    fun add(nom:String, text:String) {
        Gestor.afegirMissatge(nom, text)
    }

}