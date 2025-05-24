package dev.yuyuyuyuyu.portfolio.ui.pluginList

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.produceState
import com.slack.circuit.runtime.presenter.Presenter
import dev.yuyuyuyuyu.portfolio.data.repositories.PluginsRepository

class PluginListPresenter(private val pluginsRepository: PluginsRepository) : Presenter<PluginListScreen.State> {
    @Composable
    override fun present(): PluginListScreen.State {
        val plugins by produceState(initialValue = emptyList()) {
            value = pluginsRepository.getPlugins()
        }

        return PluginListScreen.State(plugins)
    }
}
