package com.example.contactappfirebase.ui

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.contactappfirebase.KontakApplication
import com.example.contactappfirebase.ui.add.AddViewModel

fun CreationExtras.aplikasiKontak(): KontakApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as KontakApplication)

object PenyediaViewModel{
    val Factory = viewModelFactory {
        initializer {
            AddViewModel(aplikasiKontak().container.kontakRepository)
        }

    }
}