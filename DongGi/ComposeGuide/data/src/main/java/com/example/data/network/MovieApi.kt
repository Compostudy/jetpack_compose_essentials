package com.example.data.network

import com.example.data.entity.PopularResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {
    @GET("popular")
    suspend fun getPopular(
        @Query("language") language : String,
        @Query("page") page : Int
    ) : Response<PopularResponse>
}
