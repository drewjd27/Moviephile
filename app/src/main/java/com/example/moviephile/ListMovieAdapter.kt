package com.example.moviephile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.moviephile.R

class ListMovieAdapter(private val listMovie: ArrayList<Movie>) : RecyclerView.Adapter<ListMovieAdapter.ListViewHolder>() {

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        val tvMovName: TextView = itemView.findViewById(R.id.tv_movie_name)
        val tvMovYear: TextView = itemView.findViewById(R.id.tv_movie_year)
        val tvMovCountry: TextView = itemView.findViewById(R.id.tv_movie_country)
        val tvMovDuration: TextView = itemView.findViewById(R.id.tv_movie_duration)
        val tvMovDescription: TextView = itemView.findViewById(R.id.tv_movie_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_movie, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listMovie.size



    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (movName, movYear, movCountry, movDuration, movDescription, movPhoto ) = listMovie[position]
        holder.imgPhoto.setImageResource(movPhoto)
        holder.tvMovName.text = movName
        holder.tvMovYear.text = movYear
        holder.tvMovCountry.text = movCountry
        holder.tvMovDuration.text = movDuration
        holder.tvMovDescription.text = movDescription
    }
}