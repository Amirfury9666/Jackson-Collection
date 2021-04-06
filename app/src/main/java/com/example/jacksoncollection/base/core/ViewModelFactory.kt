package com.example.jacksoncollection.base.core

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.jacksoncollection.base.domain.repository.AlbumsRepositoryImpl
import com.example.jacksoncollection.base.domain.viewmodel.AlbumsViewModel

/***
 * Created By Amir Fury on April 6 2021
 *
 * Email: Fury.amir93@gmail.com
 * */

@Suppress("UNCHECKED_CAST")
class ViewModelFactory(private val repository: AlbumsRepositoryImpl) :
    ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T = with(modelClass) {
        when {
            isAssignableFrom(AlbumsViewModel::class.java) -> AlbumsViewModel(repository)
            else -> error("Invalid Viewmodel")
        }
    } as T
}