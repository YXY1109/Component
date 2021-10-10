package com.yxy.component.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.yxy.component.R
import com.yxy.lib_common.router.RouterManager
import com.yxy.module_user.ui.activity.UserMainActivity

//import com.yxy.lib_common.ToastUtils


/**
 * 参考文章1：https://juejin.cn/post/7005483236117725215
 *
 *
 * 参考文章2：https://juejin.cn/post/7015882134795583519
 * 功能组件：lib_xxx
 * 业务组件：module_xxx
 *
 *
 *
 */

@Route(path = "/app/MainActivity", group = "app")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textView = findViewById<TextView>(R.id.textview)
        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
//            textView.text = "点击后的值:app666"
//            ToastUtils.show(this, "666")
//            val intent = Intent(this, UserMainActivity::class.java)
//            startActivity(intent)

//            RouterManager.startActivity(this, "user/UserMainActivity")

            ARouter.getInstance().build("/user/UserMainActivity").navigation()
        }

    }
}