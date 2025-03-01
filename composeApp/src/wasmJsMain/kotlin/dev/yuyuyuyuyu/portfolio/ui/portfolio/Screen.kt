package dev.yuyuyuyuyu.portfolio.ui.portfolio

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Apps
import androidx.compose.material.icons.filled.Book
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route: String, val icon: ImageVector) {
    object Apps : Screen(route = "アプリ", icon = Icons.Default.Apps)
    object Libraries : Screen(route = "ライブラリ", icon = Icons.Default.Book)
}
