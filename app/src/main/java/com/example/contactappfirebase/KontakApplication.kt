package com.example.contactappfirebase

import android.app.Application
import com.example.contactappfirebase.data.AppContainer
import com.example.contactappfirebase.data.KontakContainer

class KontakApplication: Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()

        container = KontakContainer()
    }
}