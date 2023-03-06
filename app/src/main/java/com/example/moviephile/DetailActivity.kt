package com.example.moviephile

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val background: ImageView = findViewById(R.id.img_item_bg)
        val photo: ImageView = findViewById(R.id.img_item_photo)
        val name: TextView = findViewById(R.id.tv_movie_name)
        val year: TextView = findViewById(R.id.tv_movie_year)
        val country: TextView = findViewById(R.id.tv_movie_country)
        val duration: TextView = findViewById(R.id.tv_movie_duration)
        val description: TextView = findViewById(R.id.tv_movie_description)
        val synopsis: TextView = findViewById(R.id.tv_movie_synopsis)

        val movieBackground = intent.getIntExtra("movBackground", 1)
        val moviePhoto = intent.getIntExtra("movPhoto", 1)
        val movieName = intent.getStringExtra("movName")
        val movieYear = intent.getStringExtra("movYear")
        val movieCountry = intent.getStringExtra("movCountry")
        val movieDuration = intent.getStringExtra("movDuration")
        val movieOverview = intent.getStringExtra("movOverview")
        val movieSynopsis = intent.getStringExtra("movSynopsis")

        background.setImageResource(movieBackground)
        photo.setImageResource(moviePhoto)
        name.text = movieName
        year.text = movieYear
        country.text = movieCountry
        duration.text = movieDuration
        description.text = movieOverview
        synopsis.text = movieSynopsis
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_detail, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.share -> {
                val share = Intent(Intent.ACTION_SEND)
                share.type = "text/plain"
                share.putExtra(Intent.EXTRA_TEXT, "Lihat sourcecode Moviephile di sini https://github.com/drewjd27/Moviephile")
                startActivity(Intent.createChooser(share, "Share Link"))
            }
        }
    }
}