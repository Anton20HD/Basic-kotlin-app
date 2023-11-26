package com.example.app.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun AccountScreen () {
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center


    ) {

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center


        ) {


            Text(
                "Welcome!",
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.fillMaxWidth()


            )

            Spacer(modifier = Modifier.height(16.dp))


            TextField(
                value = "",
                onValueChange = {},
                label = { Text(text = "Email") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)


            )
            TextField(
                value = "",
                onValueChange = {},
                label = { Text(text = "Password") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)


            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {


                },
                colors = ButtonDefaults.buttonColors(Color.Black),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)


            ) {
                Text(text = "Log in")
            }

            Divider(
                    color = Color.Gray,
                    thickness = 2.dp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)




            )


            Text(
                "New here? Dont worry, sign up here",
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.fillMaxWidth()


            )

            Spacer(modifier = Modifier.height(16.dp))


            TextField(
                value = "",
                onValueChange = {},
                label = { Text(text = "Firstname") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)


            )
            TextField(
                value = "",
                onValueChange = {},
                label = { Text(text = "Lastname") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)


            )
            TextField(
                value = "",
                onValueChange = {},
                label = { Text(text = "Email") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)


            )
            TextField(
                value = "",
                onValueChange = {},
                label = { Text(text = "Password") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)


            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {


                },
                colors = ButtonDefaults.buttonColors(Color.Black),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)


            ) {
                Text(text = "Sign up")
            }

            Spacer(modifier = Modifier.height(16.dp))

        }
    }
}