package com.example.lena.finalapp.presentation.screen.activityTest

import android.arch.lifecycle.ViewModelProviders
import com.example.lena.finalapp.R
import com.example.lena.finalapp.databinding.ActivityTestBinding
import com.example.lena.finalapp.presentation.base.BaseMvvmActivity

/**
 * Created by user on 08.12.2018.
 */
class TestActivity : BaseMvvmActivity<TestViewModel, TestRouter, ActivityTestBinding>() {

    override fun prodiveViewModel(): TestViewModel {
        return ViewModelProviders.of(this).get(TestViewModel::class.java)
    }

    override fun provideRouter(): TestRouter = TestRouter(this)


    override fun provideLayoutId(): Int = R.layout.activity_test
}