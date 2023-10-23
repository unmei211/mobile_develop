package com.example.dotaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dotaapp.ui.theme.DotaAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DotaAppTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = Color(0xFF050B18)) {
                    Column(
                        modifier = Modifier.verticalScroll(ScrollState(0))
                    ) {
                        Header()
                        AppDescription()
                        AppScreens()
                        Reviews()
                        Footer()
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun Header() {
    Surface(modifier = Modifier.fillMaxSize(), color = Color(0xFF050B18)) {
        Image(
            painter = painterResource(id = R.drawable.source_dota_head),
            contentDescription = "dota head",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(628.dp)
                .height(354.dp)
        )
        AppTitle()
    }
}

@Preview
@Composable
fun AppTitle() {
    Row(
        modifier = Modifier.padding(start = 24.dp, top = 328.dp),
        verticalAlignment = Alignment.Bottom
    ) {
        AppTitleIcon()
        Spacer(modifier = Modifier.width(12.dp))
        AppTitleSpecification()
    }
}

@Preview
@Composable
fun AppTitleIcon() {
    Box(contentAlignment = Alignment.Center) {
        Image(
            painter = painterResource(id = R.drawable.icon_background),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .width(88.dp)
                .height(88.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.dota_icon),
            contentDescription = "icon",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .width(54.dp)
                .height(54.dp)
        )
    }
}

@Preview
@Composable
fun AppTitleSpecification() {
    Column(modifier = Modifier.padding(bottom = 11.dp)) {
        Text(
            "DoTA 2",
            style = TextStyle(
                letterSpacing = 0.5.sp,
                fontSize = 20.sp,
                color = Color.White,
                lineHeight = 26.sp,
                fontFamily = FontFamily(Font(R.font.sk_modernist_bold)),
                fontWeight = FontWeight(700)
            )
        )
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                modifier = Modifier
                    .width(76.dp)
                    .height(12.dp),
                painter = painterResource(id = R.drawable.five_stars),
                contentDescription = "five stars",
                contentScale = ContentScale.Fit
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                "70M",
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight(400),
                    fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
                    color = Color(0xFF45454D),
                    letterSpacing = 0.5.sp,
                )
            )
        }
    }
}

@Preview
@Composable

fun AppDescription() {
    Row(modifier = Modifier.padding(start = 24.dp, top = 21.dp)) {
        val box_mod = Modifier
            .padding(end = 10.dp)
            .background(color = Color(0x3D44A9F4), shape = RoundedCornerShape(size = 100.dp))
        val text_mod = Modifier.padding(start = 10.dp, top = 5.dp, end = 10.dp, bottom = 5.dp)
        val font_style = TextStyle(
            fontSize = 10.sp,
            fontFamily = FontFamily(Font(R.font.montserrat_regular)),
            fontWeight = FontWeight(500),
            color = Color(0xFF44A9F4),
        )
        Box(modifier = box_mod) {
            Text(text = "MOBA", text_mod, style = font_style)
        }
        Box(modifier = box_mod) {
            Text(text = "MULTIPLAYER", text_mod, style = font_style)
        }
        Box(modifier = box_mod) {
            Text(text = "STRATEGY", text_mod, style = font_style)
        }
    }
    Box(modifier = Modifier.padding(start = 21.dp, top = 29.dp, end = 24.dp)) {
        val text =
            "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own."
        val font_style = TextStyle(
            fontSize = 12.sp,
            fontWeight = FontWeight(400),
            lineHeight = 19.sp,
            fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
            color = Color(0xB2EEF2FB)
        )
        Text(text, style = font_style)
    }
}

@Composable
fun AppScreens() {
    Row(
        Modifier
            .horizontalScroll(ScrollState(0))
            .padding(start = 24.dp, top = 15.dp)
    ) {
        var img_mod = Modifier
            .width(240.dp)
            .height(135.dp)
            .clip(shape = RoundedCornerShape(12.dp))
            .padding(end = 15.dp)
        Box(contentAlignment = Center) {
            Image(
                painter = painterResource(id = R.drawable.screen_first),
                contentDescription = "screen first with play",
                img_mod,
                contentScale = ContentScale.Fit
            )
            Image(
                painter = painterResource(id = R.drawable.eclipse),
                contentDescription = "eclipse",
                modifier = Modifier
                    .width(48.dp)
                    .height(48.dp),
                contentScale = ContentScale.Fit
            )
            Image(
                painter = painterResource(id = R.drawable.arrow),
                contentDescription = "arrow",
                Modifier
                    .width(24.dp)
                    .height(24.dp),
                contentScale = ContentScale.Fit
            )
        }
        Image(
            painter = painterResource(id = R.drawable.screen_second),
            contentDescription = "screen 2",
            img_mod,
            contentScale = ContentScale.Fit
        )
    }
}

@Composable
fun Reviews() {
    Column(Modifier.padding(start = 24.dp, top = 20.dp)) {
        Average()
        ReviewList()
    }
}

@Composable
fun Average() {
    Text(
        text = "Review & Ratings",
        style = TextStyle(
            fontSize = 16.sp,
            fontFamily = FontFamily(Font(R.font.sk_modernist_bold)),
            fontWeight = FontWeight(700),
            color = Color(0xFFEEF2FB),
            letterSpacing = 0.6.sp
        ),
        modifier = Modifier.padding(bottom = 12.dp)
    )
    Row(verticalAlignment = Alignment.Top) {
        Text(
            "4.9",
            style = TextStyle(
                fontSize = 48.sp,
                fontFamily = FontFamily(Font(R.font.sk_modernist_bold)),
                fontWeight = FontWeight(700),
                color = Color(0xFFFFFFFF)
            )
        )
        Column(Modifier.padding(start = 16.dp, top = 12.dp)) {
            Image(
                painter = painterResource(id = R.drawable.fourwithnitstars),
                contentDescription = "4.5stars",
                modifier = Modifier
                    .width(76.dp)
                    .height(12.dp),
                contentScale = ContentScale.Fit
            )
            Text(
                text = "70M Reviews",
                style = TextStyle(
                    fontWeight = FontWeight(400),
                    color = Color(0xFFA8ADB7),
                    letterSpacing = 0.5.sp
                ),
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }
}

@Composable
fun ReviewListElement(name: String, data: String, imageId: Int, desc: String) {
    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 16.dp)
        ) {
            Image(
                painter = painterResource(id = imageId),
                contentDescription = "photo",
                Modifier
                    .width(36.dp)
                    .height(36.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = name, style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
                        fontWeight = FontWeight(400),
                        color = Color(0xFFFFFFFF),
                        letterSpacing = 0.5.sp,
                    ),
                    modifier = Modifier.padding(bottom = 7.dp)
                )
                Text(
                    text = data, style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
                        fontWeight = FontWeight(400),
                        color = Color(0x66FFFFFF),
                        letterSpacing = 0.5.sp,
                    )
                )
            }
        }
        Text(
            text = desc, style = TextStyle(
                fontSize = 12.sp,
                lineHeight = 20.sp,
                fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
                fontWeight = FontWeight(400),
                color = Color(0xFFA8ADB7),
                letterSpacing = 0.5.sp,
            ),
            modifier = Modifier.padding(end = 24.dp)
        )
    }
}

@Composable
fun ReviewList() {
    Column(Modifier.padding(top = 30.dp)) {
        ReviewListElement(
            name = "Auguste Conte",
            data = "February 14, 2019",
            imageId = R.drawable.first_head,
            desc = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”"
        )
        Box(
            Modifier
                .padding(top = 24.dp, bottom = 24.dp, start = 13.dp, end = 37.dp)
                .height(1.dp)
                .background(Color(0xFF1A1F29))
                .fillMaxWidth()
        )
        ReviewListElement(
            name = "Jang Marcelino",
            data = "February 14, 2019",
            imageId = R.drawable.second_head,
            desc = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”"
        )
    }
}

@Composable
fun Footer() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 24.dp, end = 24.dp, top = 40.dp, bottom = 38.dp)
            .width(327.dp)
            .height(64.dp)
            .background(
                Color(0xFFF4D144),
                shape = RoundedCornerShape(size = 12.dp)
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Install")
    }
}