package com.example.jacksoncollection.base.glide

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.example.jacksoncollection.R


/***
 * Created By Amir Fury on April 6 2021
 *
 * Email: Fury.amir93@gmail.com
 * */

@BindingAdapter("loadImage")
fun ImageView.loadImage(imageUrl: String?) {
    imageUrl?.let {
        if (it.contains("100x100")) {
            val newUrl = it.replace("100x100", "300x300")
            Glide.with(context).load(newUrl).placeholder(R.drawable.image_bg).into(this)
            return
        }
        Glide.with(context).load(it).placeholder(R.drawable.image_bg).into(this)
    }
}