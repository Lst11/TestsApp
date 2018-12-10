package com.example.lena.finalapp.presentation.screen.activityTest

import android.databinding.ObservableField
import android.util.Log
import android.view.View
import com.example.domain.entity.Question
import com.example.domain.usecases.GetQuestionsUseCase
import com.example.lena.finalapp.presentation.base.BaseViewModel
import com.gmail.superarch.app.App
import io.reactivex.rxkotlin.subscribeBy
import javax.inject.Inject

/**
 * Created by user on 08.12.2018.
 */
class TestViewModel : BaseViewModel<TestRouter>() {

    var numberQuestion = 0

    var question = ObservableField<String>("")
    var answer1 = ObservableField<String>("")
    var answer2 = ObservableField<String>("")
    var answer3 = ObservableField<String>("")
    var answer4 = ObservableField<String>("")

    @Inject
    lateinit var getQuestionUseCase: GetQuestionsUseCase

    var list: List<Question> = emptyList()

    init {
        App.appComponent.inject(this)
        getQuestionUseCase.get().subscribeBy(
                onNext = {
                    list = it
                    Log.e("aaa", "TestViewModel - onNext: " + it.toString())
                    setData()
                },
                onError = {
                    Log.e("aaa", "TestViewModel - onError: " + it.toString())
                })
        numberQuestion++

    }

    fun onClickNext(v: View) {
        if (numberQuestion < 10) {
            setData()
            numberQuestion++
        } else router?.goToFinish()
    }

    fun setData() {
        question.set(list[numberQuestion].question)
        answer1.set(list[numberQuestion].answer1)
        answer2.set(list[numberQuestion].answer2)
        answer3.set(list[numberQuestion].answer3)
        answer4.set(list[numberQuestion].answer4)
    }

    fun onClickPlay(v: View) {

    }
}

