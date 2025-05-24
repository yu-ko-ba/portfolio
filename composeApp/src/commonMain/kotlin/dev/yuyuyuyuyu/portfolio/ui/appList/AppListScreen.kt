package dev.yuyuyuyuyu.portfolio.ui.appList

import com.slack.circuit.runtime.CircuitUiState
import com.slack.circuit.runtime.screen.Screen
import dev.yuyuyuyuyu.portfolio.data.models.App

data object AppListScreen : Screen {
    data class State(
        val apps: List<App>
    ) : CircuitUiState
}
