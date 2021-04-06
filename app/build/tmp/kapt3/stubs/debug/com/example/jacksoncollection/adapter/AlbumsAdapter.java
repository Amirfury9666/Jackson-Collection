package com.example.jacksoncollection.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/example/jacksoncollection/adapter/AlbumsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/jacksoncollection/base/domain/response/Album;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "AlbumsDiffCallBack", "AlbumsHolder", "app_debug"})
public final class AlbumsAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.jacksoncollection.base.domain.response.Album, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    public AlbumsAdapter() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/jacksoncollection/adapter/AlbumsAdapter$AlbumsDiffCallBack;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/jacksoncollection/base/domain/response/Album;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    static final class AlbumsDiffCallBack extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.jacksoncollection.base.domain.response.Album> {
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.jacksoncollection.base.domain.response.Album oldItem, @org.jetbrains.annotations.NotNull()
        com.example.jacksoncollection.base.domain.response.Album newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.jacksoncollection.base.domain.response.Album oldItem, @org.jetbrains.annotations.NotNull()
        com.example.jacksoncollection.base.domain.response.Album newItem) {
            return false;
        }
        
        public AlbumsDiffCallBack() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/jacksoncollection/adapter/AlbumsAdapter$AlbumsHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/jacksoncollection/databinding/ItemAlbumBinding;", "(Lcom/example/jacksoncollection/databinding/ItemAlbumBinding;)V", "bind", "", "item", "Lcom/example/jacksoncollection/base/domain/response/Album;", "app_debug"})
    static final class AlbumsHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.jacksoncollection.databinding.ItemAlbumBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.jacksoncollection.base.domain.response.Album item) {
        }
        
        public AlbumsHolder(@org.jetbrains.annotations.NotNull()
        com.example.jacksoncollection.databinding.ItemAlbumBinding binding) {
            super(null);
        }
    }
}