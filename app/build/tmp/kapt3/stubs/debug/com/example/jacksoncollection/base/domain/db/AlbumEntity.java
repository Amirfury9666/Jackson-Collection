package com.example.jacksoncollection.base.domain.db;

import java.lang.System;

/**
 * *
 * Created By Amir Fury on April 6 2021
 *
 * Email: Fury.amir93@gmail.com
 */
@androidx.room.Entity(tableName = "album_table")
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0018\b\u0003\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u0019\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u00c6\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0003\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001a"}, d2 = {"Lcom/example/jacksoncollection/base/domain/db/AlbumEntity;", "", "Id", "", "albums", "Ljava/util/ArrayList;", "Lcom/example/jacksoncollection/base/domain/response/Album;", "Lkotlin/collections/ArrayList;", "(ILjava/util/ArrayList;)V", "getId", "()I", "setId", "(I)V", "getAlbums", "()Ljava/util/ArrayList;", "setAlbums", "(Ljava/util/ArrayList;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class AlbumEntity {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int Id;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.jacksoncollection.base.domain.response.Album> albums;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.jacksoncollection.base.domain.response.Album> getAlbums() {
        return null;
    }
    
    public final void setAlbums(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.jacksoncollection.base.domain.response.Album> p0) {
    }
    
    public AlbumEntity(int Id, @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverters(value = {com.example.jacksoncollection.base.domain.db.AlbumConverter.class})
    java.util.ArrayList<com.example.jacksoncollection.base.domain.response.Album> albums) {
        super();
    }
    
    public AlbumEntity() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.jacksoncollection.base.domain.response.Album> component2() {
        return null;
    }
    
    /**
     * *
     * Created By Amir Fury on April 6 2021
     *
     * Email: Fury.amir93@gmail.com
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.jacksoncollection.base.domain.db.AlbumEntity copy(int Id, @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverters(value = {com.example.jacksoncollection.base.domain.db.AlbumConverter.class})
    java.util.ArrayList<com.example.jacksoncollection.base.domain.response.Album> albums) {
        return null;
    }
    
    /**
     * *
     * Created By Amir Fury on April 6 2021
     *
     * Email: Fury.amir93@gmail.com
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * *
     * Created By Amir Fury on April 6 2021
     *
     * Email: Fury.amir93@gmail.com
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * *
     * Created By Amir Fury on April 6 2021
     *
     * Email: Fury.amir93@gmail.com
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}