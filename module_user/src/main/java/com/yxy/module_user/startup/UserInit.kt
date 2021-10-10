//package com.yxy.module_user.startup
//
//import android.content.Context
//import android.util.Log
//import com.yxy.lib_common.router.RouterManager
//import com.yxy.module_user.router.service.UserServiceImpl
//import com.yxy.module_user.ui.activity.UserMainActivity
//import com.yxy.module_user.ui.fragment.UserFragment
//
//object UserInit {
//
//    fun init(context: Context) {
//        initRouter()
//    }
//
//    private fun initRouter() {
//        Log.i("yxy", "路由初始化")
//        RouterManager.addRouter("user/UserMainActivity", UserMainActivity::class.java)
//        RouterManager.addRouter("user/UserFragment", UserFragment::class.java)
//        RouterManager.addRouter("user/UserService", UserServiceImpl::class.java)
//    }
//}