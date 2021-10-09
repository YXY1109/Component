package com.yxy.component.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.yxy.component.R

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
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textView = findViewById<TextView>(R.id.textview)
        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            textView.text = "点击后的值:app"
//            ToastUtils.show(this, "666")
        }

    }
}