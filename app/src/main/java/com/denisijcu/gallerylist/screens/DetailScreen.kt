package com.denisijcu.gallerylist.screens

import android.annotation.SuppressLint
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size

import androidx.compose.foundation.rememberScrollState

import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ElevatedCard

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity

import androidx.compose.ui.res.painterResource

import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.denisijcu.gallerylist.data.Painting
import com.denisijcu.gallerylist.data.getDummyPaintings
import com.denisijcu.gallerylist.R
import com.denisijcu.gallerylist.data.Review

@SuppressLint("UnrememberedMutableState")
@Composable
fun DetailsScreen(itemId: String?) {
    val paints: List<Painting> = getDummyPaintings()
    val item = paints.firstOrNull { it.myId == itemId?.toInt()  }

    var visibleInputForm by mutableStateOf(false)



    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        modifier = Modifier
            .size(width = 240.dp, height = 100.dp)
    ) {
        if (item != null) {

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
                    .verticalScroll(rememberScrollState())

            ) {
                Text(
                    text = item.getTitle(),
                    modifier = Modifier
                        .padding(16.dp)
                        .align(Alignment.Start),
                    textAlign = TextAlign.Center,
                )
                Image(
                    painter = painterResource(
                        id = when (itemId?.toInt()) {
                            0 -> R.drawable.p0
                            1 -> R.drawable.p1
                            2 -> R.drawable.p2
                            3 -> R.drawable.p3
                            4 -> R.drawable.p4
                            5 -> R.drawable.p5
                            6 -> R.drawable.p6
                            else -> throw IllegalArgumentException("Invalid painting ID: ${item.getId()}")
                        }
                    ),
                    contentDescription = item.getTitle()
                )
                Text("by ${item.getArtist()}")
                Text(text = item.getDescription(), modifier = Modifier.padding(16.dp), textAlign = TextAlign.Center,)

                val reviews: MutableList<Review> = item.getReview().toMutableList()

                Text("Reviews")
                for (review in reviews) {

                    if (review.id == item.myId) {
                        Text(text = "User: ${review.user}")
                        Text(text = review.content)
                    }
                }

                var user by rememberSaveable { mutableStateOf("") }
                var review by rememberSaveable { mutableStateOf("") }

                Spacer(modifier = Modifier.height(50.dp))
                Divider()



                Text("User $user", Modifier
                    .fillMaxWidth()
                    .height(20.dp))
                Text(text = review, Modifier
                    .fillMaxWidth()
                    .height(20.dp))




                if (visibleInputForm) AlertDialogExample(
                    user = user,
                    review = review,
                    onUserChange = { user = it },
                    onReviewChange = { review = it },

                    onDismissRequest = {
                        user = ""
                        review = ""
                    },
                    onConfirmation = { visibleInputForm = false },
                    dialogTitle = "Let your comment ",
                    dialogText = "Here",
                    icon = Icons.Default.Star
                )

                Button(onClick = { visibleInputForm = true }) {
                    Text("Comment")
                }
            }

        }
    }

}




