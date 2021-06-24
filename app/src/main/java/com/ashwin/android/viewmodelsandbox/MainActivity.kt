package com.ashwin.android.viewmodelsandbox

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.ashwin.android.viewmodelsandbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.viewModelButton.setOnClickListener {
            startActivity(Intent(this@MainActivity, MainActivity::class.java))
        }

        binding.androidViewModelButton.setOnClickListener {
            startActivity(Intent(this@MainActivity, MainAndroidActivity::class.java))
        }
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.d("view-model", "onConfigurationChanged: $newConfig")
    }

    override fun onStart() {
        super.onStart()
        logInstance()
    }

    private fun logInstance() {
        Log.d("view-model", "MainViewModel: $viewModel")
        Log.d("view-model", "MainActivity: ${this@MainActivity}\n")
    }
}
