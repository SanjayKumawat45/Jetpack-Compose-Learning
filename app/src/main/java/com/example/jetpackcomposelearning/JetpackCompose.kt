package com.example.jetpackcomposelearning

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun ProfileCard(name:String, age: Int, color:Color){

//    Text("Hello $name")
    Text("Here's your name: $name \n Here's your age: $age \n And here's your fav color: $color")

}
