package dev.yuyuyuyuyu.portfolio.ui.appllist

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.yuyuyuyuyu.portfolio.ui.components.listitems.AppListItem

@Composable
fun AppList(state: AppListScreen.State, modifier: Modifier = Modifier) = LazyColumn(modifier) {
    items(state.apps) { app ->
        AppListItem(app)
    }
}
