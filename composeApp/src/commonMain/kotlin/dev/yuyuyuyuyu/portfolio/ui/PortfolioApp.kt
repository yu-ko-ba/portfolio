package dev.yuyuyuyuyu.portfolio.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.slack.circuit.backstack.rememberSaveableBackStack
import com.slack.circuit.foundation.CircuitCompositionLocals
import com.slack.circuit.foundation.NavigableCircuitContent
import com.slack.circuit.foundation.rememberCircuitNavigator
import dev.yuyuyuyuyu.portfolio.di.portfolioAppModule
import dev.yuyuyuyuyu.portfolio.ui.appllist.AppListScreen
import dev.yuyuyuyuyu.portfolio.ui.opensourcelicenselist.OpenSourceLicenseListScreen
import dev.yuyuyuyuyu.portfolio.ui.theme.darkScheme
import dev.yuyuyuyuyu.portfolio.ui.theme.lightScheme
import dev.yuyuyuyuyu.simpletopappbar.SimpleTopAppBar
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
        MaterialTheme(
            colorScheme = if (isSystemInDarkTheme()) darkScheme else lightScheme,
        ) {
            Scaffold(
                topBar = {
                    SimpleTopAppBar(
                        title = "portfolio",
                        navigateBackIsPossible = backStack.size > 1,
                        onNavigateBackButtonClick = { navigator.pop() },
                        onOpenSourceLicensesButtonClick = {
                            navigator.goTo(OpenSourceLicenseListScreen)
                        },
                    )
                },
            ) { innerPadding ->
                CircuitCompositionLocals(koinInject()) {
                    NavigableCircuitContent(
                        navigator = navigator,
                        backStack = backStack,
                        modifier = Modifier.padding(innerPadding),
                    )
                }
            }
        }
    }
}
