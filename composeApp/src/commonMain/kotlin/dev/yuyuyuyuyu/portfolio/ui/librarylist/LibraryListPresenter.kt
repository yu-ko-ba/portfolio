package dev.yuyuyuyuyu.portfolio.ui.librarylist

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.produceState
import com.slack.circuit.runtime.presenter.Presenter
import dev.yuyuyuyuyu.portfolio.data.repositories.LibrariesRepository

class LibraryListPresenter(private val librariesRepository: LibrariesRepository) : Presenter<LibraryListScreen.State> {
    @Composable
    override fun present(): LibraryListScreen.State {
        val libraries by produceState(initialValue = emptyList()) {
            value = librariesRepository.getLibraries()
        }

        return LibraryListScreen.State(libraries)
    }
}
