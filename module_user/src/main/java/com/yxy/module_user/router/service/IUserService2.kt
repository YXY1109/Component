package com.yxy.module_user.router.service

import com.alibaba.android.arouter.facade.template.IProvider

interface IUserService2 : IProvider {
    fun isLogin(): Boolean
}