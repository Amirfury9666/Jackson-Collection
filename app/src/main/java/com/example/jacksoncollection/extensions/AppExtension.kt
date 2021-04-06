package com.example.jacksoncollection.extensions

import android.content.Context
import android.content.Intent
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.BindingAdapter
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.text.SimpleDateFormat
import java.util.*

inline fun <reified T> Gson.fromJson(json: String) =
    this.fromJson<T>(json, object : TypeToken<T>() {}.type)

inline fun <reified T : Any> T.json(): String = Gson().toJson(this, T::class.java)


fun Context.launchActivity(intent: Intent) {
    startActivity(intent)
}

fun Context.toast(message: String?) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun SwipeRefreshLayout.handleSwipeToRefresh() {
    if (isRefreshing) {
        isRefreshing = false
    }
}

fun Long.convertMillisToMinutes(): String {
    val minutes = (this / 1000) / 60

    val seconds = (this / 1000) % 60

    return "$minutes Minutes $seconds Seconds"
}


fun String.getFormattedDate(): String {
    return try {
        val dateOnly = this.substringBefore("T")
        val formatter = SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH)
        val date = formatter.parse(dateOnly)
        val newFormat = SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH)
        newFormat.format(date)
    } catch (e: Exception) {
        ""
    }
}

@BindingAdapter("setConvertedTime")
fun TextView.setConvertedTime(timeMillis: Long) {
    text = timeMillis.convertMillisToMinutes()
}


@BindingAdapter("setFormattedDate")
fun TextView.setFormattedDate(date: String) {
    text = date.getFormattedDate()
}