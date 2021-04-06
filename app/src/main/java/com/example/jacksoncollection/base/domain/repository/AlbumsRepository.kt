package com.example.jacksoncollection.base.domain.repository

import androidx.lifecycle.LiveData
import com.example.jacksoncollection.base.domain.db.AlbumEntity
import com.example.jacksoncollection.base.domain.network.remote.Resource
import com.example.jacksoncollection.base.domain.response.JacksonCollectionResponse

interface AlbumsRepository {

    suspend fun fetchAlbums(): Resource<JacksonCollectionResponse>

    suspend fun getAllAlbums(): LiveData<AlbumEntity>
}