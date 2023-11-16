package com.example.dotaapp.firstpage.body

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.dotaapp.R
import com.example.dotaapp.ui.theme.borderBetweenReviewColor
import com.example.dotaapp.ui.theme.borderHeight
import com.example.dotaapp.firstpage.data.*
@Composable
fun ReviewList() {
    Column(Modifier.padding(top = 30.dp,),) {
        ReviewListElement(reviewerFirst)
        Box(
            Modifier
                .padding(top = 24.dp, bottom = 24.dp, start = 13.dp, end = 37.dp,)
                .height(borderHeight,)
                .background(borderBetweenReviewColor,)
                .fillMaxWidth(),
        )
        ReviewListElement(reviewerSecond)
    }
}