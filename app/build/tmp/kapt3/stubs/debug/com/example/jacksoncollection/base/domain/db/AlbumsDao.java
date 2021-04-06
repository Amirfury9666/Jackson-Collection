package com.example.jacksoncollection.base.domain.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\'\u00a8\u0006\t"}, d2 = {"Lcom/example/jacksoncollection/base/domain/db/AlbumsDao;", "", "deleteAllAlbums", "", "getAllAlbums", "Landroidx/lifecycle/LiveData;", "Lcom/example/jacksoncollection/base/domain/db/AlbumEntity;", "insertAlbums", "entity", "app_debug"})
public abstract interface AlbumsDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAlbums(@org.jetbrains.annotations.NotNull()
    com.example.jacksoncollection.base.domain.db.AlbumEntity entity);
    
    @androidx.room.Query(value = "DELETE FROM album_table")
    public abstract void deleteAllAlbums();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM album_table")
    public abstract androidx.lifecycle.LiveData<com.example.jacksoncollection.base.domain.db.AlbumEntity> getAllAlbums();
}