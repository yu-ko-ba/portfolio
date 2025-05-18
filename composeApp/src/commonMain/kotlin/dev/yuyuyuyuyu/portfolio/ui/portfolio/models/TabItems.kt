package dev.yuyuyuyuyu.portfolio.ui.portfolio.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Apps
import androidx.compose.material.icons.filled.Book
import androidx.compose.ui.graphics.vector.ImageVector
import com.slack.circuit.runtime.screen.Screen
import dev.yuyuyuyuyu.portfolio.ui.appllist.AppListScreen
import dev.yuyuyuyuyu.portfolio.ui.librarylist.LibraryListScreen

enum class TabItems(
    val screen: Screen,
    val label: String,
    val icon: ImageVector,
) {
    App(screen = AppListScreen, label = "アプリ", icon = Icons.Default.Apps),
    Library(screen = LibraryListScreen, label = "ライブラリ", icon = Icons.Default.Book),
}
