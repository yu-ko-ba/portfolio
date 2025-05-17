package dev.yuyuyuyuyu.portfolio

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.slack.circuit.foundation.Circuit
import dev.yuyuyuyuyu.portfolio.ui.PortfolioApp
import dev.yuyuyuyuyu.portfolio.ui.appllist.AppList
import dev.yuyuyuyuyu.portfolio.ui.appllist.AppListPresenter
import dev.yuyuyuyuyu.portfolio.ui.appllist.AppListScreen

fun main() {
    val circuit = Circuit.Builder()
        .addPresenter<AppListScreen, AppListScreen.State>(AppListPresenter())
        .addUi<AppListScreen, AppListScreen.State> { state, modifier -> AppList(state, modifier) }
        .build()

    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "portfolio",
        ) {
            PortfolioApp(circuit)
        }
    }
}
