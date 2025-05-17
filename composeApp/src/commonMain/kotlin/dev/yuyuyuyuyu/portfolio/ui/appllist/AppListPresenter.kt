package dev.yuyuyuyuyu.portfolio.ui.appllist

import androidx.compose.runtime.Composable
import com.slack.circuit.runtime.presenter.Presenter
import dev.yuyuyuyuyu.portfolio.data.repositories.AppsRepository

class AppListPresenter(private val appsRepository: AppsRepository) : Presenter<AppListScreen.State> {
    @Composable
    override fun present(): AppListScreen.State {
        return AppListScreen.State(apps = appsRepository.getApps())
    }
}
