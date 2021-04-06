package com.example.jacksoncollection.base.domain.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.jacksoncollection.base.domain.response.Album

/***
 * Created By Amir Fury on April 6 2021
 *
 * Email: Fury.amir93@gmail.com
 * */

@Database(entities = [AlbumEntity::class], version = 1, exportSchema = false)
@TypeConverters(AlbumConverter::class)
abstract class AlbumsDatabase : RoomDatabase() {

    abstract fun albumDao() : AlbumsDao

    companion object {
        private var instance: AlbumsDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context): AlbumsDatabase = instance ?: synchronized(LOCK) {
            instance ?: buildDatabase(context).also {
                instance = it
            }
        }

        private fun buildDatabase(context: Context): AlbumsDatabase {
            return Room.databaseBuilder(
                context.applicationContext,
                AlbumsDatabase::class.java,
                "album.db"
            ).fallbackToDestructiveMigration().build()
        }
    }
}