package dev.yuyuyuyuyu.portfolio.ui.portfolio.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import dev.yuyuyuyuyu.portfolio.data.repositories.CliToolsRepository
import dev.yuyuyuyuyu.portfolio.ui.components.listitems.ProductListItem

@Composable
fun CliToolsScreen(
    icon: ImageVector,
    iconDescription: String,
    modifier: Modifier = Modifier,
    cliToolsRepository: CliToolsRepository = CliToolsRepository(),
) = LazyColumn(
    modifier = modifier,
    verticalArrangement = Arrangement.spacedBy(40.dp),
) {
    items(cliToolsRepository.getCliTools().sortedBy { it.repositoryUrl }) { product ->
        ProductListItem(
            product = product,
            icon = icon,
            iconDescription = iconDescription,
        )
    }
   
    item {
        Spacer(Modifier)
    }
}
