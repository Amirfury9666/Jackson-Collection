package com.example.jacksoncollection.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a*\u0010\u0003\u001a\n \u0005*\u0004\u0018\u0001H\u0004H\u0004\"\u0006\b\u0000\u0010\u0004\u0018\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\b\u00a2\u0006\u0002\u0010\b\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\f\u001a\u001e\u0010\u0007\u001a\u00020\u0001\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\r*\u0002H\u0004H\u0086\b\u00a2\u0006\u0002\u0010\u000e\u001a\u0012\u0010\u000f\u001a\u00020\u000b*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012\u001a\u0014\u0010\u0013\u001a\u00020\u000b*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0007\u001a\u0014\u0010\u0016\u001a\u00020\u000b*\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0018\u001a\u00020\u000b*\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001\u00a8\u0006\u001a"}, d2 = {"convertMillisToMinutes", "", "", "fromJson", "T", "kotlin.jvm.PlatformType", "Lcom/google/gson/Gson;", "json", "(Lcom/google/gson/Gson;Ljava/lang/String;)Ljava/lang/Object;", "getFormattedDate", "handleSwipeToRefresh", "", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "", "(Ljava/lang/Object;)Ljava/lang/String;", "launchActivity", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "setConvertedTime", "Landroid/widget/TextView;", "timeMillis", "setFormattedDate", "date", "toast", "message", "app_debug"})
public final class AppExtensionKt {
    
    public static final void launchActivity(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$launchActivity, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    public static final void toast(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$toast, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    public static final void handleSwipeToRefresh(@org.jetbrains.annotations.NotNull()
    androidx.swiperefreshlayout.widget.SwipeRefreshLayout $this$handleSwipeToRefresh) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String convertMillisToMinutes(long $this$convertMillisToMinutes) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getFormattedDate(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$getFormattedDate) {
        return null;
    }
    
    @androidx.databinding.BindingAdapter(value = {"setConvertedTime"})
    public static final void setConvertedTime(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setConvertedTime, long timeMillis) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setFormattedDate"})
    public static final void setFormattedDate(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setFormattedDate, @org.jetbrains.annotations.NotNull()
    java.lang.String date) {
    }
}