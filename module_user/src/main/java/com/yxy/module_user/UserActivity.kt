package com.yxy.module_user

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

//import com.yxy.lib_common.ToastUtils


class UserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textView = findViewById<TextView>(R.id.textview)
        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            textView.text = "点击后的值:user666"
//            ToastUtils.show(this, "666")
        }

    }
}