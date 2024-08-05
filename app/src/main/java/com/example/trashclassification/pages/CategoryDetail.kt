package com.example.trashclassification.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.automirrored.sharp.ArrowBack
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.CompositingStrategy
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.trashclassification.R

@Composable
fun CategoryDetailScreen(modifier: Modifier = Modifier) {
    Column (
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = modifier
                .verticalScroll(rememberScrollState())
                .height(720.dp)
                .fadingEdge(Brush.verticalGradient(0.9f to Color.Red, 1f to Color.Transparent)),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Box(
                modifier = modifier
                    .fillMaxWidth(.9f)
                    .fillMaxHeight(.5f)
                    .padding(top = 10.dp)
                    .clip(RoundedCornerShape(10)),
            ) {
                Image(
                    painter = painterResource(id = R.drawable.welcome_img),
                    contentDescription = "Status image",
                    contentScale = ContentScale.Fit,
                    modifier = modifier
                        .align(Alignment.Center)
                        .fillMaxSize()
                        .background(Color.Red)

                )

                IconButton(
                    onClick = { /*TODO*/ },
                    modifier = modifier
                        .align(Alignment.TopStart)
                        .padding(10.dp),
                    colors = IconButtonColors(
                        containerColor = Color.Gray,
                        contentColor = Color.White,
                        disabledContainerColor = Color.Gray,
                        disabledContentColor = Color.Gray
                    )
                ) {
                    Icon(
                        Icons.AutoMirrored.Rounded.ArrowBack,
                        contentDescription = "Back button"
                    )
                }

                Row(
                    modifier = modifier
                        .align(Alignment.BottomCenter)
                        .fillMaxWidth(.9f)
                        .fillMaxHeight(.3f)
                        .padding(20.dp)
                        .clip(RoundedCornerShape(20))
                        .background(
                            Brush.verticalGradient(
                                colorStops = arrayOf(
                                    0.1f to Color.Gray,
                                    1f to Color.Black
                                )
                            )
                        ),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Trash Type",
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 50.sp
                        ),
                        modifier = modifier
                    )
                }
            }

            Column(
                modifier = modifier
                    .fillMaxHeight()
                    .fillMaxWidth(.9f),
                verticalArrangement = Arrangement.spacedBy(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Detail",
                    style = TextStyle(
                        fontSize = 25.sp,
                        fontWeight = FontWeight.SemiBold
                    ),
                    modifier = modifier
                        .align(Alignment.Start)
                        .padding(top = 10.dp)
                )

                Row(
                    modifier = modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    repeat(3) {
                        Row(
                            modifier = modifier,
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(5.dp)
                        ) {
                            Icon(
                                Icons.Rounded.Star,
                                contentDescription = "detail icons",
                                modifier = modifier
                                    .clip(RoundedCornerShape(10))
                                    .background(Color.LightGray)
                            )

                            Text(
                                text = "info",
                                style = TextStyle(),
                                modifier = modifier
                            )
                        }
                    }
                }

                Text(
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
                    style = TextStyle(
                        color = Color.Gray,

                        )
                )
            }
        }

        Column (
            modifier = modifier
                .fillMaxWidth(.9f)
                .weight(1f),
            verticalArrangement = Arrangement.spacedBy(5.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Example",
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 22.sp
                ),
                modifier = modifier.align(Alignment.Start)
            )

            Row(
                modifier = modifier
                    .fillMaxSize(),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                repeat(4) {
                    Image(
                        painter = painterResource(id = R.drawable.welcome_img),
                        contentDescription = "User Avatar",
                        contentScale = ContentScale.Fit,
                        modifier = modifier
                            .size(75.dp)
                            .clip(RoundedCornerShape(15))
                            .background(Color.Gray)
                    )
                }
            }
        }
    }
}

fun Modifier.fadingEdge(brush: Brush) = this
    .graphicsLayer(compositingStrategy = CompositingStrategy.Offscreen)
    .drawWithContent {
        drawContent()
        drawRect(brush = brush, blendMode = BlendMode.DstIn)
    }

@Preview(showBackground = true)
@Composable
fun CategoryDetailPreview() {
    CategoryDetailScreen()
}