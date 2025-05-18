package dev.yuyuyuyuyu.portfolio

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import dev.yuyuyuyuyu.portfolio.ui.PortfolioApp
import kotlinx.browser.document

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport(document.body!!) {
        PortfolioApp()
    }
}
