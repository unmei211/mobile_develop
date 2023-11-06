package com.example.dotaapp.firstpage.header

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.dotaapp.ui.theme.titleSpacerWidth

@Composable
fun AppTitle() {
    Row(
        modifier = Modifier.padding(start = 24.dp, top = 328.dp),
        verticalAlignment = Alignment.Bottom
    ) {
        AppTitleIcon()
        Spacer(modifier = Modifier.width(titleSpacerWidth))
        AppTitleSpecification()
    }
}