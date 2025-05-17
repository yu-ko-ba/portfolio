package dev.yuyuyuyuyu.portfolio.ui

import androidx.compose.runtime.Composable
import com.slack.circuit.backstack.rememberSaveableBackStack
import com.slack.circuit.foundation.Circuit
import com.slack.circuit.foundation.CircuitCompositionLocals
import com.slack.circuit.foundation.NavigableCircuitContent
import com.slack.circuit.foundation.rememberCircuitNavigator
import dev.yuyuyuyuyu.portfolio.ui.appllist.AppListScreen

@Composable
fun PortfolioApp(circuit: Circuit) {
    val backStack = rememberSaveableBackStack(root = AppListScreen)
    val navigator = rememberCircuitNavigator(backStack) {}

    CircuitCompositionLocals(circuit) {
        NavigableCircuitContent(navigator, backStack)
    }
}
