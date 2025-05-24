package dev.yuyuyuyuyu.portfolio.ui.appList

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.yuyuyuyuyu.portfolio.ui.components.listItems.AppListItem

@Composable
fun AppList(state: AppListScreen.State, modifier: Modifier = Modifier) = LazyColumn(modifier) {
    items(state.apps) { app ->
        AppListItem(app)
    }
}
