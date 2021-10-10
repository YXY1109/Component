package com.yxy.module_user.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.yxy.module_user.R

//import com.yxy.lib_common.ToastUtils

@Route(path = "/user/UserMainActivity", group = "user")
class UserMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_main)
        var textView = findViewById<TextView>(R.id.textview)
        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
//            textView.text = "点击后的值:user666"
//            ToastUtils.show(this, "666")
//            RouterManager.startActivity(this, "user/MainActivity")
            ARouter.getInstance().build("/app/MainActivity").navigation()

        }
    }
}