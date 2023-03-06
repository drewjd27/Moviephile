package com.example.moviephile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moviephile.ListMovieAdapter
import com.example.moviephile.Movie

class MainActivity : AppCompatActivity() {
    private lateinit var rvMovie: RecyclerView
    private val list = ArrayList<Movie>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMovie = findViewById(R.id.rv_movies)
        rvMovie.setHasFixedSize(true)

        list.addAll(getListMovie())
        showRecyclerList()
    }

    private fun getListMovie(): ArrayList<Movie> {
        val dataName = resources.getStringArray(R.array.data_movie_name)
        val dataYear = resources.getStringArray(R.array.data_movie_year)
        val dataCountry = resources.getStringArray(R.array.data_movie_country)
        val dataDuration = resources.getStringArray(R.array.data_movie_duration)
        val dataDescription = resources.getStringArray(R.array.data_movie_description)
        val dataPhoto = resources.obtainTypedArray(R.array.data_movie_photo)
        val listMovie = ArrayList<Movie>()
        for (i in dataName.indices) {
            val movie = Movie(dataName[i], dataYear[i], dataCountry[i], dataDuration[i], dataDescription[i], dataPhoto.getResourceId(i, -1))
            listMovie.add(movie)
        }
        return  listMovie
    }

    private fun showRecyclerList() {
        rvMovie.layoutManager = LinearLayoutManager(this)
        val listMovieAdapter = ListMovieAdapter(list)
        rvMovie.adapter = listMovieAdapter
    }
}