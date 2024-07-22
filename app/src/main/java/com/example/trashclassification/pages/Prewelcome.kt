package com.example.trashclassification.pages

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.trashclassification.R
import com.example.trashclassification.ui.theme.TrashClassificationTheme
@Composable
fun PreWelcomeScreen(modifier: Modifier = Modifier, navController: NavController, paddingValues: PaddingValues){
    Box(modifier = modifier
        .padding(paddingValues)
        .fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.welcome_bg),
            contentDescription = "Welcome background",
            contentScale = ContentScale.FillBounds,
            modifier = modifier.matchParentSize()
        )
        Column (
            modifier = modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Your partner in",
                style = TextStyle(
                    fontSize = 30.sp,
                    color = Color.White
                ),
                modifier = modifier.offset(x = 30.dp)
            )
            Text(
                text = "Sustainable \nLiving!",
                style = TextStyle(
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                ),
                modifier = modifier.offset(x = 30.dp)
            )
            Spacer(modifier = modifier.height(20.dp))
            Button(
                onClick = { navController.navigate("welcome") },
                shape = RoundedCornerShape(15.dp),
                modifier = modifier
                    .align(Alignment.CenterHorizontally)
                    .width(330.dp)
                    .height(55.dp),
                colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primary)
            ){
                Text(text = "Explore", style = TextStyle(fontSize = 18.sp))
            }
            Spacer(modifier = modifier.height(30.dp))
        }
    }
}

//@Preview(
//    showBackground = true,
//    uiMode = Configuration.UI_MODE_NIGHT_NO,
//    name = "DefaultPreviewLight"
//)
//@Preview(
//    showBackground = true,
//    uiMode = Configuration.UI_MODE_NIGHT_NO,
//    name = "DefaultPreviewDark"
//)
//@Composable
//fun WelcomePreview() {
//    val navController = rememberNavController()
//    TrashClassificationTheme {
//        WelcomeScreen(modifier = Modifier, navController = navController, )
//    }
//}
