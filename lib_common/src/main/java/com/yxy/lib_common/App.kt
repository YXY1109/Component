package com.yxy.lib_common

import android.app.Application
import android.util.Log
import com.alibaba.android.arouter.launcher.ARouter

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        initRouter()
    }

    private fun initRouter() {
        Log.i("yxy", "Application初始化")
        if (BuildConfig.DEBUG) {
            ARouter.openLog()
            ARouter.openDebug()
        }
        ARouter.init(this)
    }
}