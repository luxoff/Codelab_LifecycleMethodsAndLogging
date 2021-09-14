package com.example.codelablifecyclemethodsandlogging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.i("onCreate method called")
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Timber.i("onStart was called")
    }
}