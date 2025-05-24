package dev.yuyuyuyuyu.portfolio.ui.portfolio.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Apps
import androidx.compose.material.icons.filled.Bolt
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.Terminal
import androidx.compose.ui.graphics.vector.ImageVector
import com.slack.circuit.runtime.screen.Screen
import dev.yuyuyuyuyu.portfolio.ui.appList.AppListScreen
import dev.yuyuyuyuyu.portfolio.ui.cliToolList.CliToolListScreen
import dev.yuyuyuyuyu.portfolio.ui.libraryList.LibraryListScreen
import dev.yuyuyuyuyu.portfolio.ui.pluginList.PluginListScreen

enum class TabItems(
    val screen: Screen,
    val label: String,
    val icon: ImageVector,
) {
    App(screen = AppListScreen, label = "アプリ", icon = Icons.Default.Apps),
    Library(screen = LibraryListScreen, label = "ライブラリ", icon = Icons.Default.Book),
    Plugin(screen = PluginListScreen, label = "プラグイン", icon = Icons.Default.Bolt),
    CliTools(screen = CliToolListScreen, label = "CLIツール", Icons.Default.Terminal),
}
