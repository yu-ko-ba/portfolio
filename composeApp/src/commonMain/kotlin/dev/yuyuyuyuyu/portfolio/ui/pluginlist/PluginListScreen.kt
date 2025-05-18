package dev.yuyuyuyuyu.portfolio.ui.pluginlist

import com.slack.circuit.runtime.CircuitUiState
import com.slack.circuit.runtime.screen.Screen
import dev.yuyuyuyuyu.portfolio.data.models.Product

data object PluginListScreen : Screen {
    data class State(
        val plugins: List<Product>,
    ) : CircuitUiState
}
