package com.denisijcu.gallerylist.screens


import android.annotation.SuppressLint

import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items

import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.denisijcu.gallerylist.R
import com.denisijcu.gallerylist.data.Painting
import com.denisijcu.gallerylist.data.getDummyPaintings



@Composable
fun GalleryScreen(navController: NavHostController) {
    val paints: List<Painting> = getDummyPaintings()

    LazyColumn {
        items(paints) { painting ->
            ListOfPainting(navController,painting)
        }
    }
}

@SuppressLint("UnrememberedMutableState")
@Composable
fun ListOfPainting(navController: NavHostController,painting: Painting) {

    Column(

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)) {


        Text(text = painting.getTitle())

        Image(
            painter = painterResource(
                id = when (painting.getId()) {
                    0 -> R.drawable.p0
                    1 -> R.drawable.p1
                    2 -> R.drawable.p2
                    3 -> R.drawable.p3
                    4 -> R.drawable.p4
                    5 -> R.drawable.p5
                    6 -> R.drawable.p6
                    else -> throw IllegalArgumentException("Invalid painting ID: ${painting.getId()}")
                }
            ),
            contentDescription = null
        )
        
        Text(text = "by: ${painting.getArtist()}")
        val itemId = painting.getId()

        Button(
        onClick = { navController.navigate("details/$itemId") }) {
            Text(text = "Read More")
        }

        Spacer(modifier = Modifier.height(50.dp))
        Divider()


    }


}




