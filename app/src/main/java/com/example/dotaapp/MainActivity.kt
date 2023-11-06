package com.example.dotaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dotaapp.ui.theme.DotaAppTheme
import com.example.dotaapp.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DotaAppTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = appBackgroundColor) {
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
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight(400),
                    fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
                    color = titleCounterColor,
                    letterSpacing = 0.5.sp,
                )
            )
        }
    }
}
@Composable

fun AppDescription() {
    Row(modifier = Modifier.padding(start = 24.dp, top = 21.dp)) {
        val box_mod = Modifier
            .padding(end = 10.dp)
            .background(color = tagsBackgroundColor, shape = RoundedCornerShape(size = 100.dp))
        val text_mod = Modifier.padding(start = 10.dp, top = 5.dp, end = 10.dp, bottom = 5.dp)
        val font_style = TextStyle(
            fontSize = 10.sp,
            fontFamily = FontFamily(Font(R.font.montserrat_regular)),
            fontWeight = FontWeight(500),
            color = tagsTextColor,
        )
        Box(modifier = box_mod) {
            Text(text = stringResource(id = R.string.tag_1), text_mod, style = font_style)
        }
        Box(modifier = box_mod) {
            Text(text = stringResource(id = R.string.tag_2), text_mod, style = font_style)
        }
        Box(modifier = box_mod) {
            Text(text = stringResource(id = R.string.tag_3), text_mod, style = font_style)
        }
    }
    Box(modifier = Modifier.padding(start = 21.dp, top = 29.dp, end = 24.dp)) {
        val text = stringResource(id = R.string.app_description)
        val font_style = TextStyle(
            fontSize = 12.sp,
            fontWeight = FontWeight(400),
            lineHeight = 19.sp,
            fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
            color = descriptionTextColor,
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
            .width(screenshotsWidth)
            .height(screenshotsHeight)
            .clip(shape = RoundedCornerShape(12.dp))
            .padding(end = 15.dp)
        Box(contentAlignment = Center) {
            Image(
                painter = painterResource(id = R.drawable.screen_first),
                contentDescription = stringResource(id = R.string.screen_first),
                img_mod,
                contentScale = ContentScale.Fit
            )
            Image(
                painter = painterResource(id = R.drawable.eclipse),
                contentDescription = stringResource(id = R.string.eclipse),
                modifier = Modifier
                    .width(eclipseAll)
                    .height(eclipseAll),
                contentScale = ContentScale.Fit
            )
            Image(
                painter = painterResource(id = R.drawable.arrow),
                contentDescription = stringResource(id = R.string.arrow),
                Modifier
                    .width(eclipseArrowAll)
                    .height(eclipseArrowAll),
                contentScale = ContentScale.Fit
            )
        }
        Image(
            painter = painterResource(id = R.drawable.screen_second),
            contentDescription = stringResource(id = R.string.screen_second),
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
        text = stringResource(id = R.string.review_title),
        style = TextStyle(
            fontSize = 16.sp,
            fontFamily = FontFamily(Font(R.font.sk_modernist_bold)),
            fontWeight = FontWeight(700),
            color = titleReviewsColor,
            letterSpacing = 0.6.sp
        ),
        modifier = Modifier.padding(bottom = 12.dp)
    )
    Row(verticalAlignment = Alignment.Top) {
        Text(
            stringResource(id = R.string.app_rate),
            style = TextStyle(
                fontSize = 48.sp,
                fontFamily = FontFamily(Font(R.font.sk_modernist_bold)),
                fontWeight = FontWeight(700),
                color = rateValueColor,
            )
        )
        Column(Modifier.padding(start = 16.dp, top = 12.dp)) {
            Image(
                painter = painterResource(id = R.drawable.fourwithnitstars),
                contentDescription = stringResource(id = R.string.review_stars_image),
                modifier = Modifier
                    .width(titleStarsWidth)
                    .height(titleStarsHeight),
                contentScale = ContentScale.Fit
            )
            Text(
                text = stringResource(id = R.string.downloads) + " " + stringResource(id = R.string.reviews),
                style = TextStyle(
                    fontWeight = FontWeight(400),
                    color = reviewCounterColor,
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
                contentDescription = stringResource(id = R.string.review_photo),
                Modifier
                    .width(avatarAll)
                    .height(avatarAll)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(reviewSpace))
            Column {
                Text(
                    text = name, style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
                        fontWeight = FontWeight(400),
                        color = reviewerNameColor,
                        letterSpacing = 0.5.sp,
                    ),
                    modifier = Modifier.padding(bottom = 7.dp)
                )
                Text(
                    text = data, style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
                        fontWeight = FontWeight(400),
                        color = reviewDataColor,
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
                color = reviewDescriptionColor,
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
            name = stringResource(id = R.string.first_review_name),
            data = stringResource(id = R.string.first_review_data),
            imageId = R.drawable.first_head,
            desc = stringResource(id = R.string.first_review_desc),
        )
        Box(
            Modifier
                .padding(top = 24.dp, bottom = 24.dp, start = 13.dp, end = 37.dp)
                .height(borderHeight)
                .background(borderBetweenReviewColor)
                .fillMaxWidth()
        )
        ReviewListElement(
            name = stringResource(id = R.string.second_review_name),
            data = stringResource(id = R.string.second_review_data),
            imageId = R.drawable.second_head,
            desc = stringResource(id = R.string.second_review_desc),
        )
    }
}

@Composable
fun Footer() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 24.dp, end = 24.dp, top = 40.dp, bottom = 38.dp)
            .width(footerButtonWidth)
            .height(footerButtonHeight)
            .background(
                footerButtonBackground,
                shape = RoundedCornerShape(size = 12.dp)
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = stringResource(id = R.string.footer_button),
            style = TextStyle(
                color = footerTextColor,
                fontSize = 20.sp,
                fontWeight = FontWeight(700),
                letterSpacing = 0.6.sp,
            )
        )
    }
}