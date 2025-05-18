package dev.yuyuyuyuyu.portfolio.ui.portfolio

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.slack.circuit.backstack.rememberSaveableBackStack
import com.slack.circuit.foundation.NavigableCircuitContent
import com.slack.circuit.foundation.rememberCircuitNavigator
import dev.yuyuyuyuyu.portfolio.ui.appllist.AppListScreen
import dev.yuyuyuyuyu.portfolio.ui.portfolio.models.TabItems

@Composable
fun Portfolio(modifier: Modifier = Modifier) {
    val backStack = rememberSaveableBackStack(root = AppListScreen)
    val navigator = rememberCircuitNavigator(backStack) {}

    Scaffold(
        modifier = modifier,
        bottomBar = {
            NavigationBar {
                TabItems.entries.forEach { item ->
                    NavigationBarItem(
                        selected = item.screen == navigator.peek(),
                        onClick = { navigator.resetRoot(item.screen) },
                        icon = { Icon(item.icon, null) },
                        label = { Text(item.label) },
                    )
                }
            }
        }
    ) { innerPadding ->
        NavigableCircuitContent(
            navigator = navigator,
            backStack = backStack,
            modifier = Modifier.padding(innerPadding),
        )
    }
}
