package dev.yuyuyuyuyu.portfolio.ui.portfolio

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

enum class Screen(val route: String, val icon: ImageVector) {
    Apps(route = "アプリ", icon = Icons.Default.Apps),
    Libraries(route = "ライブラリ", icon = Icons.Default.Book),
    Pluigins(route = "プラグイン", icon = Icons.Default.Bolt),
    CliTools(route = "CLIツール", icon = Icons.Default.Terminal),
}
