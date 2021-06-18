package com.sample.hellocompose.screen4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sample.hellocompose.ui.theme.HelloComposeTheme

class Screen4ComposeActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloComposeTheme {
                HelloScreen4()
            }
        }
    }
}

@Composable
fun HelloScreen4() {
    val text: MutableState<String> = remember {
        mutableStateOf("")
    }

    val acceptedChars = remember { arrayOf('1', '2', '3', '4') }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        TextField(
            value = text.value,
            onValueChange = {
                text.value = it.filter { it in acceptedChars }
            }
        )
    }
}

@Preview
@Composable
fun HelloScreen4Preview() {
    HelloComposeTheme {
        HelloScreen4()
    }
}
