package com.sample.hellocompose.screen2

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.sample.hellocompose.R

class Screen2Activity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // activity_screen2.xml をこの画面の UI としてセットする
        setContentView(R.layout.activity_screen2)

        // id を使って TextView を取得する
        val textView = findViewById<TextView>(R.id.textView)

        // id を使って CheckBox を取得する
        val checkBox = findViewById<CheckBox>(R.id.checkbox)

        // CheckBox の最初の状態を反映する
        textView.visibility = if (checkBox.isChecked) View.VISIBLE else View.GONE

        // CheckBox がクリックされたときの処理
        checkBox.setOnCheckedChangeListener { _, isChecked ->
            textView.visibility = if (isChecked) View.VISIBLE else View.GONE
        }
    }
}
