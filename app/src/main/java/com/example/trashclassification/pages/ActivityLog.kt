package com.example.trashclassification.pages

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.trashclassification.R
import java.time.LocalDate
import java.time.Period


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun ActivityLogScreen(modifier: Modifier = Modifier) {

    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp.dp

    val activities = getAllActivities()
    val scrollState = rememberScrollState()

    Column (
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box (
            modifier = modifier
                .fillMaxWidth()
                .fillMaxHeight(.4f)
                .clip(RoundedCornerShape(50.dp))
                .background(Color(0xFFFF8C42)),
        ){
            Row (
                modifier = modifier
                    .align(Alignment.TopStart)
                    .padding(20.dp)
                    .offset(y = (70).dp)
                    .height(45.dp),
//                    .background(Color.Red),
                horizontalArrangement = Arrangement.spacedBy(10.dp)

            ){
                Image(
                    painter = painterResource(id = R.drawable.welcome_img),
                    contentDescription = "User Avatar",
                    contentScale = ContentScale.Crop,
                    modifier = modifier
                        .clip(CircleShape)
                        .size(45.dp)
                        .background(Color.Gray)
                        .border(1.dp, Color.Black, CircleShape)
                )

                Column (
                    modifier = modifier.fillMaxHeight(),
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.SpaceBetween
                ){
                    Text(
                        text = "Hello",
                        style = TextStyle(
                            color = Color.Gray,
                            fontSize = 18.sp
                        )
                    )

                    Text(
                        text = "{Nickname}",
                        style = TextStyle(
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 22.sp
                        )
                    )
                }
            }

            Column (
                modifier = modifier
                    .align(Alignment.BottomCenter)
                    .fillMaxWidth()
                    .fillMaxHeight(0.5f),
//                    .background(Color.Red),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround
            ){
                Column(
                    modifier = modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Current Score",
                        style = TextStyle(
                            color = Color.Gray,
                            fontSize = 20.sp
                        )
                    )

                    Text(
                        text = "{Score}",
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 40.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }


                Box(modifier = modifier
                    .fillMaxWidth(0.85f)
                    .height(1.dp)
                    .clip(RoundedCornerShape(2.dp))
                    .background(color = Color.Gray)
                )

                Box(modifier = modifier
                    .fillMaxWidth(0.2f)
                    .height(5.dp)
                    .clip(RoundedCornerShape(2.dp))
                    .background(color = Color.Gray)
                )
            }
        }

        Text(
            text = "Recent Activity",
            style = TextStyle(
                color = Color.Black,
                fontSize = 25.sp
            ),
            modifier = modifier
                .align(Alignment.Start)
                .padding(20.dp)
                .height(30.dp)
        )

            LazyColumn (
                modifier = modifier
                    .verticalScroll(scrollState)
                    .height(screenHeight)
//                .background(Color.Red)
            ){
                items(activities) { activity ->
                    ActivityCard(activity)
                }
            }

    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun ActivityCard(activity:Activity, modifier:Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(.1f)
            .padding(15.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            modifier = modifier
                .fillMaxHeight()
                .fillMaxWidth(.5f),
//                .background(Color.Black),
            horizontalArrangement = Arrangement.spacedBy(15.dp)

        ) {
            Image(
                painter = painterResource(id = R.drawable.welcome_img),
                contentDescription = "User Avatar",
                contentScale = ContentScale.Crop,
                modifier = modifier
                    .clip(CircleShape)
                    .size(45.dp)
                    .background(Color.Gray)
                    .border(1.dp, Color.Black, CircleShape)
            )
            Column(
                modifier = modifier.fillMaxHeight(),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = activity.itemName,
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 18.sp
                    )
                )

                Text(
                    text = dateToText( activity.date),
                    style = TextStyle(
                        color = Color.Gray,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }

        Text(
            text = activity.score.toString(),
            style = TextStyle(
                fontSize = 20.sp,
            )
        )

    }
}

@RequiresApi(Build.VERSION_CODES.O)
private fun dateToText(date: LocalDate): String {
    val current = LocalDate.now()
    val period = Period.between(date,current)
    if (period.years > 0 || period.months > 0 || period.days > 5) {
        return date.toString()
    } else if (period.days > 0) {
        return period.days.toString() + " days ago "
    }
    return "Today"
}

@RequiresApi(Build.VERSION_CODES.O)
@Preview(showBackground = true)
@Composable
fun ActivityLogScreenPreview() {
    ActivityLogScreen()
}