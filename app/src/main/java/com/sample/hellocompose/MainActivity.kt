package com.sample.hellocompose

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sample.hellocompose.screen1.Screen1Activity
import com.sample.hellocompose.screen1.Screen1ComposeActivity
import com.sample.hellocompose.screen2.Screen2Activity
import com.sample.hellocompose.screen2.Screen2ComposeActivity
import com.sample.hellocompose.screen3.Screen3Activity
import com.sample.hellocompose.screen3.Screen3ComposeActivity
import com.sample.hellocompose.screen4.Screen4Activity
import com.sample.hellocompose.screen4.Screen4ComposeActivity
import com.sample.hellocompose.ui.theme.HelloComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloComposeTheme {
                Surface(color = MaterialTheme.colors.background) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        ListItem("Screen1Activity") {
            context.startActivity(Intent(context, Screen1Activity::class.java))
        }
        ListItem("Screen1ComposeActivity") {
            context.startActivity(Intent(context, Screen1ComposeActivity::class.java))
        }

        Spacer(modifier = Modifier.height(32.dp))

        ListItem("Screen2Activity") {
            context.startActivity(Intent(context, Screen2Activity::class.java))
        }
        ListItem("Screen2ComposeActivity") {
            context.startActivity(Intent(context, Screen2ComposeActivity::class.java))
        }

        Spacer(modifier = Modifier.height(32.dp))

        ListItem("Screen3Activity") {
            context.startActivity(Intent(context, Screen3Activity::class.java))
        }
        ListItem("Screen3ComposeActivity") {
            context.startActivity(Intent(context, Screen3ComposeActivity::class.java))
        }

        Spacer(modifier = Modifier.height(32.dp))

        ListItem("Screen4Activity") {
            context.startActivity(Intent(context, Screen4Activity::class.java))
        }
        ListItem("Screen4ComposeActivity") {
            context.startActivity(Intent(context, Screen4ComposeActivity::class.java))
        }
    }
}

@Composable
fun ListItem(text: String, onClick: () -> Unit) {
    Text(
        text = text,
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(16.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    HelloComposeTheme {
        MainScreen()
    }
}
