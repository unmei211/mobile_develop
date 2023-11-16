package com.example.dotaapp.firstpage.header

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.dotaapp.R
import com.example.dotaapp.ui.theme.appBackgroundColor
import com.example.dotaapp.ui.theme.headerImageHeight
import com.example.dotaapp.ui.theme.headerImageWidth

@Composable
fun Header() {
    Surface(modifier = Modifier.fillMaxSize(), color = appBackgroundColor) {
        Image(
            painter = painterResource(id = R.drawable.source_dota_head),
            contentDescription = stringResource(R.string.header_image_description),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(headerImageWidth)
                .height(headerImageHeight)
        )
        AppTitle()
    }
}
