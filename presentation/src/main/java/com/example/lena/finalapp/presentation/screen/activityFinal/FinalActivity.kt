package com.example.lena.finalapp.presentation.screen.activityTest

import android.arch.lifecycle.ViewModelProviders
import com.example.lena.finalapp.R
import com.example.lena.finalapp.databinding.ActivityTestBinding
import com.example.lena.finalapp.presentation.base.BaseMvvmActivity

/**
 * Created by user on 08.12.2018.
 */
class FinalActivity : BaseMvvmActivity<FinalViewModel, FinalRouter, ActivityTestBinding>() {

    override fun prodiveViewModel(): FinalViewModel {
        return ViewModelProviders.of(this).get(FinalViewModel::class.java)
    }

    override fun provideRouter(): FinalRouter = FinalRouter(this)


    override fun provideLayoutId(): Int = R.layout.activity_test
}