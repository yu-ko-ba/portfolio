package dev.yuyuyuyuyu.portfolio.ui.appllist

import androidx.compose.runtime.Composable
import com.slack.circuit.runtime.presenter.Presenter

class AppListPresenter : Presenter<AppListScreen.State> {
    @Composable
    override fun present(): AppListScreen.State {
        return AppListScreen.State(listOf("arisu", "Arisu"))
    }
}
