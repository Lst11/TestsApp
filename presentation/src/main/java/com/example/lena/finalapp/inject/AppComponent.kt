package com.gmail.superarch.inject

import com.example.lena.finalapp.presentation.screen.activityTest.TestViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DomainModule::class])
interface AppComponent {

    fun inject(viewModel: TestViewModel)
}