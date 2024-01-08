package com.example.contactappfirebase.ui.add

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.contactappfirebase.data.KontakRepository
import com.example.contactappfirebase.ui.DetailKontak
import com.example.contactappfirebase.ui.UIStateKontak
import com.example.contactappfirebase.ui.toKontak

class AddViewModel(private val repositoriKontak: KontakRepository): ViewModel() {

    var uiStateKontak by mutableStateOf(UIStateKontak())
        private set

    fun updateUiState(detailKontak: DetailKontak) {
        uiStateKontak = UIStateKontak(detailKontak = detailKontak)
    }

    suspend fun saveKontak() {
        repositoriKontak.save(uiStateKontak.detailKontak.toKontak())
    }
}