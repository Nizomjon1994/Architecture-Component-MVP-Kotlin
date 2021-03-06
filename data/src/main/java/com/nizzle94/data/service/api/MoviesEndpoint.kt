package com.nizzle94.data.service.api

import com.nizzle94.data.reponse.GenreResponse
import com.nizzle94.data.reponse.MovieDetailResponse
import com.nizzle94.data.reponse.MoviesResponse
import com.nizzle94.data.reponse.TvListResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Created by Khajiev Nizomjon on 06/06/2018.
 */
interface MoviesEndpoint {


    @GET("/3/genre/movie/list?api_key=e1158b8ecd86f1263edb032b433add44&language=en-US")
    fun getGenreList(): Single<GenreResponse>

    @GET(
        "/3/genre/{genre_id}/movies?api_key=e1158b8ecd86f1263edb032b433add44" +
                "&language=en-US"
    )
    fun getMoviesByGenre(@Path("genre_id") genreId: Int): Single<MoviesResponse>

    @GET("/3/movie/{movie_id}?api_key=e1158b8ecd86f1263edb032b433add44")
    fun getMovieDetail(@Path("movie_id") movieId: Int): Single<MovieDetailResponse>


    @GET("/3/search/movie?api_key=e1158b8ecd86f1263edb032b433add44")
    fun getMovieListByQuery(@Query("query") keyword: String): Single<MoviesResponse>

    @GET("/3/genre/tv/list?api_key=e1158b8ecd86f1263edb032b433add44")
    fun getTvList(): Single<TvListResponse>
}
