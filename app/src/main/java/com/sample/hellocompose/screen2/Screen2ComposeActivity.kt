package com.sample.hellocompose.screen2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sample.hellocompose.ui.theme.HelloComposeTheme

class Screen2ComposeActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloComposeTheme {
                HelloScreen2()
            }
        }
    }
}

@Composable
fun HelloScreen2() {
    val isChecked = remember { mutableStateOf(false) }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        if (isChecked.value) {
            Text(text = "Hello World")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Checkbox(
            checked = isChecked.value,
            onCheckedChange = { isChecked.value = it }
        )
    }
}

@Preview
@Composable
fun HelloScreen2Preview() {
    HelloComposeTheme {
        HelloScreen2()
    }
}
