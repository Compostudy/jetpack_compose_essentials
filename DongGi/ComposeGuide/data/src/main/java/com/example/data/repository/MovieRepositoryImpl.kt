package com.example.data.repository

import com.example.data.mapper.Mapper
import com.example.data.network.MovieApi
import com.example.domain.entity.Popular
import com.example.domain.repository.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val movieApi: MovieApi,
    private val mapper : Mapper
    ) : MovieRepository {
    override suspend fun popularMovie(page : Int): List<Popular> {
        val response = movieApi.getPopular("en-US", page)
        val body = response.body()
        return if(response.isSuccessful && body != null){
            body.results.let {
                mapper.mapperToPopular(it)
            }
        } else{
            listOf()
        }
    }
}
