package com.example.firstlaunch

import android.app.ActionBar
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainContent()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainContent() {
    Column(
        modifier = Modifier
            .background(color = Color(0xFF050B18))
            .fillMaxSize()
            .verticalScroll(ScrollState(0))
    ) {
        Header()
    }
}

@Composable
fun Header() {
    Box {
        Image(
            painter = painterResource(id = R.drawable.header_image),
            contentDescription = "header",
            modifier = Modifier
                .width(628.dp)
                .height(354.dp)
        )
        Box(modifier = Modifier
            .padding(top = 300.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.subicon),
                contentDescription = "sub_icon",
                modifier = Modifier.size(150.dp),
                contentScale = ContentScale.Crop
            )
            Image(
                painter = painterResource(id = R.drawable.icon),
                contentDescription = "icon",
                modifier = Modifier.size(100.dp)
                    .padding(start = 40.dp, top = 23.dp),
                contentScale = ContentScale.Fit
            )
            Box(modifier = Modifier.padding(start = 124.dp, top = 50.dp)) {
                Text(
                    text = "DoTA 2",
                    modifier = Modifier
                        .width(70.dp)
                        .height(26.dp),
                    style = TextStyle(
                        fontSize = 20.sp,
                        lineHeight = 26.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFFFFFFFF),
                        letterSpacing = 0.5.sp
                    )
                )
                Image(
                    painter = painterResource(id = R.drawable.full_five_stars),
                    contentDescription = "stars",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.size(80.dp)
                )
                Text(
                    text = "70M",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF45454D),
                        letterSpacing = 0.5.sp
                    ),
                    modifier = Modifier.padding(top = 32.dp, start = 85.dp)
                )
            }
        }
    }
}