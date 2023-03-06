package com.example.moviephile

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    val movName: String,
    val movYear: String,
    val movCountry: String,
    val movDuration: String,
    val movPhoto: Int
) : Parcelable