package com.pjurado.sharedviewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel(): ViewModel() {
    private val _nombre = MutableLiveData<String>()
    val nombre: LiveData<String> get() = _nombre

    fun setNombre(nombre: String) {
        _nombre.value = nombre
    }
}