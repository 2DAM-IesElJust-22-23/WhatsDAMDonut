package com.ieseljust.whatsdam.ViewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.ieseljust.whatsdam.repositori.MissatgesRepository

class ViewModel(application: Application): AndroidViewModel(application) {
    private val _adaptador = MutableLiveData<Adaptador>().apply {
        value = Adaptador()

    }

    val adaptador:MutableLiveData<Adaptador> = _adaptador

    fun add(nom:String, text:String){
        (MissatgesRepository.getInstance().add(nom, text))
        adaptador.value?.notifyItemInserted(MissatgesRepository.getInstance().getQuanMiss()-1)
    }

}