//package com.example.domain.usecases
//
//import com.example.domain.entity.Question
//import com.example.domain.executor.PostExecutorThread
//import com.example.domain.repositories.QuestionRepository
//import io.reactivex.Observable
//
//class GetWordUseCase(private val wordRepository: QuestionRepository, postExecutorThread: PostExecutorThread) : BaseUseCase(postExecutorThread) {
//
//    fun get(wordPL: String): Observable<Question>? {
//        return wordRepository.get(wordPL)
//                ?.observeOn(postExecutorThread)
//                ?.subscribeOn(workExecutorThread)
//    }
//}
