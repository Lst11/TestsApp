package com.gmail.superarch.inject

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DomainModule::class])
interface AppComponent {

//    fun inject(viewModel: TranslateViewModel)
}