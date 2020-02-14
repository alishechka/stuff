package com.example.moviedetailkotlin

import com.example.moviedetailkotlin.model.popularMovieModel.PopularMovieModel
import com.example.moviedetailkotlin.network.API_KEY
import com.example.moviedetailkotlin.network.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RetrofitService(var listener: Contract.RetroListener) {

//    fun getPopularMovies() {
//        val client = RetrofitClient.movieClient
//        val call = client.getPopularMovieRepo(API_KEY)
//        call?.enqueue(
//            object : Callback<PopularMovieModel?> {
//                override fun onFailure(call: Call<PopularMovieModel?>, t: Throwable) {
//                    listener.onFailure(t)
//                }
//
//                override fun onResponse(
//                    call: Call<PopularMovieModel?>,
//                    response: Response<PopularMovieModel?>
//                ) {
//                    listener.onSuccess(response.body()!!)
//                }
//            })
//    }
}