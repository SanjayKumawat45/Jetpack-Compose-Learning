package com.example.jetpackcomposelearning
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ColumnExample(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.background(color = Color.Gray).fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Box {
            Image(painter = painterResource(R.drawable.coffee), contentDescription = "Coffee_cup")
        }
        Spacer(modifier= Modifier.padding(16.dp))
        var coffee_count by remember { mutableStateOf(0) }
        Text("How many Cups you want")
        Text("$coffee_count")

        Row {
            Button(onClick = {
            coffee_count++;
        }) {
            Text("Add")
        }
            Spacer(modifier= Modifier.padding(14.dp))
            Button(onClick = {
                coffee_count--;
            }) {
                Text("Remove")
            }
        }
    }



}

@Composable
@Preview(showSystemUi = true)
fun ColumnLayoutPrev(modifier: Modifier = Modifier) {
    ColumnExample()
}