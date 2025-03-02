package dev.yuyuyuyuyu.portfolio.ui.portfolio.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bolt
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.yuyuyuyuyu.portfolio.data.repositories.LibrariesRepository
import dev.yuyuyuyuyu.portfolio.ui.components.listitems.ProductListItem

@Composable
fun LibrariesScreen(
    librariesRepository: LibrariesRepository = LibrariesRepository(),
    modifier: Modifier = Modifier,
) = LazyColumn(
    modifier = modifier,
    verticalArrangement = Arrangement.spacedBy(40.dp),
) {
    items(librariesRepository.getLibraries().sortedBy { it.repositoryUrl }) { product ->
        ProductListItem(product)
    }
    item {
        Spacer(Modifier)
    }
}
