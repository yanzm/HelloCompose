package com.sample.hellocompose.screen1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.sample.hellocompose.R
import kotlin.random.Random

class Screen1Activity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // activity_screen1.xml をこの画面の UI としてセットする
        setContentView(R.layout.activity_screen1)

        // id を使って TextView を取得する
        val textView = findViewById<TextView>(R.id.textView)

        // id を使って Button を取得する
        val button = findViewById<Button>(R.id.button)

        // button がクリックされたときの処理
        button.setOnClickListener {
            Random.nextInt()
            // TODO: 1 ~ 6 のランダムな数字を表示する
            textView.text = "Hello"
        }
    }
}
