package com.yxy.component

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


/**
 *
 * 参考文章1：https://juejin.cn/post/7015882134795583519
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
        }

    }
}