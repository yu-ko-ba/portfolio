package dev.yuyuyuyuyu.portfolio.ui.cliToolList

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Terminal
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.yuyuyuyuyu.portfolio.ui.components.listItems.ProductListItem

@Composable
fun CliToolList(state: CliToolListScreen.State, modifier: Modifier = Modifier) = LazyColumn(modifier) {
    items(items = state.cliTools, key = { cliTool -> cliTool.name }) { cliTool ->
        ProductListItem(
            product = cliTool,
            icon = Icons.Default.Terminal,
            iconDescription = null,
        )
    }
}
