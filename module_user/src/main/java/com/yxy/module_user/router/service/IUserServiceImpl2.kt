package com.yxy.module_user.router.service

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.yxy.module_user.utils.UserUtils

@Route(path = "/user/UserService")
class IUserServiceImpl2 : IUserService2 {
    override fun isLogin(): Boolean {
        return UserUtils.isLogin()
    }

    override fun init(context: Context?) {

    }
}