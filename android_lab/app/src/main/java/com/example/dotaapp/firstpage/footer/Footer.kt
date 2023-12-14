package com.example.dotaapp.firstpage.footer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.dotaapp.R
import com.example.dotaapp.ui.theme.Typography
import com.example.dotaapp.ui.theme.footerButtonBackground
import com.example.dotaapp.ui.theme.footerButtonHeight
import com.example.dotaapp.ui.theme.footerButtonWidth

@Composable
fun Footer() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 24.dp, end = 24.dp, top = 40.dp, bottom = 38.dp,)
            .width(footerButtonWidth,)
            .height(footerButtonHeight,)
            .background(
                footerButtonBackground,
                shape = RoundedCornerShape(size = 12.dp,),
            ),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = stringResource(id = R.string.footer_button,),
            style = Typography.labelLarge,
        )
    }
}