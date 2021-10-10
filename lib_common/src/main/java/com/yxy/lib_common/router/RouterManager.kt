package com.yxy.lib_common.router

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

object RouterManager {

    private const val TAG = "RouterManager"

    // 存储路由的的容器
    private val mRouterMap = HashMap<String, Class<*>>()

    /**
     * 添加路由
     * @param path 路由路径
     * @param clazz 路由目标
     * */
    fun addRouter(path: String, clazz: Class<*>) {
        mRouterMap[path] = clazz
    }

    /**
     * 开启Activity
     * */
    fun startActivity(context: Context, path: String) {
        val clazz = mRouterMap[path]
        if (clazz == null) {
            val log = "not found router by path !"
            Log.e(TAG, log)
            showToast(context, log)
            return
        }
        // 判断是否是Activity的子类
        if (Activity::class.java.isAssignableFrom(clazz)) {
            val intent = Intent(context, clazz)
            context.startActivity(intent)
        } else {
            val log = "router's not Activity !"
            Log.e(TAG, log)
            showToast(context, log)
        }
    }

    private fun showToast(context: Context, log: String) {
        Toast.makeText(context, log, Toast.LENGTH_SHORT).show()
    }

}