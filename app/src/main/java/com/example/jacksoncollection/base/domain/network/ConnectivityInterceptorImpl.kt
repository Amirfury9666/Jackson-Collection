package com.example.jacksoncollection.base.domain.network

import android.content.Context
import android.net.ConnectivityManager
import com.example.jacksoncollection.R
import com.example.jacksoncollection.exceptions.NoInternetException
import okhttp3.Interceptor
import okhttp3.Response

/***
 * Created By Amir Fury on April 6 2021
 *
 * Email: Fury.amir93@gmail.com
 * */

class ConnectivityInterceptorImpl(private val context: Context) : ConnectivityInterceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        if (!isOnline()) {
            throw NoInternetException(context.resources.getString(R.string.no_internet_connection))
        }
        return chain.proceed(chain.request())
    }

    private fun isOnline(): Boolean {
        val connectivityManager =
            context.applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = connectivityManager.activeNetworkInfo
        return networkInfo != null && networkInfo.isConnected
    }
}