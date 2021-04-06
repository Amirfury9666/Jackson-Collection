package com.example.jacksoncollection.base.core

import android.os.Bundle
import android.view.MenuItem
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext



abstract class BaseActivity<B : ViewDataBinding> : AppCompatActivity(), CoroutineScope {

    override val coroutineContext: CoroutineContext
        get() = job + Dispatchers.Main

    private lateinit var job: Job


    override fun onCreate(savedInstanceState: Bundle?) {
        job = Job()
        onPreCreate()
        super.onCreate(savedInstanceState)
        val binding: ViewDataBinding = DataBindingUtil.setContentView(this, layoutRes)
        setSupportActionBar(getToolbar(binding as B))
        onActivityReady(savedInstanceState, binding)

    }

    @get:LayoutRes
    protected abstract val layoutRes: Int
    open fun onPreCreate() {}
    protected abstract fun getToolbar(binding: B): Toolbar?
    protected abstract fun onActivityReady(instanceState: Bundle?, binding: B)


    open fun addTabLayoutMediator(
        tabLayout: TabLayout,
        viewPager2: ViewPager2,
        tabTitles: ArrayList<String>
    ) {
        TabLayoutMediator(tabLayout, viewPager2) { tab: TabLayout.Tab, _position: Int ->
            for (i in tabTitles.indices) {
                tab.text = tabTitles[_position]
            }
        }.attach()
    }

    fun enableBack() {
        supportActionBar?.let {
            it.setDisplayHomeAsUpEnabled(true)
            it.setDisplayShowHomeEnabled(true)
        }
    }

    fun setToolbarTitle(title: String?) {
        supportActionBar?.let {
            it.title = title
        }
    }

    fun setToolbarTitleDisable() {
        supportActionBar?.let {
            it.setDisplayShowTitleEnabled(false)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onDestroy() {
        super.onDestroy()
        job.cancel()
    }


}