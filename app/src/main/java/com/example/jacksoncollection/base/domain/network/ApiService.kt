package com.example.jacksoncollection.base.domain.network

import com.example.jacksoncollection.base.domain.response.JacksonCollectionResponse
import com.example.jacksoncollection.utils.ApiUtils
import retrofit2.Response
import retrofit2.http.GET

/***
 * Created By Amir Fury on April 6 2021
 *
 * Email: Fury.amir93@gmail.com
 * */
interface ApiService {

    @GET(ApiUtils.ARTIST_ALBUM_PATH)
    suspend fun fetchAlbums(): Response<JacksonCollectionResponse>
}