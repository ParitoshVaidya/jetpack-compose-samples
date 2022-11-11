package com.supersnippets.compose

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.supersnippets.compose.ui.theme.ComposeSamplesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeSamplesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CodeSamples()
                }
            }
        }
    }
}

@Composable
fun CodeSamples() {
    val context = LocalContext.current

    Column(modifier = Modifier.padding(16.dp)) {
        Button(onClick = {
            context.startActivity(
                Intent(
                    context,
                    GreetingCardActivity::class.java
                )
            )
        }) {
            Text(text = "Greeting Card")
        }
        Button(onClick = {
            context.startActivity(
                Intent(
                    context,
                    DiceRollerActivity::class.java
                )
            )
        }) {
            Text(text = "Dice Roller")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CodeSamplesPreview() {
    ComposeSamplesTheme {
        CodeSamples()
    }
}