package dev.yuyuyuyuyu.portfolio.ui.portfolio

import androidx.compose.runtime.Composable
import com.slack.circuit.runtime.presenter.Presenter

class PortfolioPresenter : Presenter<PortfolioScreen.State> {
    @Composable
    override fun present(): PortfolioScreen.State = PortfolioScreen.State
}
