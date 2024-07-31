package com.example.trashclassification.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.sharp.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun SettingScreen(modifier:Modifier = Modifier, navController: NavController) {
    val scrollState = rememberScrollState()
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .fillMaxHeight(.05f),
        ) {
            Text(
                text = "Settings",
                modifier = modifier
                    .align(Alignment.Center)
                    .padding(5.dp),
                style = TextStyle()
            )

            Text(
                text = "DONE",
                modifier = modifier
                    .align(Alignment.CenterEnd)
                    .padding(5.dp)
                    .clickable { navController.popBackStack() },
                style = TextStyle(color = Color.Blue)
            )
        }

        HorizontalDivider()

        Column(
            modifier = modifier
                .fillMaxWidth(.9f)
                .fillMaxHeight()
                .verticalScroll(scrollState),
            verticalArrangement = Arrangement.spacedBy(5.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = modifier)

            Text(
                text = "Account",
                modifier = modifier
                    .align(Alignment.Start),
                style = TextStyle()
            )

            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color.LightGray),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Subscription",
                        modifier = modifier
                            .padding(10.dp),
                        style = TextStyle()
                    )

                    Icon(
                        Icons.AutoMirrored.Sharp.ArrowForward,
                        contentDescription = "Arrow",
                    )
                }

                HorizontalDivider()

                Row(
                    modifier = modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Profile",
                        modifier = modifier
                            .padding(10.dp),
                        style = TextStyle()
                    )

                    Icon(
                        Icons.AutoMirrored.Sharp.ArrowForward,
                        contentDescription = "Arrow"
                    )
                }

                HorizontalDivider()

                Row(
                    modifier = modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Notifications",
                        modifier = modifier
                            .padding(10.dp),
                        style = TextStyle()
                    )

                    Icon(
                        Icons.AutoMirrored.Sharp.ArrowForward,
                        contentDescription = "Arrow"
                    )
                }

                HorizontalDivider()

                Row(
                    modifier = modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Courses",
                        modifier = modifier
                            .padding(10.dp),
                        style = TextStyle()
                    )

                    Icon(
                        Icons.AutoMirrored.Sharp.ArrowForward,
                        contentDescription = "Arrow"
                    )
                }

                HorizontalDivider()

                Row(
                    modifier = modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Duolingo for Schools",
                        modifier = modifier
                            .padding(10.dp),
                        style = TextStyle()
                    )

                    Icon(
                        Icons.AutoMirrored.Sharp.ArrowForward,
                        contentDescription = "Arrow"
                    )
                }

                HorizontalDivider()

                Row(
                    modifier = modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Social accounts",
                        modifier = modifier
                            .padding(10.dp),
                        style = TextStyle()
                    )

                    Icon(
                        Icons.AutoMirrored.Sharp.ArrowForward,
                        contentDescription = "Arrow"
                    )
                }

                HorizontalDivider()

                Row(
                    modifier = modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Privacy Settings",
                        modifier = modifier
                            .padding(10.dp),
                        style = TextStyle()
                    )

                    Icon(
                        Icons.AutoMirrored.Sharp.ArrowForward,
                        contentDescription = "Arrow"
                    )
                }
            }

            Spacer(modifier = modifier)

            Text(
                text = "Subscription",
                modifier = modifier
                    .align(Alignment.Start),
                style = TextStyle()
            )

            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color.LightGray),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Choose a plan",
                        modifier = modifier
                            .padding(10.dp),
                        style = TextStyle()
                    )

                    Icon(
                        Icons.AutoMirrored.Sharp.ArrowForward,
                        contentDescription = "Arrow"
                    )
                }
            }

            Button(
                onClick = { /*TODO*/ },
                modifier = modifier.fillMaxWidth(),
                shape = RoundedCornerShape(10.dp),
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 4.dp
                ),
                colors = ButtonDefaults.buttonColors(Color.LightGray)
            ) {
                Text(
                    text = "RESTORE SUBSCRIPTION",
                    style = TextStyle(
                        color = Color.Blue
                    )
                )
            }

            Spacer(modifier = modifier)

            Text(
                text = "Support",
                modifier = modifier
                    .align(Alignment.Start),
                style = TextStyle()
            )

            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color.LightGray),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Help Center",
                        modifier = modifier
                            .padding(10.dp),
                        style = TextStyle()
                    )

                    Icon(
                        Icons.AutoMirrored.Sharp.ArrowForward,
                        contentDescription = "Arrow"
                    )
                }

                HorizontalDivider()

                Row(
                    modifier = modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Feedback",
                        modifier = modifier
                            .padding(10.dp),
                        style = TextStyle()
                    )

                    Icon(
                        Icons.AutoMirrored.Sharp.ArrowForward,
                        contentDescription = "Arrow"
                    )
                }
            }

            Button(
                onClick = { /*TODO*/ },
                modifier = modifier.fillMaxWidth(),
                shape = RoundedCornerShape(10.dp),
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 4.dp
                ),
                colors = ButtonDefaults.buttonColors(Color.LightGray)
            ) {
                Text(
                    text = "SIGN OUT",
                    style = TextStyle(
                        color = Color.Blue
                    )
                )
            }

            Spacer(modifier = modifier)

            Text(
                text = "TERMS",
                modifier = modifier.align(Alignment.Start),
                style = TextStyle(color = Color.Blue)
            )

            Spacer(modifier = modifier)

            Text(
                text = "PRIVACY POLICY",
                modifier = modifier.align(Alignment.Start),
                style = TextStyle(color = Color.Blue)
            )

            Spacer(modifier = modifier)

            Text(
                text = "ACKNOWLEDGEMENTS",
                modifier = modifier.align(Alignment.Start),
                style = TextStyle(color = Color.Blue)
            )
        }
    }
}

@Preview(showBackground = true, widthDp = 300, heightDp = 700)
@Composable
fun SettingScreenPreview (){
    val navController = rememberNavController()
    SettingScreen(navController = navController)
}