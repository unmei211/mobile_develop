package com.example.dotaapp.firstpage

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.dotaapp.firstpage.body.Body
import com.example.dotaapp.firstpage.footer.Footer
import com.example.dotaapp.firstpage.header.Header
import com.example.dotaapp.ui.theme.DotaAppTheme
import com.example.dotaapp.ui.theme.appBackgroundColor

@Composable
fun FirstPage() {
    DotaAppTheme {
        Surface(modifier = Modifier.fillMaxSize(), color = appBackgroundColor,) {
            Column(
                modifier = Modifier.verticalScroll(ScrollState(0,),)
            ) {
                Header()
                Body()
                Footer()
            }
        }
    }
}