package com.yxy.module_user.router.service

import com.yxy.lib_common.router.servive.IUserService
import com.yxy.module_user.utils.UserUtils

class UserServiceImpl : IUserService {
    override fun isLogin(): Boolean {
        return UserUtils.isLogin()
    }

}