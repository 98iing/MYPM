package navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector


data class BottomNavItem(
    val route: String,
    val label: String,
    val icon: ImageVector
)

val bottomNavItems = listOf(
    BottomNavItem("home", "홈", Icons.Default.Home),
    BottomNavItem("project_detail", "프로젝트 상세", Icons.Default.AddBox),
    BottomNavItem("settings", "설정", Icons.Default.Settings)
)
