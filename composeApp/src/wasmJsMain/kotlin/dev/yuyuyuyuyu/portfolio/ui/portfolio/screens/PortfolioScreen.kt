package dev.yuyuyuyuyu.portfolio.ui.portfolio.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import dev.yuyuyuyuyu.portfolio.ui.portfolio.Screen

@Composable
fun PortfolioScreen(
    modifier: Modifier = Modifier,
) {
    val navigationItems = Screen.entries.toList()

    var currentRoute: Screen by rememberSaveable { mutableStateOf(Screen.Apps) }

    Scaffold(
        bottomBar = {
            NavigationBar {
                navigationItems.forEach { screen ->
                    NavigationBarItem(
                        icon = { Icon(imageVector = screen.icon, contentDescription = screen.route) },
                        label = { Text(screen.route) },
                        selected = currentRoute == screen,
                        onClick = {
                            currentRoute = screen
                        },
                    )
                }
            }
        }
    ) { innerPadding ->
        Box(
            modifier = modifier.padding(innerPadding),
        ) {
            when (currentRoute) {
                Screen.Apps -> AppsScreen()
                Screen.Libraries -> LibrariesScreen()
                Screen.Pluigins -> PluginsScreen()
                Screen.CliTools -> CliToolsScreen()
            }
        }
    }
}
