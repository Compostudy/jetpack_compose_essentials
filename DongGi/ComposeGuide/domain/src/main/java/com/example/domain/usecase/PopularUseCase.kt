package com.example.domain.usecase

import com.example.domain.entity.Popular
import com.example.domain.repository.MovieRepository

class PopularUseCase(private val repository: MovieRepository) {
    suspend operator fun invoke(page: Int): List<Popular> = repository.popularMovie(page)
}