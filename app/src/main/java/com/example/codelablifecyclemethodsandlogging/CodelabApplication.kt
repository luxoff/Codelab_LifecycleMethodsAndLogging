package com.example.codelablifecyclemethodsandlogging

import android.app.Application
import timber.log.Timber

class CodelabApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}