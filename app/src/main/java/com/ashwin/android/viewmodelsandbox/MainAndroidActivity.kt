package com.ashwin.android.viewmodelsandbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.ashwin.android.viewmodelsandbox.databinding.ActivityMainAndroidBinding

class MainAndroidActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainAndroidBinding
    private lateinit var viewModel: MainAndroidViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainAndroidBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //viewModel = ViewModelProvider(this).get(MainAndroidViewModel::class.java)
        viewModel = ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory(application)).get(MainAndroidViewModel::class.java)
    }

    override fun onStart() {
        super.onStart()
        logInstance()
    }

    private fun logInstance() {
        Log.d("view-model", "MainAndroidViewModel: $viewModel")
        Log.d("view-model", "MainAndroidActivity: ${this@MainAndroidActivity}")
    }
}