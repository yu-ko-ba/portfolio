package dev.yuyuyuyuyu.portfolio.ui.pluginList

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bolt
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.yuyuyuyuyu.portfolio.ui.components.listItems.ProductListItem

@Composable
fun PluginList(
    state: PluginListScreen.State,
    modifier: Modifier = Modifier,
) = LazyColumn(modifier) {
    items(items = state.plugins, key = { plugin -> plugin.name }) { plugin ->
        ProductListItem(
            product = plugin,
            icon = Icons.Default.Bolt,
            iconDescription = null,
        )
    }
}
