package com.example.jacksoncollection.listener

interface IItemClickListener<T> {
    fun onItemClick(item: T, position: Int)
}