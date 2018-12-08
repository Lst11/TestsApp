//package com.example.domain.usecases
//
//import com.example.domain.entity.Question
//import com.example.domain.executor.PostExecutorThread
//import com.example.domain.repositories.QuestionRepository
//import io.reactivex.Observable
//
//class GetWordsUseCase(private val wordRepository: QuestionRepository, postExecutorThread: PostExecutorThread) : BaseUseCase(postExecutorThread) {
//
//    fun getAll(): Observable<List<Question>> {
//        return wordRepository.getAll()
//                ?.observeOn(postExecutorThread)
//                ?.subscribeOn(workExecutorThread)
//    }
//}
