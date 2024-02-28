package com.example.diffeqmastery.screens

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.diffeqmastery.data.AppRoutes
import com.example.diffeqmastery.elements.NavBar

@Composable
fun DiffEqMasteryApp() {
    val navController = rememberNavController()
    Scaffold(bottomBar = { NavBar() }) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            Log.d("amanibwasp", innerPadding.toString())
            NavHost(
                navController = navController,
                startDestination = AppRoutes.LevelsScreen.name,
                modifier = Modifier.padding(16.dp)
            ) {
                composable(route = AppRoutes.AchievementsScreen.name) {
                    AchievementsScreen()
                }
                composable(route = AppRoutes.LevelsScreen.name) {
                    LevelsScreen(navController)
                }
                composable(route = AppRoutes.ProfileScreen.name) {
                    ProfileScreen()
                }
                composable(
                    route = AppRoutes.LevelInfoScreen.name + "/{levelId}", arguments = listOf(
                        navArgument("levelId") {type = NavType.IntType}
                    )
                ) {backStackEntry  ->
                    LevelInfoScreen(backStackEntry.arguments!!.getInt("levelId"))
                }
            }
        }
    }
}