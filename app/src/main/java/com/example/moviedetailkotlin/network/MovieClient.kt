package com.example.moviedetailkotlin.network

import com.example.moviedetailkotlin.model.popularMovieModel.PopularMovieModel
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieClient {
    @GET("movie/popular?")
    fun getPopularMovieRepo(
        @Query("api_key") key: String?
//        , @Query(
//            "page"
//        )
//        pageNum: Int?
    ): Observable<PopularMovieModel?>?

//    @GET("movie/{movie_id}")
//    fun getDetailMovieRepo(
//        @Path("movie_id") movieId: Int?, @Query(
//            "api_key"
//        ) key: String?
//    ): Call<DetailMovieModel?>?

}