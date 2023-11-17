package com.example.app

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app.ui.theme.AppTheme
import kotlinx.coroutines.launch
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val painter =  painterResource(id = R.drawable.black_rashguard)
            val description =  "Rashguard"
            val title =  "Black Rashguard"

            val snackbarHostState = remember { SnackbarHostState() }
            val scope = rememberCoroutineScope()


                Scaffold(
                    snackbarHost = { SnackbarHost(snackbarHostState) },
                    content = {

            CartSection()

            Column(modifier = Modifier


                    .fillMaxWidth()


                    .padding(16.dp)) {


                ImageCard(
                        painter = painter,
                        contentDescription = description ,
                        title = title,
                        modifier = Modifier.padding(top = 70.dp),
                        onAddToCartClicked = {
                                scope.launch {

                                    snackbarHostState.showSnackbar(

                                        message = "The rashguard have been added to the cart",
                                        actionLabel = "Undo"

                                    )

                                }


                        }


                )
                
                Spacer(modifier = Modifier.height(50.dp))
                SubscribeBox(
                    onSubscribeclicked = {
                        scope.launch { snackbarHostState.showSnackbar(

                            message = "Success!"
                        ) }



                    }




                )

            }




        }

                )



        }
    }
}

@Composable
fun CartSection() {

val cartPainter = painterResource(id = R.drawable.cart)
val cartDescription = "Shopping cart"
val cartTitle = "Your Cart"

        Box(modifier = Modifier

            .fillMaxSize()
            .padding(16.dp),
            contentAlignment = Alignment.TopEnd



        ) {

            Image(painter = cartPainter,
                contentDescription =  cartDescription,
                modifier = Modifier
                   // .fillMaxWidth()
                    .size(45.dp)



            )

        }



    }







@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier,
    onAddToCartClicked: () ->  Unit
) {


    Card(


        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        //elevation = 5.dp
    ) {
        Box(modifier = Modifier.height(200.dp)

        ) {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(200.dp)
                    .align(Alignment.Center)
            )
            Box(
                modifier = Modifier


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
            )


            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart


            ) {
                Text(
                    title,
                    style = androidx.compose.ui.text.TextStyle(
                        color = Color.White,
                        fontSize = 16.sp
                    )
                )
            }


        }





        Button(
            onClick = {

                      onAddToCartClicked()

            },
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)



        ) {
            Text(text = "Add to cart")
        }

        Spacer(modifier = Modifier.height(16.dp))






        }



    }
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SubscribeBox(onSubscribeclicked: () -> Unit) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = Color.Gray,
                shape = RoundedCornerShape(15.dp)

            )

            .padding(16.dp)

    ) {

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center


        ) {


            Text(
                "Subscribe to get updates of new products!",
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
                    .padding(top = 40.dp)


            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {

                        onSubscribeclicked()
                },
                colors = ButtonDefaults.buttonColors(Color.Black),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)


            ) {
                Text(text = "Submit")
            }




        }


    }

}
//        Snackbar {
//
//            Text(text = "Subscribe to get updates")
//        }






