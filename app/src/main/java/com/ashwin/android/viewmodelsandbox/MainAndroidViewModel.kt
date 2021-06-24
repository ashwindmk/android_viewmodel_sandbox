package com.ashwin.android.viewmodelsandbox

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel

class MainAndroidViewModel(application: Application) : AndroidViewModel(application) {
    init {
        Log.d("view-model", "MainAndroidViewModel application: $application")
    }
}
