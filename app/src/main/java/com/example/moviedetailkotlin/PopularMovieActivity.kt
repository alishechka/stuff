package com.example.moviedetailkotlin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviedetailkotlin.model.popularMovieModel.PopularMovieModel
import com.example.moviedetailkotlin.network.MovieAdapter
import kotlinx.android.synthetic.main.activity_main.*

class PopularMovieActivity : AppCompatActivity(), Contract.View {
    private lateinit var presenter: PopularMoviePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = PopularMoviePresenter(this)
        presenter.getRepo()
    }

    override fun showRepo(model: PopularMovieModel) {
        rv_display.adapter = MovieAdapter(model)
        rv_display.layoutManager = LinearLayoutManager(parent)
    }

    override fun showError(t: Throwable?) {
        Toast.makeText(this, t?.message + "", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        presenter.onDestroyCalled()
        super.onDestroy()
    }
}
