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

@Composable
fun ReviewList() {
    Column(Modifier.padding(top = 30.dp,),) {
        ReviewListElement(
            name = stringResource(id = R.string.first_review_name,),
            data = stringResource(id = R.string.first_review_data,),
            imageId = R.drawable.first_head,
            desc = stringResource(id = R.string.first_review_desc,),
        )
        Box(
            Modifier
                .padding(top = 24.dp, bottom = 24.dp, start = 13.dp, end = 37.dp,)
                .height(borderHeight,)
                .background(borderBetweenReviewColor,)
                .fillMaxWidth(),
        )
        ReviewListElement(
            name = stringResource(id = R.string.second_review_name,),
            data = stringResource(id = R.string.second_review_data,),
            imageId = R.drawable.second_head,
            desc = stringResource(id = R.string.second_review_desc,),
        )
    }
}