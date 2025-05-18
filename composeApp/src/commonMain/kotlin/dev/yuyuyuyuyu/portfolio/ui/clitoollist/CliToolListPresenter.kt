package dev.yuyuyuyuyu.portfolio.ui.clitoollist

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.produceState
import com.slack.circuit.runtime.presenter.Presenter
import dev.yuyuyuyuyu.portfolio.data.repositories.CliToolsRepository

class CliToolListPresenter(private val cliToolsRepository: CliToolsRepository) : Presenter<CliToolListScreen.State> {
    @Composable
    override fun present(): CliToolListScreen.State {
        val cliTools by produceState(initialValue = emptyList()) {
            value = cliToolsRepository.getCliTools()
        }

        return CliToolListScreen.State(cliTools)
    }
}
