package com.example.details

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.details.ui.theme.DetailsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DetailsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}

@Preview
@Composable
fun Feeds(){
//        LazyVerticalGrid(cells = GridCells.Fixed(2)){
//            items((0..10).toList()) {
//                DetailedItem()
//            }
//        }
//    LazyHorizontalGrid(rows = GridCells.Fixed(2)){
//        items(0) {
//            DetailedItem()
//        }
//    }

    LazyColumn{
//        = Arrangement.spacedBy(8.dp)
        items((0..10).toList()) {
            DetailedItem()
        }
    }
}


@Preview
@Composable
fun DetailedItem(){
    Card(modifier = Modifier
        .fillMaxWidth()) {
        Column(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier= Modifier.fillMaxSize()
        ){
            Image(  painter = painterResource(id = R.drawable.gamer),
                        contentDescription = "My Image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    contentScale = ContentScale.Crop,

            )
        }
        Text(text = "My Image")
    }
}