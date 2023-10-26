package com.example.compose1

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose1.ui.theme.Compose1Theme
import kotlinx.coroutines.launch
import kotlin.random.*

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

            Column (modifier = Modifier.padding(horizontal = 5.dp) ){
                LazyRow(
                    // modifier =  Modifier.verticalScroll(scrollState)
                ) {
//                itemsIndexed(
//                    listOf("this", "is","Jetpack", "Conmpose")
//                ){index: Int, String: String ->
//                    Text(
//                        text = String,
//                        fontSize = 24.sp,
//                        fontWeight = FontWeight.Bold,
////                        textAlign =Alignment.Center,
//                        textAlign = TextAlign.Center,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(vertical = 25.dp)
//
//                    )
//                }
                    items(5000) {

                        Text(
                            text = "Item $it ",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
//                        textAlign =Alignment.Center,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 25.dp)

                        )
                    }
                }
                    LazyRow{
                    items(5000) {

                        Text(
                            text = "Item $it",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,

                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 25.dp)

                        )
                    }

                }
                LazyRow{
                    items(5000) {

                        Text(
                            text = "Item $it ",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,

                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 25.dp)

                        )
                    }

                }
                LazyRow{
                    items(5000) {

                        Text(
                            text = "Item $it ",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,

                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 25.dp)

                        )
                    }

                }
                LazyRow{
                    items(5000) {

                        Text(
                            text = "Item $it ",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,

                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 25.dp)

                        )
                    }

                }
                LazyRow{
                    items(5000) {

                        Text(
                            text = "Item $it ",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,

                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 25.dp)

                        )
                    }

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



@Composable
fun ColorBox(modifier: Modifier= Modifier,
updateColor :(Color)->Unit){
    val color =  remember {
        mutableStateOf(Color.Yellow)
    }

    Box(modifier = modifier
        .background(color = color.value)


        .clickable {
            updateColor(
                Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )


            )
            color.value = Color(
                Random.nextFloat(),
                Random.nextFloat(),
                Random.nextFloat(),
                1f
            )
        }
    )

}}