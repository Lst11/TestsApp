package com.example.domain.repositories

import com.example.domain.entity.Question

interface QuestionRepository : BaseRepository {

    fun generateData(): MutableList<Question>

}