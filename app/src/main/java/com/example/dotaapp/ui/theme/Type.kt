package com.example.dotaapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.dotaapp.R

// Set of Material typography styles to start with
val Typography = Typography(
    titleMedium = TextStyle(
        letterSpacing = 0.5.sp,
        fontSize = 20.sp,
        color = appTitleTextColor,
        lineHeight = 26.sp,
        fontFamily = FontFamily(Font(R.font.sk_modernist_bold)),
        fontWeight = FontWeight(700)
    ),
    displaySmall = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight(400),
        fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
        color = titleCounterColor,
        letterSpacing = 0.5.sp,
    ),
    displayMedium =  TextStyle(
        fontSize = 10.sp,
        fontFamily = FontFamily(Font(R.font.montserrat_regular)),
        fontWeight = FontWeight(500),
        color = tagsTextColor,
    ),
    displayLarge = TextStyle(
        fontWeight = FontWeight(400),
        color = reviewCounterColor,
        letterSpacing = 0.5.sp
    ),
    bodySmall = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight(400),
        lineHeight = 19.sp,
        fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
        color = descriptionTextColor,
    ),
    titleSmall = TextStyle(
        fontSize = 16.sp,
        fontFamily = FontFamily(Font(R.font.sk_modernist_bold)),
        fontWeight = FontWeight(700),
        color = titleReviewsColor,
        letterSpacing = 0.6.sp
    ),
    titleLarge = TextStyle(
        fontSize = 48.sp,
        fontFamily = FontFamily(Font(R.font.sk_modernist_bold)),
        fontWeight = FontWeight(700),
        color = rateValueColor,
    ),
    bodyLarge = TextStyle(
        fontSize = 16.sp,
        fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
        fontWeight = FontWeight(400),
        color = reviewerNameColor,
        letterSpacing = 0.5.sp,
    ),
    labelSmall = TextStyle(
        fontSize = 12.sp,
        fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
        fontWeight = FontWeight(400),
        color = reviewDataColor,
        letterSpacing = 0.5.sp,
    ),
    bodyMedium = TextStyle(
        fontSize = 12.sp,
        lineHeight = 20.sp,
        fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
        fontWeight = FontWeight(400),
        color = reviewDescriptionColor,
        letterSpacing = 0.5.sp,
    ),
    labelLarge = TextStyle(
        color = footerTextColor,
        fontSize = 20.sp,
        fontWeight = FontWeight(700),
        letterSpacing = 0.6.sp,
    ),
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)