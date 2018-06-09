package com.nizzle94.architecturecomponentmvp.ui.main.movies

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.nizzle94.architecturecomponentmvp.R
import com.nizzle94.architecturecomponentmvp.databinding.MovieItemBinding
import com.nizzle94.data.main.movie.movies.Movie

/**
 * Created by Khajiev Nizomjon on 07/06/2018.
 */
class MoviesAdapter(private val context: Context,
                    private val movieList: List<Movie>,
                    private val clickListener: (Movie) -> Unit) : RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val binding: MovieItemBinding = DataBindingUtil.inflate(inflater, R.layout.movie_item, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = movieList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(movieList[position], clickListener)
    }


    class ViewHolder(private val movieItemBinding: MovieItemBinding) : RecyclerView.ViewHolder(movieItemBinding.root) {
        fun bind(movie: Movie, clickListener: (Movie) -> Unit) {
            movieItemBinding.vm = movie
            movieItemBinding.root.setOnClickListener {
                clickListener(movie)
            }
        }
    }
}