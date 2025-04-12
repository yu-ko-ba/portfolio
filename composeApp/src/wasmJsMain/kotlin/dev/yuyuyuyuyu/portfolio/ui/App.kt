package dev.yuyuyuyuyu.portfolio.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.OpenInNew
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import dev.yuyuyuyuyu.createtypography.createTypographyFrom
import dev.yuyuyuyuyu.portfolio.ui.opensourcelicenses.screens.OpenSourceLicensesScreen
import dev.yuyuyuyuyu.portfolio.ui.portfolio.screens.PortfolioScreen
import dev.yuyuyuyuyu.portfolio.ui.theme.darkScheme
import dev.yuyuyuyuyu.portfolio.ui.theme.lightScheme
import dev.yuyuyuyuyu.simpletopappbar.SimpleTopAppBar
import org.jetbrains.compose.resources.Font
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.Yomogi_Regular

@Composable
fun App(
    colorScheme: ColorScheme = if (isSystemInDarkTheme()) darkScheme else lightScheme,
    navController: NavHostController = rememberNavController(),
) {
    MaterialTheme(
        colorScheme = colorScheme,
        typography = createTypographyFrom(fontFamily = FontFamily(Font(Res.font.Yomogi_Regular))),
    ) {
        val backStackEntry by navController.currentBackStackEntryAsState()
        val currentScreen = NavigateDestination.valueOf(
            value = backStackEntry?.destination?.route ?: NavigateDestination.Portfolio.name,
        )

        val uriHandler = LocalUriHandler.current

        Scaffold(
            topBar = {
                SimpleTopAppBar(
                    title = "ポートフォリオ",
                    navigateBackIsPossible = navController.previousBackStackEntry != null,
                    sourceCodeButtonLabel = {
                        Row {
                            Icon(Icons.AutoMirrored.Default.OpenInNew, "open in new tab")
                            Spacer(Modifier.width(1.dp))
                            Text("ソースコード")
                        }
                    },
                    onNavigateBackButtonClick = { navController.navigateUp() },
                    onOpenSourceLicensesButtonClick = {
                        if (currentScreen != NavigateDestination.OpenSourceLicenses) {
                            navController.navigate(NavigateDestination.OpenSourceLicenses.name)
                        }
                    },
                    onSourceCodeButtonClick = {
                        uriHandler.openUri("https://github.com/yu-ko-ba/portfolio")
                    },
                )
            },
        ) { innerPadding ->
            NavHost(
                navController = navController,
                startDestination = NavigateDestination.Portfolio.name,
                modifier = Modifier.padding(innerPadding),
            ) {
                composable(route = NavigateDestination.Portfolio.name) {
                    PortfolioScreen()
                }

                composable(route = NavigateDestination.OpenSourceLicenses.name) {
                    OpenSourceLicensesScreen()
                }
            }
        }
    }
}
