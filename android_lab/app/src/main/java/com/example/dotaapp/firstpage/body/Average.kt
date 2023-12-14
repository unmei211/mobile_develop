package com.example.dotaapp.firstpage.body

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.dotaapp.R
import com.example.dotaapp.ui.theme.Typography
import com.example.dotaapp.ui.theme.titleStarsHeight
import com.example.dotaapp.ui.theme.titleStarsWidth

@Composable
fun Average() {
    Text(
        text = stringResource(id = R.string.review_title,),
        style = Typography.titleSmall,
        modifier = Modifier.padding(bottom = 12.dp,),
    )
    Row(verticalAlignment = Alignment.Top,) {
        Text(
            stringResource(id = R.string.app_rate),
            style = Typography.titleLarge,
        )
        Column(Modifier.padding(start = 16.dp, top = 12.dp,),) {
            Image(
                painter = painterResource(id = R.drawable.fourwithnitstars,),
                contentDescription = stringResource(id = R.string.review_stars_image,),
                modifier = Modifier
                    .width(titleStarsWidth,)
                    .height(titleStarsHeight,),
                contentScale = ContentScale.Fit,
            )
            Text(
                text = stringResource(id = R.string.downloads,) + " " + stringResource(id = R.string.reviews,),
                style = Typography.displayLarge,
                modifier = Modifier.padding(top = 8.dp,),
            )
        }
    }
}