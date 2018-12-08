package com.example.domain.usecases

import com.example.domain.entity.Question
import com.example.domain.executor.PostExecutorThread
import com.example.domain.repositories.QuestionRepository
import io.reactivex.Observable
import javax.inject.Inject

class GetTranslateUseCase @Inject constructor (private val wordRepository: QuestionRepository, postExecutorThread: PostExecutorThread) : BaseUseCase(postExecutorThread) {

    fun getTranslate(wordPL: String): Observable<Question>? {
        return wordRepository.getTranslate(wordPL).observeOn(postExecutorThread).subscribeOn(workExecutorThread)
    }
}
