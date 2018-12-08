package com.example.lena.finalapp.presentation.screen.activityTest

import android.databinding.ObservableField
import android.view.View
import com.example.lena.finalapp.presentation.base.BaseViewModel
import java.util.*

/**
 * Created by user on 08.12.2018.
 */
class FinalViewModel : BaseViewModel<FinalRouter>() {

    var result = 0

    var resultText = ObservableField<String>("")

    init {
        result = Random().nextInt(12)
    }


    fun onClick(v: View) {
        router?.goToMain()
    }
}