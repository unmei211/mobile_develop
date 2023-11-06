package com.example.dotaapp.firstpage.body

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.dotaapp.R
import com.example.dotaapp.ui.theme.eclipseAll
import com.example.dotaapp.ui.theme.eclipseArrowAll
import com.example.dotaapp.ui.theme.screenshotsHeight
import com.example.dotaapp.ui.theme.screenshotsWidth

@Composable
fun AppScreens() {
    Row(
        Modifier
            .horizontalScroll(ScrollState(0),)
            .padding(start = 24.dp, top = 15.dp,)
    ) {
        var imgMod = Modifier
            .width(screenshotsWidth,)
            .height(screenshotsHeight,)
            .clip(shape = RoundedCornerShape(12.dp,),)
            .padding(end = 15.dp,)
        Box(contentAlignment = Alignment.Center,) {
            Image(
                painter = painterResource(id = R.drawable.screen_first,),
                contentDescription = stringResource(id = R.string.screen_first,),
                imgMod,
                contentScale = ContentScale.Fit,
            )
            Image(
                painter = painterResource(id = R.drawable.eclipse,),
                contentDescription = stringResource(id = R.string.eclipse,),
                modifier = Modifier
                    .width(eclipseAll,)
                    .height(eclipseAll,),
                contentScale = ContentScale.Fit,
            )
            Image(
                painter = painterResource(id = R.drawable.arrow,),
                contentDescription = stringResource(id = R.string.arrow,),
                Modifier
                    .width(eclipseArrowAll)
                    .height(eclipseArrowAll),
                contentScale = ContentScale.Fit,
            )
        }
        Image(
            painter = painterResource(id = R.drawable.screen_second,),
            contentDescription = stringResource(id = R.string.screen_second,),
            imgMod,
            contentScale = ContentScale.Fit,
        )
    }
}