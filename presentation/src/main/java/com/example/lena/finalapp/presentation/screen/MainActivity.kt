package com.example.lena.finalapp.presentation.screen

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import com.example.lena.finalapp.R
import com.example.lena.finalapp.databinding.ActivityMainBinding
import com.example.lena.finalapp.presentation.base.BaseMvvmActivity


class MainActivity : BaseMvvmActivity<MainViewModel, MainRouter, ActivityMainBinding>() {

    override fun prodiveViewModel(): MainViewModel {
        return ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

    override fun provideRouter(): MainRouter = MainRouter(this)

    override fun provideLayoutId(): Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}


