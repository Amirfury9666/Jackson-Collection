package com.example.jacksoncollection.base.domain.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jacksoncollection.base.domain.db.AlbumEntity
import com.example.jacksoncollection.base.domain.network.remote.Resource
import com.example.jacksoncollection.base.domain.repository.AlbumsRepository
import com.example.jacksoncollection.base.domain.response.JacksonCollectionResponse
import kotlinx.coroutines.launch

class AlbumsViewModel(private val repository: AlbumsRepository) : ViewModel() {

    fun fetchAlbums(): LiveData<Resource<JacksonCollectionResponse>> {
        val data = MutableLiveData<Resource<JacksonCollectionResponse>>()
        data.postValue(Resource.loading(null))
        viewModelScope.launch {
            data.postValue(repository.fetchAlbums())
        }
        return data
    }


    suspend fun getAllAlbums(): LiveData<AlbumEntity> = repository.getAllAlbums()

}