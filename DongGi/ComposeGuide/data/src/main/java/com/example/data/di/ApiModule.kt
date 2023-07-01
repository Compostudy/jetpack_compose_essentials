package com.example.data.di

import com.example.data.network.MovieApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import retrofit2.Retrofit


@Module
@InstallIn(SingletonComponent::class)
object ApiModule {
    @Provides
    @Singleton
    fun providesMovieApi(retrofit: Retrofit): MovieApi =
        retrofit.create(MovieApi::class.java)
}