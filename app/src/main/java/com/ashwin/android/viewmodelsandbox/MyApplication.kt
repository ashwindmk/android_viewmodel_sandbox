package com.ashwin.android.viewmodelsandbox

import android.app.Application
import android.util.Log

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.d("view-model", "MyApplication: $this")
    }
}
