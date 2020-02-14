package com.example.moviedetailkotlin

import com.example.moviedetailkotlin.model.popularMovieModel.PopularMovieModel

interface Contract {
    interface View {
        fun showRepo(model: PopularMovieModel)

        fun showError(t: Throwable?)


    }

    interface Presenter {

        fun getRepo()

        fun onDestroyCalled()
    }

    interface RetroListener {

        fun onSuccess(model : PopularMovieModel)

        fun onFailure(t: Throwable)
    }
}