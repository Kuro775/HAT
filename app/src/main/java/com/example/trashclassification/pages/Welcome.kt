package com.example.trashclassification.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.trashclassification.R
import com.example.trashclassification.ui.theme.TrashClassificationTheme

@Composable
fun WelcomeScreen(modifier: Modifier = Modifier, navController: NavController) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = R.drawable.welcome_img),
            contentDescription = "Welcome graphic",
            contentScale = ContentScale.Fit,
            modifier = modifier.size(500.dp)
        )

        Spacer(modifier = modifier.height(30.dp))

        Text(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
            style = TextStyle(
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                color = Color.Gray
            ),
            modifier = modifier.widthIn(0.dp,300.dp)
            )

        Spacer(modifier = modifier.height(30.dp))

        Button(
            onClick = { navController.navigate("signup") },
            modifier = modifier
                .width(180.dp),
            colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primaryContainer)
        ) {
            Text(
                text = "Log In",
                style = TextStyle(fontSize = 18.sp)
            )
        }
        Button(
            onClick = { navController.navigate("signup") },
            modifier = modifier
                .width(180.dp),
            colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.secondary)
        ) {
            Text(
                text = "Sign Up",
                style = TextStyle(fontSize = 18.sp, color = MaterialTheme.colorScheme.primary)
            )
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun PreviewWelcome(){
//    TrashClassificationTheme {
//        WelcomeScreen()
//    }
//}