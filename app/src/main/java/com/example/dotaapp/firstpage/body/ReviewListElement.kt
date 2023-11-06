package com.example.dotaapp.firstpage.body

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.dotaapp.R
import com.example.dotaapp.ui.theme.Typography
import com.example.dotaapp.ui.theme.avatarAll
import com.example.dotaapp.ui.theme.reviewSpace

@Composable
fun ReviewListElement(name: String, data: String, imageId: Int, desc: String) {
    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 16.dp)
        ) {
            Image(
                painter = painterResource(id = imageId),
                contentDescription = stringResource(id = R.string.review_photo),
                Modifier
                    .width(avatarAll)
                    .height(avatarAll)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(reviewSpace))
            Column {
                Text(
                    text = name,
                    style = Typography.bodyLarge,
                    modifier = Modifier.padding(bottom = 7.dp)
                )
                Text(
                    text = data,
                    style = Typography.labelSmall
                )
            }
        }
        Text(
            text = desc,
            style = Typography.bodyMedium,
            modifier = Modifier.padding(end = 24.dp)
        )
    }
}