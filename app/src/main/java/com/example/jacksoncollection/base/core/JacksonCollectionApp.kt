package com.example.jacksoncollection.base.core

import android.app.Application
import com.example.jacksoncollection.base.domain.db.AlbumsDao
import com.example.jacksoncollection.base.domain.db.AlbumsDatabase
import com.example.jacksoncollection.base.domain.network.ConnectivityInterceptor
import com.example.jacksoncollection.base.domain.network.ConnectivityInterceptorImpl
import com.example.jacksoncollection.base.domain.network.ServiceCreator
import com.example.jacksoncollection.base.domain.repository.AlbumsRepository
import com.example.jacksoncollection.base.domain.repository.AlbumsRepositoryImpl
import com.example.jacksoncollection.base.domain.viewmodel.AlbumsViewModel
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

/***
 * Created By Amir Fury on April 6 2021
 *
 * Email: Fury.amir93@gmail.com
 * */
class JacksonCollectionApp : Application(), KodeinAware {

    override val kodein = Kodein.lazy {
        import(androidXModule(this@JacksonCollectionApp))

        bind<ConnectivityInterceptor>() with singleton { ConnectivityInterceptorImpl(instance()) }
        bind() from singleton { ServiceCreator(instance()) }
        bind() from singleton { AlbumsDatabase(instance()) }
        bind<AlbumsDao>() with singleton { instance<AlbumsDatabase>().albumDao()}
        bind<AlbumsRepository>() with singleton { AlbumsRepositoryImpl(instance(),instance()) }

        bind() from singleton { AlbumsViewModel(instance()) }

        bind() from provider {
            ViewModelFactory(instance())
        }
    }
}