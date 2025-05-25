package dev.yuyuyuyuyu.portfolio.ui.libraryList

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Book
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.yuyuyuyuyu.portfolio.ui.components.listItems.ProductListItem

@Composable
fun LibraryList(state: LibraryListScreen.State, modifier: Modifier = Modifier) = LazyColumn(modifier) {
    items(items = state.libraries, key = { library -> library.name }) { library ->
        ProductListItem(
            product = library,
            icon = Icons.Default.Book,
            iconDescription = null,
        )
    }
}
