package com.example.moviedetailkotlin.network

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviedetailkotlin.R
import com.example.moviedetailkotlin.model.popularMovieModel.PopularMovieModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.movie_item.view.*

class MovieAdapter(
    val models: PopularMovieModel?
) : RecyclerView.Adapter<MovieAdapter.myViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        return myViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.movie_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return models!!.results.size
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        val picasso = Picasso.get()
        val posterPathId = models!!.results[position].poster_path
        picasso.load(POSTER_PATH + posterPathId).into(holder.poster)

        holder.title?.text = models.results.get(position).title
        holder.rating?.rating = models?.results?.get(position)?.vote_average.toFloat() / 2
    }

    class myViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val poster = view.iv_poster_item
        val rating = view.rb_rating_item
        val title = view.tv_title_item
    }

}