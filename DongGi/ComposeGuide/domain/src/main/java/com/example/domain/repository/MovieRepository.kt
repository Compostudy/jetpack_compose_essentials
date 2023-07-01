package com.example.domain.repository

import com.example.domain.entity.Popular

interface MovieRepository {
    suspend fun popularMovie(page: Int) : List<Popular>
}