package com.example.jacksoncollection.base.domain.db

import androidx.room.TypeConverter
import com.example.jacksoncollection.base.domain.response.Album
import com.example.jacksoncollection.extensions.fromJson
import com.example.jacksoncollection.extensions.json
import com.google.gson.Gson

/***
 * Created By Amir Fury on April 6 2021
 *
 * Email: Fury.amir93@gmail.com
 * */
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