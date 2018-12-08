package com.example.domain.entity

data class Question(val question: String,
                    val answer1: String,
                    val answer2: String,
                    val answer3: String,
                    val answer4: String) : DomainEntity