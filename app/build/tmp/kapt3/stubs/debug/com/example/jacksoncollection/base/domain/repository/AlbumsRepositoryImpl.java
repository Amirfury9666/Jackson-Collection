package com.example.jacksoncollection.base.domain.repository;

import java.lang.System;

/**
 * *
 * Created By Amir Fury on April 6 2021
 *
 * Email: Fury.amir93@gmail.com
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ)\u0010\u000f\u001a\u00020\u00102\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/example/jacksoncollection/base/domain/repository/AlbumsRepositoryImpl;", "Lcom/example/jacksoncollection/base/domain/repository/AlbumsRepository;", "Lcom/example/jacksoncollection/base/domain/network/remote/SafeApiRequest;", "apiService", "Lcom/example/jacksoncollection/base/domain/network/ApiService;", "albumDao", "Lcom/example/jacksoncollection/base/domain/db/AlbumsDao;", "(Lcom/example/jacksoncollection/base/domain/network/ApiService;Lcom/example/jacksoncollection/base/domain/db/AlbumsDao;)V", "fetchAlbums", "Lcom/example/jacksoncollection/base/domain/network/remote/Resource;", "Lcom/example/jacksoncollection/base/domain/response/JacksonCollectionResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllAlbums", "Landroidx/lifecycle/LiveData;", "Lcom/example/jacksoncollection/base/domain/db/AlbumEntity;", "persistFetchedAlbums", "", "albums", "Ljava/util/ArrayList;", "Lcom/example/jacksoncollection/base/domain/response/Album;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AlbumsRepositoryImpl extends com.example.jacksoncollection.base.domain.network.remote.SafeApiRequest implements com.example.jacksoncollection.base.domain.repository.AlbumsRepository {
    private final com.example.jacksoncollection.base.domain.network.ApiService apiService = null;
    private final com.example.jacksoncollection.base.domain.db.AlbumsDao albumDao = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchAlbums(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.jacksoncollection.base.domain.network.remote.Resource<com.example.jacksoncollection.base.domain.response.JacksonCollectionResponse>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getAllAlbums(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.example.jacksoncollection.base.domain.db.AlbumEntity>> p0) {
        return null;
    }
    
    public AlbumsRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.jacksoncollection.base.domain.network.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.example.jacksoncollection.base.domain.db.AlbumsDao albumDao) {
        super();
    }
}