package com.mariano.projectobase

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        appSingleton = this
    }

    fun getSharedPrefs(): SharedPreferences {
        return getSharedPreferences("ProyectoAppData", Context.MODE_PRIVATE)
    }

    companion object {

        lateinit var appSingleton: App

        fun getInstance(): App{
            return appSingleton
        }
    }
}