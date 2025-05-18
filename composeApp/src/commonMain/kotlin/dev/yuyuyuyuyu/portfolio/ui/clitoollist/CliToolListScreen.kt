package dev.yuyuyuyuyu.portfolio.ui.clitoollist

import com.slack.circuit.runtime.CircuitUiState
import com.slack.circuit.runtime.screen.Screen
import dev.yuyuyuyuyu.portfolio.data.models.Product

data object CliToolListScreen : Screen {
    data class State(
        val cliTools: List<Product>,
    ) : CircuitUiState
}
