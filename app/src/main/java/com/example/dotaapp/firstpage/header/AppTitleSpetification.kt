package com.example.dotaapp.firstpage.header

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import com.example.dotaapp.ui.theme.titleSpecificationColumnSpacer
import com.example.dotaapp.ui.theme.titleSpecificationSpacer
import com.example.dotaapp.ui.theme.titleStarsHeight
import com.example.dotaapp.ui.theme.titleStarsWidth

@Composable
fun AppTitleSpecification() {
    Column(modifier = Modifier.padding(bottom = 11.dp)) {
        Text(
            stringResource(id = R.string.header_title),
            style = Typography.titleMedium
        )
        Spacer(modifier = Modifier.height(titleSpecificationColumnSpacer))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                modifier = Modifier
                    .width(titleStarsWidth)
                    .height(titleStarsHeight),
                painter = painterResource(id = R.drawable.five_stars),
                contentDescription = stringResource(id = R.string.title_image_stars_rate),
                contentScale = ContentScale.Fit
            )
            Spacer(modifier = Modifier.width(titleSpecificationSpacer))
            Text(
                stringResource(id = R.string.downloads),
                style = Typography.displaySmall
            )
        }
    }
}