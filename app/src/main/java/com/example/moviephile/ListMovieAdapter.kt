package com.example.moviephile

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.moviephile.R

class ListMovieAdapter(private val listMovie: ArrayList<Movie>) : RecyclerView.Adapter<ListMovieAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvMovName: TextView = itemView.findViewById(R.id.tv_movie_name)
        var tvMovYear: TextView = itemView.findViewById(R.id.tv_movie_year)
        var tvMovCountry: TextView = itemView.findViewById(R.id.tv_movie_country)
        var tvMovDuration: TextView = itemView.findViewById(R.id.tv_movie_duration)
        var tvMovDescription: TextView = itemView.findViewById(R.id.tv_movie_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_movie, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listMovie.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val movie = listMovie[position]

        Glide.with(holder.itemView.context)
            .load(movie.photo)
            .into(holder.imgPhoto)
        holder.tvMovName.text = movie.name
        holder.tvMovYear.text = movie.year
        holder.tvMovCountry.text = movie.country
        holder.tvMovDuration.text = movie.duration
        holder.tvMovDescription.text = movie.synopsis
        holder.itemView.setOnClickListener {
            Toast.makeText(
                holder.itemView.context,
                "Kamu memilih " + listMovie[holder.adapterPosition].name,
                Toast.LENGTH_SHORT)
                .show()
        }

        val (movName, movYear, movCountry, movDuration, movDescription, movPhoto ) = listMovie[position]
        holder.imgPhoto.setImageResource(movPhoto)
        holder.tvMovName.text = movName
        holder.tvMovYear.text = movYear
        holder.tvMovCountry.text = movCountry
        holder.tvMovDuration.text = movDuration
        holder.tvMovDescription.text = movDescription
//        holder.itemView.setOnClickListener {
//            onItemClickCallback.onItemClicked(listMovie[holder.adapterPosition])
//        }

//        holder.itemView.setOnClickListener {
//            val intentDetail = Intent(holder.itemView.context, DetailActivity::class.java)
//            intentDetail.putExtra("key_movie", listMovie[holder.adapterPosition])
//            holder.itemView.context.startActivity(intentDetail)
//
//            onItemClickCallback.onItemClicked(listMovie[holder.adapterPosition])
//        }
    }
    interface OnItemClickCallback {
        fun onItemClicked(movie: Movie)
    }
}