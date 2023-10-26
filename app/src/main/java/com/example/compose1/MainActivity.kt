package com.example.compose1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose1.ui.theme.Compose1Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fontFamily = FontFamily(
            Font(R.font.lexend_black9, FontWeight.Thin),
            Font(R.font.lexend_black8, FontWeight.Light),
            Font(R.font.lexend_black7, FontWeight.Normal),
            Font(R.font.lexend_black6, FontWeight.Medium),
            Font(R.font.lexend_black5, FontWeight.SemiBold),
            Font(R.font.lexend_black2, FontWeight.Bold),
            Font(R.font.lexend_black, FontWeight.ExtraBold),
        )
        setContent {
            Box(modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF101010))){
                Text(
                    text = buildAnnotatedString {
                    withStyle(style = SpanStyle(
                        color = Color.Green,
                        fontSize = 50.sp
                    )) {
                        append("J")
                    }
                        append("etpack")

                        withStyle(style = SpanStyle(
                            color = Color.Green,
                            fontSize = 50.sp
                        )) {
                            append(" C")
                        }
                        append("ompose")

                    },



                //" Jetpack Compose",
                    color = Color.Red,
                    fontSize = 30.sp,
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic,
                    //textDecoration = TextDecoration.Underline

                )

            }



        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Compose1Theme {
        Greeting("Android")
    }
}


@Composable

fun ImageCard(
    painter: Painter,
    contentDescription: String, // Corrected the typo in variable name
    title: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth(0.5f)
            .padding(16.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp

    ) {
        Box(modifier = Modifier.height(200.dp)) {
            Image(
                painter = painter,
                contentDescription = contentDescription, // Corrected the typo in variable name
                contentScale = ContentScale.Crop
            )


            Box (modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black
                        ),
                        startY = 300f

                    )
                )
            ){

            }
          Box(modifier = Modifier
              .fillMaxSize()
              .padding(12.dp), contentAlignment = Alignment.BottomStart)
          {
               Text(title, style = TextStyle(color = Color.White, fontSize =  16.sp))
          }
        }
    }
}


