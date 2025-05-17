package dev.yuyuyuyuyu.portfolio

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import dev.yuyuyuyuyu.portfolio.ui.PortfolioApp

fun main() {
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "portfolio",
        ) {
            PortfolioApp()
        }
    }
}
