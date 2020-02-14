package com.example.moviedetailkotlin

import com.example.moviedetailkotlin.model.popularMovieModel.PopularMovieModel
import com.example.moviedetailkotlin.network.API_KEY
import com.example.moviedetailkotlin.network.RetrofitClient
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class PopularMoviePresenter(var view: Contract.View?) : Contract.Presenter, Contract.RetroListener {



    val client = RetrofitClient.movieClient
    val call = client.getPopularMovieRepo(API_KEY)


    override fun getRepo() {

        call?.subscribeOn(Schedulers.io())
            ?.observeOn(AndroidSchedulers.mainThread())
            ?.subscribe()


//        var retroService = RetrofitService(this)
//        retroService.getPopularMovies()
    }

    override fun onDestroyCalled() {
        view = null
    }

    override fun onSuccess(model: PopularMovieModel) {
        view?.showRepo(model)
    }

    override fun onFailure(t: Throwable) {
        view?.showError(t)

    }
}