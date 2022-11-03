package com.example.rowcolumnexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.rowcolumnexample.ui.theme.RowColumnExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RowColumnExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    Column(
                        modifier = Modifier.height(500.dp).width(500.dp).background(Color.LightGray),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        CustomItem(weight = 3f, color = MaterialTheme.colors.primary)
                        CustomItem(weight = 1f, color = MaterialTheme.colors.secondary)
                    }
                }
            }
        }
    }
}

@Composable
fun ColumnScope.CustomItem(weight: Float, color: Color) {
    Surface(
        modifier = Modifier
            .width(200.dp)
            .weight(weight),
        color = color
    ) {

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RowColumnExampleTheme {
        Column(
            modifier = Modifier.height(500.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            CustomItem(weight = 3f, color = MaterialTheme.colors.primary)
            CustomItem(weight = 1f, color = MaterialTheme.colors.secondary)
        }
    }
}