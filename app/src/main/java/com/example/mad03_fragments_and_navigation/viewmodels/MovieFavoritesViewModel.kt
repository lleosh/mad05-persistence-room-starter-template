package com.example.mad03_fragments_and_navigation.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mad03_fragments_and_navigation.models.Movie
import com.example.mad03_fragments_and_navigation.repositories.MovieRepository
import kotlinx.coroutines.launch

class MovieFavoritesViewModel(
    private val repository: MovieRepository
) : ViewModel() {
    val movies: LiveData<List<Movie>> = repository.getAllMovies()

    fun createMovie(movie: Movie) {
        viewModelScope.launch {
            repository.createMovie(movie)
        }
    }

    fun updateMovie(movie: Movie) {
        viewModelScope.launch {
            repository.updateMovie(movie)
        }
    }

    fun clearMovie() {
        viewModelScope.launch {
            repository.clearTable()
        }
    }

    fun deleteMovie(movieId: Long) {
        viewModelScope.launch {
            repository.deleteMovie(movieId)
        }
    }
}
