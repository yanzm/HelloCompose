package com.sample.hellocompose.screen3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.core.widget.addTextChangedListener
import com.sample.hellocompose.R

class Screen3Activity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // activity_screen3.xml をこの画面の UI としてセットする
        setContentView(R.layout.activity_screen3)

        // id を使って EditText を取得する
        val editText = findViewById<EditText>(R.id.editText)

        // id を使って Button を取得する
        val button = findViewById<Button>(R.id.button)

        // EditText の最初の状態を反映する
        button.isEnabled = editText.text.toString().length in 6..12

        // EditText の入力文字を監視する
        editText.addTextChangedListener {
            val text = it?.toString() ?: ""
            val enabled = text.length in 6..12
            button.isEnabled = enabled
        }
    }
}
