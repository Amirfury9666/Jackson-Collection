package com.example.jacksoncollection.base.domain.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface AlbumsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAlbums(entity: AlbumEntity)

    @Query("DELETE FROM album_table")
    fun deleteAllAlbums()

    @Query("SELECT * FROM album_table")
    fun getAllAlbums(): LiveData<AlbumEntity>
}