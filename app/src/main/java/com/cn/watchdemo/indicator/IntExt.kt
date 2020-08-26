package  com.cn.watchdemo.indicator

import android.content.res.Resources

fun Int.toDP() = Resources.getSystem().displayMetrics.density * this