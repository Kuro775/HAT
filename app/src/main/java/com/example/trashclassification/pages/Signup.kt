package com.example.trashclassification.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Warning
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.trashclassification.ui.theme.TrashClassificationTheme

@Composable
fun SignupScreen(modifier: Modifier = Modifier, navController: NavController, paddingValues: PaddingValues) {
    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    var confirmPassword by remember {
        mutableStateOf("")
    }

    var rememberMe by remember {
        mutableStateOf(false)
    }

    Box(
        modifier.padding(paddingValues).fillMaxSize()
    ){
        Text(
            text = "Create an account",
            modifier = modifier
                .align(Alignment.TopStart)
                .padding(5.dp),
            style = TextStyle(
                fontSize = 30.sp,
            )
        )

        Column (
            modifier = modifier
                .fillMaxHeight()
                .fillMaxWidth(.85f)
                .align(Alignment.Center),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Text(text = "Email Address",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = modifier.align(Alignment.Start))


            OutlinedTextField(
                value = email,
                onValueChange = {
                email = it
            }, label = {
                Text(text = "Email address")
            }, visualTransformation = PasswordVisualTransformation(),
                modifier = modifier.fillMaxWidth(),
                shape = RoundedCornerShape(15.dp))

            Spacer(modifier = modifier.height(15.dp))

            Text(text = "Password",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = modifier.align(Alignment.Start))

            OutlinedTextField(value = password, onValueChange = {
                password = it
            }, label = {
                Text(text = "Password")
            }, visualTransformation = PasswordVisualTransformation(),
                modifier = modifier.fillMaxWidth(),
                shape = RoundedCornerShape(15.dp))

            Spacer(modifier = modifier.height(15.dp))

            Text(text = "Confirm password",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = modifier.align(Alignment.Start))

            OutlinedTextField(value = confirmPassword, onValueChange = {
                confirmPassword = it
            }, label = {
                Text(text = "Confirm Password")
            }, visualTransformation = PasswordVisualTransformation(),
                modifier = modifier.fillMaxWidth(),
                shape = RoundedCornerShape(15.dp))

            Spacer(modifier = modifier.height(5.dp))

            Row (
                modifier = modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){
                Checkbox(
                    checked = rememberMe,
                    onCheckedChange = {rememberMe = it},
                )
                Text(text = "Remember Me")

                Spacer(Modifier.weight(1f))

                Text(text = "Forgot Password", style = TextStyle(color = MaterialTheme.colorScheme.primary))
            }

            Spacer(modifier = modifier.height(5.dp))

            Button(onClick = { /*TODO*/ },
                modifier = modifier
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primary)
            ) {
                Text(
                    text = "Sign Up",
                    style = TextStyle(fontSize = 18.sp)
                )
            }

            Spacer(modifier = modifier.height(5.dp))

            Text(text = "Or With")

            Spacer(modifier = modifier.height(5.dp))

            Button(onClick = { /*TODO*/ },
                modifier = modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primary)
            ) {
                Icon(Icons.Rounded.Warning, contentDescription = "Google")

                Spacer(modifier.width(10.dp))

                Text(
                    text = "Sign Up",
                    style = TextStyle(fontSize = 18.sp)
                )
            }


        }
        Row (
            modifier = modifier
                .align(Alignment.BottomCenter)
                .height(50.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(
                text = "Already have an account?",
                style = TextStyle(
                    fontSize = 12.sp,
                    color = Color.Gray
                )
            )

            Spacer(modifier = modifier.width(40.dp))

            Text(
                text = "Login",
                style = TextStyle(fontSize = 16.sp),
                modifier = modifier.clickable { navController.navigate("login") }
            )
        }
    }
}

//@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
//@Composable
//fun SignupPreview(){
//    TrashClassificationTheme {
//        SignupScreen()
//    }
//}