package com.example.diffeqmastery.screens

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.diffeqmastery.models.Level

@Composable
fun LevelInfoScreen(levelId: Int) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState())
    ) {
        Text(
            text = "title of level id $levelId",
            modifier = Modifier.padding(vertical = 16.dp),
            fontSize = 40.sp
        )
        Text(text = "description of level id $levelId", fontSize = 24.sp)
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = "Количество практических заданий: 0",
            modifier = Modifier.padding(vertical = 16.dp),
            fontSize = 24.sp
        )
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Начать", fontSize = 24.sp)
        }
    }
}