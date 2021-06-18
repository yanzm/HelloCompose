package com.sample.hellocompose.screen4

import android.os.Bundle
import android.text.InputFilter
import android.text.Spanned
import android.widget.EditText
import androidx.activity.ComponentActivity
import com.sample.hellocompose.R

class Screen4Activity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // activity_screen4.xml をこの画面の UI としてセットする
        setContentView(R.layout.activity_screen4)

        // id を使って EditText を取得する
        val editText = findViewById<EditText>(R.id.editText)

        // 1, 2, 3, 4 だけ入力できるようにする
        editText.filters = arrayOf(
            object : InputFilter {

                val acceptedChars = arrayOf('1', '2', '3', '4')

                override fun filter(
                    source: CharSequence,
                    start: Int,
                    end: Int,
                    dest: Spanned?,
                    dstart: Int,
                    dend: Int
                ): CharSequence? {
                    val length = end - start
                    val filtered = source.subSequence(start, end).filter { it in acceptedChars }
                    return if (filtered.length == length) {
                        null
                    } else {
                        filtered
                    }
                }
            }
        )
    }
}
