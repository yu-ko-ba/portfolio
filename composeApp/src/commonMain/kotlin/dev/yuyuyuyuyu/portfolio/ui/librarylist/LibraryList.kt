package dev.yuyuyuyuyu.portfolio.ui.librarylist

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Book
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.yuyuyuyuyu.portfolio.ui.components.listitems.ProductListItem

@Composable
fun LibraryList(state: LibraryListScreen.State, modifier: Modifier = Modifier) = LazyColumn(modifier) {
    items(state.libraries) { library ->
        ProductListItem(
            product = library,
            icon = Icons.Default.Book,
            iconDescription = null,
        )
    }
}
