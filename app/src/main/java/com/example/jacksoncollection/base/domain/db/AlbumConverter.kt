package com.example.jacksoncollection.base.domain.db

import androidx.room.TypeConverter
import com.example.jacksoncollection.base.domain.response.Album
import com.example.jacksoncollection.extensions.fromJson
import com.example.jacksoncollection.extensions.json
import com.google.gson.Gson

class AlbumConverter {

    @TypeConverter
    fun convertToString(list: List<Album>?): String {
        list ?: return ""
        return list.json()
    }

    @TypeConverter
    fun convertToFeed(value: String?): ArrayList<Album> {
        if (value.isNullOrEmpty()) {
            return arrayListOf()
        }
        return Gson().fromJson<ArrayList<Album>>(value)
    }
}