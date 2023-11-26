package com.example.app

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

class SampleViewModel {

    //var backgroundColor by mutableStateOf(Color.White)
    var currentImageId by mutableStateOf(R.drawable.black_rashguard)
fun changeBackgroundColor() {
    //backgroundColor = Color.Red




}
    fun changeImage() {

        currentImageId = if(currentImageId == R.drawable.black_rashguard) {
                R.drawable.white_rashguard

        } else {

            R.drawable.black_rashguard
        }

    }

}
