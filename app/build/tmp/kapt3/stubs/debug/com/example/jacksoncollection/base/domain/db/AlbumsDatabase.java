package com.example.jacksoncollection.base.domain.db;

import java.lang.System;

/**
 * *
 * Created By Amir Fury on April 6 2021
 *
 * Email: Fury.amir93@gmail.com
 */
@androidx.room.TypeConverters(value = {com.example.jacksoncollection.base.domain.db.AlbumConverter.class})
@androidx.room.Database(entities = {com.example.jacksoncollection.base.domain.db.AlbumEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/jacksoncollection/base/domain/db/AlbumsDatabase;", "Landroidx/room/RoomDatabase;", "()V", "albumDao", "Lcom/example/jacksoncollection/base/domain/db/AlbumsDao;", "Companion", "app_debug"})
public abstract class AlbumsDatabase extends androidx.room.RoomDatabase {
    private static com.example.jacksoncollection.base.domain.db.AlbumsDatabase instance;
    private static final java.lang.Object LOCK = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.jacksoncollection.base.domain.db.AlbumsDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.jacksoncollection.base.domain.db.AlbumsDao albumDao();
    
    public AlbumsDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0011\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/jacksoncollection/base/domain/db/AlbumsDatabase$Companion;", "", "()V", "LOCK", "instance", "Lcom/example/jacksoncollection/base/domain/db/AlbumsDatabase;", "buildDatabase", "context", "Landroid/content/Context;", "invoke", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.jacksoncollection.base.domain.db.AlbumsDatabase invoke(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final com.example.jacksoncollection.base.domain.db.AlbumsDatabase buildDatabase(android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}