package com.example.mad03_fragments_and_navigation.database

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.mad03_fragments_and_navigation.models.Movie

interface MovieDao {
    // TODO implement me
    @Insert (onConflict = OnConflictStrategy.REPLACE)
    suspend fun create(movie: Movie): Long

    @Update
    suspend fun update(movie: Movie)

    @Query("SELECT * FROM movie_table")
    fun getAll(): LiveData<List<Movie>>
}
