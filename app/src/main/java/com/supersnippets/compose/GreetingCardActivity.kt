package com.supersnippets.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.supersnippets.compose.ui.theme.ComposeSamplesTheme

class GreetingCardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeSamplesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    GreetingImage()
                }
            }
        }
    }
}

@Composable
fun GreetingText() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Happy Birthday Friend!",
            fontSize = 34.sp,
            modifier = Modifier
                .padding(bottom = 8.dp)
        )
        Text(
            text = "- From Paritosh",
            fontSize = 18.sp,
            modifier = Modifier.align(Alignment.End)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingImage() {
    Box {
        Image(
            painter = painterResource(id = R.drawable.androidparty),
            contentDescription = "background image",
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            contentScale = ContentScale.Crop

        )
        GreetingText()
    }
}