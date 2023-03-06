package com.example.moviephile

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    var name: String = "",
    var year: String = "",
    var country: String = "",
    var duration: String = "",
    var overview: String = "",
    var photo: Int = 0,
    var synopsis: String = "",
    var background: Int = 0
) : Parcelable