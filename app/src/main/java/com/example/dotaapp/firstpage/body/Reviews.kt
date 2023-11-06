package com.example.dotaapp.firstpage.body

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Reviews() {
    Column(Modifier.padding(start = 24.dp, top = 20.dp,),) {
        Average()
        ReviewList()
    }
}