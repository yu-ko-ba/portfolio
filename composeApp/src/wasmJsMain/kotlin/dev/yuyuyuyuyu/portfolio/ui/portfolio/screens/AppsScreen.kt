package dev.yuyuyuyuyu.portfolio.ui.portfolio.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.yuyuyuyuyu.portfolio.data.repositories.AppsRepository
import dev.yuyuyuyuyu.portfolio.ui.components.listitems.AppListItem

@Composable
fun AppsScreen(
    appsRepository: AppsRepository = AppsRepository(),
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(40.dp)
    ) {
        items(appsRepository.getApps().sortedBy { it.repositoryUrl.lowercase() }) { app ->
            AppListItem(app)
        }
        item {
            Spacer(Modifier)
        }
    }
}
