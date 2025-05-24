package dev.yuyuyuyuyu.portfolio.ui.appList

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.produceState
import com.slack.circuit.runtime.presenter.Presenter
import dev.yuyuyuyuyu.portfolio.data.repositories.AppsRepository

class AppListPresenter(private val appsRepository: AppsRepository) : Presenter<AppListScreen.State> {
    @Composable
    override fun present(): AppListScreen.State {
        val apps by produceState(initialValue = emptyList()) {
            value = appsRepository.getApps()
        }

        return AppListScreen.State(apps)
    }
}
