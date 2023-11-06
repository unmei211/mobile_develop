package com.example.dotaapp.firstpage.body

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.dotaapp.R
import com.example.dotaapp.ui.theme.Typography
import com.example.dotaapp.ui.theme.tagsBackgroundColor

@Composable

fun AppDescription() {
    Row(modifier = Modifier.padding(start = 24.dp, top = 21.dp,)) {
        val boxMod = Modifier
            .padding(end = 10.dp,)
            .background(color = tagsBackgroundColor, shape = RoundedCornerShape(size = 100.dp,),)
        val textMod = Modifier.padding(start = 10.dp, top = 5.dp, end = 10.dp, bottom = 5.dp,)

        val fontStyle = Typography.displayMedium

        Box(modifier = boxMod,) {
            Text(text = stringResource(id = R.string.tag_1,), textMod, style = fontStyle,)
        }
        Box(modifier = boxMod,) {
            Text(text = stringResource(id = R.string.tag_2,), textMod, style = fontStyle,)
        }
        Box(modifier = boxMod,) {
            Text(text = stringResource(id = R.string.tag_3,), textMod, style = fontStyle,)
        }
    }
    Box(modifier = Modifier.padding(start = 21.dp, top = 29.dp, end = 24.dp,),) {
        Text(
            stringResource(id = R.string.app_description,),
            style = Typography.bodySmall,
        )
    }
}