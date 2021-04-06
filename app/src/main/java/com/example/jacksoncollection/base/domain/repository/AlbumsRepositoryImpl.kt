package com.example.jacksoncollection.base.domain.repository

import androidx.lifecycle.LiveData
import com.example.jacksoncollection.base.domain.db.AlbumEntity
import com.example.jacksoncollection.base.domain.db.AlbumsDao
import com.example.jacksoncollection.base.domain.network.ApiService
import com.example.jacksoncollection.base.domain.network.remote.Resource
import com.example.jacksoncollection.base.domain.network.remote.SafeApiRequest
import com.example.jacksoncollection.base.domain.response.Album
import com.example.jacksoncollection.base.domain.response.JacksonCollectionResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.IOException

class AlbumsRepositoryImpl(private val apiService: ApiService, private val albumDao: AlbumsDao) :
    AlbumsRepository,
    SafeApiRequest() {

    override suspend fun fetchAlbums(): Resource<JacksonCollectionResponse> {
        val response = withContext(Dispatchers.IO) {
            try {
                apiRequest { apiService.fetchAlbums() }
            } catch (e: IOException) {
                Resource.error(e.message, null)
            }
        }
        response.data?.results?.let { albums -> persistFetchedAlbums(albums = albums) }
        return response
    }

    override suspend fun getAllAlbums(): LiveData<AlbumEntity> {
        return withContext(Dispatchers.IO) {
            albumDao.getAllAlbums()
        }
    }

    private suspend fun persistFetchedAlbums(albums: ArrayList<Album>) {
        withContext(Dispatchers.IO) {
            albumDao.deleteAllAlbums()
            val entry = AlbumEntity()
            entry.albums = albums
            albumDao.insertAlbums(entry)
        }
    }
}