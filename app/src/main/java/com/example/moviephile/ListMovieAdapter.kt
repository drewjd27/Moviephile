package com.example.moviephile

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListMovieAdapter(private val listMovie: ArrayList<Movie>, private val context: Context) : RecyclerView.Adapter<ListMovieAdapter.ListViewHolder>() {

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItem(movie: Movie) {
            val photo: ImageView = itemView.findViewById(R.id.img_item_photo)
            val name: TextView = itemView.findViewById(R.id.tv_movie_name)
            val year: TextView = itemView.findViewById(R.id.tv_movie_year)
            val country: TextView = itemView.findViewById(R.id.tv_movie_country)
            val duration: TextView = itemView.findViewById(R.id.tv_movie_duration)
            val overview: TextView = itemView.findViewById(R.id.tv_movie_description)

            photo.setImageResource(movie.photo)
            name.text = movie.name
            year.text = movie.year
            country.text = movie.year
            duration.text = movie.duration
            overview.text = movie.overview
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_movie, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listMovie.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bindItem(listMovie[position])
        holder.itemView.setOnClickListener {
            val getData = listMovie[position]
            val dataBackground: Int = getData.background
            val dataPhoto: Int = getData.photo
            val dataName: String = getData.name
            val dataYear: String = getData.year
            val dataCountry: String = getData.country
            val dataDuration: String = getData.duration
            val dataOverview: String = getData.overview
            val dataSynopsis: String = getData.synopsis

            val moveToDetail = Intent(context, DetailActivity::class.java)
            moveToDetail.putExtra("movBackground", dataBackground)
            moveToDetail.putExtra("movPhoto", dataPhoto)
            moveToDetail.putExtra("movName", dataName)
            moveToDetail.putExtra("movYear", dataYear)
            moveToDetail.putExtra("movCountry", dataCountry)
            moveToDetail.putExtra("movDuration", dataDuration)
            moveToDetail.putExtra("movOverview", dataOverview)
            moveToDetail.putExtra("movSynopsis", dataSynopsis)

            context.startActivity(moveToDetail)
        }
    }
}