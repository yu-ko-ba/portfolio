package dev.yuyuyuyuyu.portfolio.ui.portfolio

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route: String, val icon: ImageVector) {
    object Apps : Screen(route = "アプリ", icon = Icons.Default.Apps)
    object Libraries : Screen(route = "ライブラリ", icon = Icons.Default.Book)
    object Pluigins : Screen(route = "プラグイン", icon = Icons.Default.Bolt)
    object CliTools : Screen(route = "CLIツール", icon = Icons.Default.Terminal)
}
