package com.example.domain.usecases

import com.example.domain.entity.Question
import com.example.domain.executor.PostExecutorThread
import com.example.domain.repositories.QuestionRepository
import io.reactivex.Observable
import javax.inject.Inject

class GetQuestionsUseCase @Inject constructor(
        postExecutorThread: PostExecutorThread,
        private val questionsRepository: QuestionRepository
) : BaseUseCase(postExecutorThread) {

    fun get(): Observable<List<Question>> {
        return questionsRepository.generateData()
                .observeOn(postExecutorThread)
                .subscribeOn(workExecutorThread)
    }
}