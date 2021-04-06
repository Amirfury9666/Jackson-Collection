package com.example.jacksoncollection.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.jacksoncollection.base.domain.response.Album
import com.example.jacksoncollection.databinding.ItemAlbumBinding
import com.example.jacksoncollection.listener.IItemClickListener

class AlbumsAdapter :
    ListAdapter<Album, RecyclerView.ViewHolder>(AlbumsDiffCallBack()) {

    private class AlbumsDiffCallBack : DiffUtil.ItemCallback<Album>() {
        override fun areItemsTheSame(oldItem: Album, newItem: Album): Boolean {
            return oldItem.equals(newItem)
        }

        override fun areContentsTheSame(oldItem: Album, newItem: Album): Boolean {
            return oldItem.equals(newItem)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return AlbumsHolder(ItemAlbumBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as AlbumsHolder).bind(getItem(position))
    }

    private class AlbumsHolder(private val binding: ItemAlbumBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Album) {
            binding.model = item
            binding.executePendingBindings()
        }
    }
}