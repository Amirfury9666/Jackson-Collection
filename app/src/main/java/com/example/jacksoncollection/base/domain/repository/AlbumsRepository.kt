package com.example.jacksoncollection.base.domain.repository

import androidx.lifecycle.LiveData
import com.example.jacksoncollection.base.domain.db.AlbumEntity
import com.example.jacksoncollection.base.domain.network.remote.Resource
import com.example.jacksoncollection.base.domain.response.JacksonCollectionResponse

/***
 * Created By Amir Fury on April 6 2021
 *
 * Email: Fury.amir93@gmail.com
 * */

interface AlbumsRepository {

    suspend fun fetchAlbums(): Resource<JacksonCollectionResponse>

    suspend fun getAllAlbums(): LiveData<AlbumEntity>
}