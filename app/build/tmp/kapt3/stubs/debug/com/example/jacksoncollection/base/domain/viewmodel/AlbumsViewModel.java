package com.example.jacksoncollection.base.domain.viewmodel;

import java.lang.System;

/**
 * *
 * Created By Amir Fury on April 6 2021
 *
 * Email: Fury.amir93@gmail.com
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/example/jacksoncollection/base/domain/viewmodel/AlbumsViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/jacksoncollection/base/domain/repository/AlbumsRepository;", "(Lcom/example/jacksoncollection/base/domain/repository/AlbumsRepository;)V", "fetchAlbums", "Landroidx/lifecycle/LiveData;", "Lcom/example/jacksoncollection/base/domain/network/remote/Resource;", "Lcom/example/jacksoncollection/base/domain/response/JacksonCollectionResponse;", "getAllAlbums", "Lcom/example/jacksoncollection/base/domain/db/AlbumEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AlbumsViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.jacksoncollection.base.domain.repository.AlbumsRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.jacksoncollection.base.domain.network.remote.Resource<com.example.jacksoncollection.base.domain.response.JacksonCollectionResponse>> fetchAlbums() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllAlbums(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.example.jacksoncollection.base.domain.db.AlbumEntity>> p0) {
        return null;
    }
    
    public AlbumsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.jacksoncollection.base.domain.repository.AlbumsRepository repository) {
        super();
    }
}