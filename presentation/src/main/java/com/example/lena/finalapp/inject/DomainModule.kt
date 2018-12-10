package com.gmail.superarch.inject

import android.content.Context
import com.example.data.repositories.QuestionRepositoryImpl
import com.example.domain.executor.PostExecutorThread
import com.example.domain.repositories.QuestionRepository
import com.example.lena.finalapp.executor.UIThread
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class DomainModule(private val context: Context) {

    @Provides
    @Singleton
    fun provideContext(): Context = context

    @Provides
    @Singleton
    fun providePostExecutorThread(): PostExecutorThread = UIThread()


    @Provides
    fun provideQuestionRepository()
            : QuestionRepository = QuestionRepositoryImpl(context)

}