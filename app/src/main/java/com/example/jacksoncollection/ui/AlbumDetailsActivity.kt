package com.example.jacksoncollection.ui

import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.jacksoncollection.R
import com.example.jacksoncollection.base.core.BaseActivity
import com.example.jacksoncollection.base.domain.response.Album
import com.example.jacksoncollection.databinding.ActivityAlbumDetailsBinding

class AlbumDetailsActivity : BaseActivity<ActivityAlbumDetailsBinding>() {

    override val layoutRes: Int get() = R.layout.activity_album_details

    override fun getToolbar(binding: ActivityAlbumDetailsBinding): Toolbar = binding.toolbar

    override fun onActivityReady(instanceState: Bundle?, binding: ActivityAlbumDetailsBinding) {
        enableBack()
        setToolbarTitle(resources.getString(R.string.albumDetails))

        val album = intent?.getSerializableExtra("album") as Album?
        album?.let {
            binding.model = it
        }
    }
}