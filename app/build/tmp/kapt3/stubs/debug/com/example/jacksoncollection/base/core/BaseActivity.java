package com.example.jacksoncollection.base.core;

import java.lang.System;

/**
 * *
 * Created By Amir Fury on April 6 2021
 *
 * Email: Fury.amir93@gmail.com
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J0\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u0019H\u0016J\u0006\u0010\u001a\u001a\u00020\u0011J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00028\u0000H$\u00a2\u0006\u0002\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u001d\u001a\u00028\u0000H$\u00a2\u0006\u0002\u0010\"J\u0012\u0010#\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010!H\u0014J\b\u0010%\u001a\u00020\u0011H\u0014J\u0010\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0011H\u0016J\u0010\u0010+\u001a\u00020\u00112\b\u0010,\u001a\u0004\u0018\u00010\u0018J\u0006\u0010-\u001a\u00020\u0011R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8eX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006."}, d2 = {"Lcom/example/jacksoncollection/base/core/BaseActivity;", "B", "Landroidx/databinding/ViewDataBinding;", "Landroidx/appcompat/app/AppCompatActivity;", "Lkotlinx/coroutines/CoroutineScope;", "()V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "job", "Lkotlinx/coroutines/Job;", "layoutRes", "", "getLayoutRes", "()I", "addTabLayoutMediator", "", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "viewPager2", "Landroidx/viewpager2/widget/ViewPager2;", "tabTitles", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "enableBack", "getToolbar", "Landroidx/appcompat/widget/Toolbar;", "binding", "(Landroidx/databinding/ViewDataBinding;)Landroidx/appcompat/widget/Toolbar;", "onActivityReady", "instanceState", "Landroid/os/Bundle;", "(Landroid/os/Bundle;Landroidx/databinding/ViewDataBinding;)V", "onCreate", "savedInstanceState", "onDestroy", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onPreCreate", "setToolbarTitle", "title", "setToolbarTitleDisable", "app_debug"})
public abstract class BaseActivity<B extends androidx.databinding.ViewDataBinding> extends androidx.appcompat.app.AppCompatActivity implements kotlinx.coroutines.CoroutineScope {
    private kotlinx.coroutines.Job job;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @androidx.annotation.LayoutRes()
    protected abstract int getLayoutRes();
    
    public void onPreCreate() {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected abstract androidx.appcompat.widget.Toolbar getToolbar(@org.jetbrains.annotations.NotNull()
    B binding);
    
    protected abstract void onActivityReady(@org.jetbrains.annotations.Nullable()
    android.os.Bundle instanceState, @org.jetbrains.annotations.NotNull()
    B binding);
    
    public void addTabLayoutMediator(@org.jetbrains.annotations.NotNull()
    com.google.android.material.tabs.TabLayout tabLayout, @org.jetbrains.annotations.NotNull()
    androidx.viewpager2.widget.ViewPager2 viewPager2, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> tabTitles) {
    }
    
    public final void enableBack() {
    }
    
    public final void setToolbarTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String title) {
    }
    
    public final void setToolbarTitleDisable() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public BaseActivity() {
        super();
    }
}