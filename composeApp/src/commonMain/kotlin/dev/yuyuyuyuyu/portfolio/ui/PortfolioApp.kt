package dev.yuyuyuyuyu.portfolio.ui

import androidx.compose.runtime.Composable
import com.slack.circuit.backstack.rememberSaveableBackStack
import com.slack.circuit.foundation.CircuitCompositionLocals
import com.slack.circuit.foundation.NavigableCircuitContent
import com.slack.circuit.foundation.rememberCircuitNavigator
import dev.yuyuyuyuyu.portfolio.di.portfolioAppModule
import dev.yuyuyuyuyu.portfolio.ui.appllist.AppListScreen
import org.koin.compose.KoinApplication
import org.koin.compose.koinInject

@Composable
fun PortfolioApp() {
    val backStack = rememberSaveableBackStack(root = AppListScreen)
    val navigator = rememberCircuitNavigator(backStack) {}

    KoinApplication(application = {
        printLogger()
        modules(portfolioAppModule)
    }) {
        CircuitCompositionLocals(koinInject()) {
            NavigableCircuitContent(navigator, backStack)
        }
    }
}
