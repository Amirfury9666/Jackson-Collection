package com.example.jacksoncollection.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002H\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0002H\u0014J\u001a\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0018\u001a\u00020\u0002H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00138TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006 "}, d2 = {"Lcom/example/jacksoncollection/ui/HomeActivity;", "Lcom/example/jacksoncollection/base/core/BaseActivity;", "Lcom/example/jacksoncollection/databinding/ActivityHomeBinding;", "Lorg/kodein/di/KodeinAware;", "()V", "adapter", "Lcom/example/jacksoncollection/adapter/AlbumsAdapter;", "albumsViewModel", "Lcom/example/jacksoncollection/base/domain/viewmodel/AlbumsViewModel;", "getAlbumsViewModel", "()Lcom/example/jacksoncollection/base/domain/viewmodel/AlbumsViewModel;", "albumsViewModel$delegate", "Lkotlin/Lazy;", "kodein", "Lorg/kodein/di/Kodein;", "getKodein", "()Lorg/kodein/di/Kodein;", "kodein$delegate", "layoutRes", "", "getLayoutRes", "()I", "fetchAlbums", "Lkotlinx/coroutines/Job;", "binding", "getAllAlbums", "getToolbar", "Landroidx/appcompat/widget/Toolbar;", "onActivityReady", "", "instanceState", "Landroid/os/Bundle;", "app_debug"})
public final class HomeActivity extends com.example.jacksoncollection.base.core.BaseActivity<com.example.jacksoncollection.databinding.ActivityHomeBinding> implements org.kodein.di.KodeinAware {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy kodein$delegate = null;
    private final kotlin.Lazy albumsViewModel$delegate = null;
    private final com.example.jacksoncollection.adapter.AlbumsAdapter adapter = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.kodein.di.Kodein getKodein() {
        return null;
    }
    
    private final com.example.jacksoncollection.base.domain.viewmodel.AlbumsViewModel getAlbumsViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected int getLayoutRes() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected androidx.appcompat.widget.Toolbar getToolbar(@org.jetbrains.annotations.NotNull()
    com.example.jacksoncollection.databinding.ActivityHomeBinding binding) {
        return null;
    }
    
    @java.lang.Override()
    protected void onActivityReady(@org.jetbrains.annotations.Nullable()
    android.os.Bundle instanceState, @org.jetbrains.annotations.NotNull()
    com.example.jacksoncollection.databinding.ActivityHomeBinding binding) {
    }
    
    private final kotlinx.coroutines.Job getAllAlbums() {
        return null;
    }
    
    private final kotlinx.coroutines.Job fetchAlbums(com.example.jacksoncollection.databinding.ActivityHomeBinding binding) {
        return null;
    }
    
    public HomeActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.kodein.di.KodeinContext<?> getKodeinContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.kodein.di.KodeinTrigger getKodeinTrigger() {
        return null;
    }
}