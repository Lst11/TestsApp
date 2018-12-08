//package com.example.domain.usecases
//
//import com.example.domain.executor.PostExecutorThread
//import com.example.domain.repositories.QuestionRepository
//import io.reactivex.Completable
//
//class AddWordUseCase(private val wordRepository: QuestionRepository, postExecutorThread: PostExecutorThread) : BaseUseCase(postExecutorThread) {
//
//    fun add(wordPL: String): Completable {
//        return wordRepository.add(wordPL)
//                ?.observeOn(postExecutorThread)
//                ?.subscribeOn(workExecutorThread)
//    }
//}
