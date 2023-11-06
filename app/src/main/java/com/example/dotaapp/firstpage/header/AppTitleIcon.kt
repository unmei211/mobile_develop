package com.example.dotaapp.firstpage.header

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.dotaapp.R
import com.example.dotaapp.ui.theme.titleBoxAll
import com.example.dotaapp.ui.theme.titleIconAll

@Composable
fun AppTitleIcon() {
    Box(contentAlignment = Alignment.Center) {
        Image(
            painter = painterResource(id = R.drawable.icon_background),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .width(titleBoxAll)
                .height(titleBoxAll)
        )
        Image(
            painter = painterResource(id = R.drawable.dota_icon),
            contentDescription = "icon",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .width(titleIconAll)
                .height(titleIconAll)
        )
    }
}