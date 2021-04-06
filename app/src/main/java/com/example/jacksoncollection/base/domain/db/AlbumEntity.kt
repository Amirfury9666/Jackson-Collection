package com.example.jacksoncollection.base.domain.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.example.jacksoncollection.base.domain.response.Album

/***
 * Created By Amir Fury on April 6 2021
 *
 * Email: Fury.amir93@gmail.com
 * */

@Entity(tableName = "album_table")
data class AlbumEntity(
    @PrimaryKey(autoGenerate = true)
    var Id: Int = 0,
    @TypeConverters(AlbumConverter::class)
    var albums: ArrayList<Album> = arrayListOf()
)