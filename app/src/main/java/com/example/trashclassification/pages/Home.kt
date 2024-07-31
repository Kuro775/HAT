package com.example.trashclassification.pages

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.trashclassification.R
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

    val pagerState = rememberPagerState (pageCount = {
        10
    })

    val coroutineScope = rememberCoroutineScope()

    var category by remember{
        mutableIntStateOf(0)
    }

    Box(
        modifier = modifier.fillMaxSize(),
    ) {

        Image(
            painter = painterResource(id = R.drawable.welcome_img),
            contentDescription = "User Avatar",
            contentScale = ContentScale.Fit,
            modifier = modifier
                .offset(y = 150.dp)
                .padding(end = 20.dp)
                .clip(CircleShape)
                .size(150.dp)
                .background(Color.Gray)
                .border(2.dp, Color.White, CircleShape)
                .zIndex(zIndex = 1f)
                .align(Alignment.TopEnd)

        )

        Column(
            modifier = modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Box(
                modifier = modifier
                    .fillMaxHeight(.3f)
                    .fillMaxWidth()
                    .background(
                        Brush.horizontalGradient(
                            listOf(
                                Color.Magenta,
                                Color.Green
                            )
                        )
                    )
            ) {
                Column(
                    modifier = modifier
                        .fillMaxWidth(.9f)
                        .fillMaxHeight()
                        .align(Alignment.Center),
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.SpaceAround
                ) {

                    Spacer(modifier = modifier)

                    Text(
                        text = "Alena Alena",
                        modifier = modifier,
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 25.sp
                        )
                    )

                    Row(
                        modifier = modifier,
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        StatusTag(img = R.drawable.welcome_img, content = "XX pts")

                        StatusTag(img = R.drawable.welcome_img, content = "XX Carbon")
                    }

                    StatusTag(img = R.drawable.welcome_img, content = "XX pts")

                    StatusTag(img = R.drawable.welcome_img, content = "XX Carbon")

                }
            }




            Column(
                modifier = modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround
            ) {
                Text(
                    text = "Category",
                    modifier = modifier
                        .align(Alignment.Start)
                        .padding(20.dp),
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 20.sp
                    )
                )

                Row(
                    modifier = modifier
                        .fillMaxWidth()
                        .fillMaxHeight(.1f)
                        .clip(RoundedCornerShape(25.dp))
                        .border(1.dp, Color.Gray, RoundedCornerShape(25.dp))
                        .horizontalScroll(rememberScrollState()),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {

                    Box(
                        modifier = modifier
                            .padding(5.dp)
                            .fillMaxHeight()
                            .width(100.dp)
                            .clip(RoundedCornerShape(50))
                            .clickable {
                                coroutineScope.launch {
                                    category = 0
                                    pagerState.animateScrollToPage(0)
                                }
                            }
                            .conditional(category == 0) {
                                background(Color.Red)
                            }
                    ) {
                        Text(
                            text = "Breakfast",
                            modifier = modifier
                                .align(Alignment.Center)
                        )
                    }

                    Box(
                        modifier = modifier
                            .padding(5.dp)
                            .fillMaxHeight()
                            .width(100.dp)
                            .clip(RoundedCornerShape(50))
                            .clickable {
                                coroutineScope.launch {
                                    category = 1
                                    pagerState.animateScrollToPage(1)
                                }
                            }
                            .conditional(category == 1) {
                                background(Color.Red)
                            }
                    ) {
                        Text(
                            text = "Lunch",
                            modifier = modifier
                                .align(Alignment.Center)
                        )
                    }

                    Box(
                        modifier = modifier
                            .padding(5.dp)
                            .fillMaxHeight()
                            .width(100.dp)
                            .clip(RoundedCornerShape(50))
                            .clickable {
                                coroutineScope.launch {
                                    category = 2
                                    pagerState.animateScrollToPage(2)
                                }
                            }
                            .conditional(category == 2) {
                                background(Color.Red)
                            }
                    ) {
                        Text(
                            text = "Dinner",
                            modifier = modifier
                                .align(Alignment.Center)
                        )
                    }


                }

                HorizontalPager(
                    state = pagerState,
                    modifier = modifier
                        .weight(1f)
                ) { page ->
                    Image(
                        painter = painterResource(id = R.drawable.welcome_img),
                        contentDescription = "Trash category image",
                        contentScale = ContentScale.Fit,
                        modifier = modifier
                            .fillMaxWidth()
                            .fillMaxHeight(.8f)
//                        .align(Alignment.CenterHorizontally)
                    )
                }
            }
        }
    }
}

@Composable
fun StatusTag(modifier: Modifier = Modifier, img: Int, content: String) {
    Row(
        modifier = modifier
            .wrapContentSize()
            .height(30.dp)
            .background(Color.Transparent)
            .border(1.dp, Color.White, RoundedCornerShape(25.dp)),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Image(
            painter = painterResource(id = img),
            contentDescription = "Status image",
            contentScale = ContentScale.Fit,
            modifier = modifier
                .size(30.dp)
                .padding(5.dp)
        )

        Text(
            text = content,
            modifier = modifier
                .padding(5.dp),
            style = TextStyle(
                color = Color.White,
                fontSize = 15.sp
            )
        )
    }
}

//@Preview(showBackground = true, backgroundColor = 0xFFFF00FF)
//@Composable
//fun StatusTagPreview() {
//    StatusTag(img = R.drawable.welcome_img, content = "1000 pts")
//}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    HomeScreen()
}

fun Modifier.conditional(condition : Boolean, modifier: Modifier.() -> Modifier) : Modifier {
    return if (condition) {
        then(modifier(Modifier))
    } else {
        this
    }
}
