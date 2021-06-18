package com.sample.hellocompose.screen3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sample.hellocompose.ui.theme.HelloComposeTheme

class Screen3ComposeActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloComposeTheme {
                HelloScreen3()
            }
        }
    }
}

@Composable
fun HelloScreen3() {
    val text: MutableState<String> = remember {
        mutableStateOf("")
    }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        TextField(value = text.value, onValueChange = { text.value = it })

        Spacer(modifier = Modifier.height(16.dp))

        val enabled = true // TODO
        Button(onClick = { }, enabled = enabled) {
            Text("Button")
        }
    }
}

@Preview
@Composable
fun HelloScreen3Preview() {
    HelloComposeTheme {
        HelloScreen3()
    }
}
