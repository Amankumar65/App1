package com.example.app1

import CustomItem
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.app1.Repository.AllDetails
import com.example.app1.ui.theme.App1Theme
import com.example.app1.ui.theme.TransparentGrey

@Composable
fun ActivityScreen(){
    App1Theme() {
        Surface(
            color = MaterialTheme.colors.background
        ) {
            Column( modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 10.dp)
            ) {
                Text(
                    text = "Activity",
                    fontSize = MaterialTheme.typography.h3.fontSize,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Serif,
                    modifier = Modifier.padding(vertical = 8.dp)
                )
                ActivityContent()
            }
        }
    }
}

@Composable
fun ActivityContent(){

    val repository = AllDetails()
    val getData = repository.getAllDetails()
    LazyColumn() {
        itemsIndexed(items = getData){
            index, item ->
            if((index)%3==0){
                val headingIndex = index/3+1
                Text(text = "Heading $headingIndex".toUpperCase(),
                fontSize = MaterialTheme.typography.h5.fontSize,
                color = TransparentGrey,
                modifier = Modifier.padding(horizontal = 18.dp))
            }

                CustomItem(data = item)
        }
    }
}


@Preview
@Composable
fun screenPreview(){
    ActivityScreen()
}