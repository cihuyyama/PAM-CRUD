package com.example.contactappfirebase.ui

import com.example.contactappfirebase.model.Kontak

data class DetailKontak(
    val id: String = "",
    val nama: String = "",
    val alamat: String = "",
    val telpon: String = ""
)

data class UIStateKontak(
    val detailKontak: DetailKontak = DetailKontak(),
)

fun Kontak.toDetailKontak(): DetailKontak = DetailKontak(
    id = id,
    nama = nama,
    alamat = alamat,
    telpon = telepon
)

fun Kontak.toUiStateKontak(isEntryValid: Boolean = false): UIStateKontak = UIStateKontak(
    detailKontak = this.toDetailKontak(),
)

fun DetailKontak.toKontak(): Kontak = Kontak(
    id = id,
    nama = nama,
    alamat = alamat,
    telepon = telpon
)
