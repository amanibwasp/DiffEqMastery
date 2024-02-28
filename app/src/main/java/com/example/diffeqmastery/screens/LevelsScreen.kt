package com.example.diffeqmastery.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.diffeqmastery.data.AppRoutes
import com.example.diffeqmastery.elements.LevelSquare

@Composable
fun LevelsScreen(navController: NavController) {
    LazyVerticalGrid(
        modifier = Modifier.fillMaxSize(),
        columns = GridCells.Fixed(2),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(ArrayList<Int>().apply { for (i in 1..28) this.add(i) }) { item ->
            LevelSquare(
                onClick = { navController.navigate(AppRoutes.LevelInfoScreen.name + "/$item") },
                title = item.toString()
            )
        }
    }
}