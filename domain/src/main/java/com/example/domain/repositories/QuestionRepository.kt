package com.example.domain.repositories

import com.example.domain.entity.Question
import io.reactivex.Observable

interface QuestionRepository : BaseRepository {

    fun generateData(): Observable<List<Question>>
}