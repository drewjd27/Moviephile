package com.example.moviephile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
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

        list.addAll(MovieData.listData)
        rvMovie.layoutManager = LinearLayoutManager(this)

        val listMovieAdapter = ListMovieAdapter(list, this)
        rvMovie.adapter = listMovieAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.about -> {
//                val about = Intent(this@MainActivity, AboutActivity::class.java)
//                startActivity(about)
            }
        }
    }
}