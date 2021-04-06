package com.example.jacksoncollection.base.domain.network.remote

import com.example.jacksoncollection.exceptions.ApiException
import retrofit2.Response

/***
 * Created By Amir Fury on April 6 2021
 *
 * Email: Fury.amir93@gmail.com
 * */
abstract class SafeApiRequest {

    suspend fun <T : Any> apiRequest(call: suspend () -> Response<T>): Resource<T> {
        val response = call.invoke()
        if (response.isSuccessful) {
            return Resource.success(response.body())
        } else {
            throw ApiException(response.code().toString())
        }
    }
}