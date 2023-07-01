package com.example.data.mapper

import com.example.data.entity.Result
import com.example.domain.entity.Popular

class Mapper {
    fun mapperToPopular(movies : List<Result>) : List<Popular> {
        return movies.toList().map {
            Popular(
                it.adult,
                it.backdrop_path,
                it.genre_ids,
                it.id,
                it.original_language,
                it.original_title,
                it.overview,
                it.popularity,
                it.poster_path,
                it.release_date,
                it.title,
                it.video,
                it.vote_average,
                it.vote_count
            )
        }
    }
}