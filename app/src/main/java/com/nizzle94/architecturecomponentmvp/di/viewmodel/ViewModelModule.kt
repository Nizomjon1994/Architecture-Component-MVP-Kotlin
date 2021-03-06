package com.nizzle94.architecturecomponentmvp.di.viewmodel

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.nizzle94.architecturecomponentmvp.di.module.UseCaseModule
import com.nizzle94.architecturecomponentmvp.ui.main.MainViewModel
import com.nizzle94.architecturecomponentmvp.di.viewmodel.ViewModelFactory
import com.nizzle94.architecturecomponentmvp.di.viewmodel.ViewModelKey
import com.nizzle94.architecturecomponentmvp.ui.main.genre.GenreViewModel
import com.nizzle94.architecturecomponentmvp.ui.main.movie_detail.MovieDetailViewModel
import com.nizzle94.architecturecomponentmvp.ui.main.movies.MoviesViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(includes = [UseCaseModule::class])
abstract class ViewModelModule {


    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(mainViewModel: MainViewModel): ViewModel

//    @Binds
//    @IntoMap
//    @ViewModelKey(GenreViewModel::class)
//    abstract fun bindGenreViewModel(genreViewModel: GenreViewModel): ViewModel
//
//    @Binds
//    @IntoMap
//    @ViewModelKey(MoviesViewModel::class)
//    abstract fun bindMoviesViewModel(moviesViewModel: MoviesViewModel): ViewModel
//
//
//    @Binds
//    @IntoMap
//    @ViewModelKey(MovieDetailViewModel::class)
//    abstract fun bindMovieDetailViewModel(movieDetailViewModel: MovieDetailViewModel): ViewModel


    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

}