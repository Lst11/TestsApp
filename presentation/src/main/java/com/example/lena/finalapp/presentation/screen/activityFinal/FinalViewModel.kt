package com.example.lena.finalapp.presentation.screen.activityTest

import android.databinding.ObservableField
import android.util.Log
import android.view.View
import com.example.lena.finalapp.presentation.base.BaseViewModel
import java.util.*
import kotlin.collections.ArrayList

/**
 * Created by user on 08.12.2018.
 */
class FinalViewModel : BaseViewModel<FinalRouter>() {

    var result = ObservableField<String>("")

    val list: MutableList<String> = mutableListOf(
            "рождественская снежинка",
            "рождественская свеча",
            "рождественский санта",
            "рождественский снеговик"
    )


    init {
        val resultInt = Random().nextInt(3)
        Log.e("aaa", resultInt.toString())
        result.set(list[resultInt])

    }


    fun onClick(v: View) {
        router?.goToMain()
    }
}