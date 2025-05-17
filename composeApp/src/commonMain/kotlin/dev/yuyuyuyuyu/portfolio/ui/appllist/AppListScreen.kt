package dev.yuyuyuyuyu.portfolio.ui.appllist

import com.slack.circuit.runtime.CircuitUiState
import com.slack.circuit.runtime.screen.Screen

data object AppListScreen : Screen {
    data class State(
        val apps: List<String>
    ) : CircuitUiState
}
