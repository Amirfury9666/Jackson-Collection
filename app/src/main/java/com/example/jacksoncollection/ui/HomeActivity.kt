package com.example.jacksoncollection.ui

import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.Observer
import com.example.jacksoncollection.R
import com.example.jacksoncollection.adapter.AlbumsAdapter
import com.example.jacksoncollection.base.core.BaseActivity
import com.example.jacksoncollection.base.domain.network.remote.Status
import com.example.jacksoncollection.base.domain.viewmodel.AlbumsViewModel
import com.example.jacksoncollection.databinding.ActivityHomeBinding
import com.example.jacksoncollection.extensions.handleSwipeToRefresh
import com.example.jacksoncollection.extensions.toast
import kotlinx.coroutines.launch
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.kodein
import org.kodein.di.generic.instance

class HomeActivity : BaseActivity<ActivityHomeBinding>(), KodeinAware {

    override val kodein: Kodein by kodein()
    private val albumsViewModel: AlbumsViewModel by instance()

    private val adapter = AlbumsAdapter()

    override val layoutRes: Int
        get() = R.layout.activity_home

    override fun getToolbar(binding: ActivityHomeBinding): Toolbar = binding.toolbar

    override fun onActivityReady(instanceState: Bundle?, binding: ActivityHomeBinding) {
        binding.albumsRecycler.adapter = adapter
        getAllAlbums()
        fetchAlbums(binding)
        binding.swipeToRefresh.setOnRefreshListener {
            fetchAlbums(binding)
        }
    }


    private fun getAllAlbums() = launch {
        val albums = albumsViewModel.getAllAlbums()
        albums.observe(this@HomeActivity, Observer {
            it?.let {
                adapter.submitList(it.albums)
            }
        })
    }

    private fun fetchAlbums(binding: ActivityHomeBinding) = launch {
        binding.swipeToRefresh.handleSwipeToRefresh()
        albumsViewModel.fetchAlbums().observe(this@HomeActivity, Observer {
            when (it?.status) {
                Status.LOADING -> {
                }
                Status.SUCCESS -> {

                }
                Status.ERROR -> {
                    toast(it.message)
                }
            }
        })
    }
}