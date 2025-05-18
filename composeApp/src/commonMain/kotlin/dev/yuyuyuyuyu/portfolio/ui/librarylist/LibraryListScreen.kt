package dev.yuyuyuyuyu.portfolio.ui.librarylist

import com.slack.circuit.runtime.CircuitUiState
import com.slack.circuit.runtime.screen.Screen
import dev.yuyuyuyuyu.portfolio.data.models.Product

data object LibraryListScreen : Screen {
    data class State(
        val libraries: List<Product>,
    ) : CircuitUiState
}
