package navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import screens.HomeScreen
import screens.ProjectDetailScreen
import screens.SettingsScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen()
        }
        composable("project_detail") {
            ProjectDetailScreen()
        }
        composable("settings") {
            SettingsScreen()
        }
    }
}