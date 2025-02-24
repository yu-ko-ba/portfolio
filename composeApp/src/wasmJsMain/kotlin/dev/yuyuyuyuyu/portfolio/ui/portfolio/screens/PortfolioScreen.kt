package dev.yuyuyuyuyu.portfolio.ui.portfolio.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Apps
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.outlined.Apps
import androidx.compose.material.icons.outlined.Book
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.yuyuyuyuyu.portfolio.ui.components.BottomNavigationBar
import dev.yuyuyuyuyu.portfolio.ui.components.types.Destination

@Composable
fun PortfolioScreen(
    modifier: Modifier = Modifier,
) {
    val destinations = listOf(
        Destination(
            label = "アプリ",
            selectedIcon = Icons.Filled.Apps,
            unselectedIcon = Icons.Outlined.Apps,
        ),
        Destination(
            label = "ライブラリ",
            selectedIcon = Icons.Filled.Book,
            unselectedIcon = Icons.Outlined.Book,
        ),
    )

    Scaffold(
        bottomBar = {
            BottomNavigationBar(destinations = destinations)
        }
    ) { innerPadding ->
        TODO()
    }
}
