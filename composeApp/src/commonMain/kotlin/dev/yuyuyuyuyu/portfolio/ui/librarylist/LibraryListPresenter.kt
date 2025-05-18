package dev.yuyuyuyuyu.portfolio.ui.librarylist

import androidx.compose.runtime.Composable
import com.slack.circuit.runtime.presenter.Presenter

class LibraryListPresenter : Presenter<LibraryListScreen.State> {
    @Composable
    override fun present(): LibraryListScreen.State = LibraryListScreen.State
}
