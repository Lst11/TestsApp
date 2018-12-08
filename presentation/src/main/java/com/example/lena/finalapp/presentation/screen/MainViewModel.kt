package com.example.lena.finalapp.presentation.screen

import android.view.View
import com.example.lena.finalapp.presentation.base.BaseViewModel

class MainViewModel : BaseViewModel<MainRouter>() {

    fun onClickStart(v: View){
        router?.goToTest()
    }

}