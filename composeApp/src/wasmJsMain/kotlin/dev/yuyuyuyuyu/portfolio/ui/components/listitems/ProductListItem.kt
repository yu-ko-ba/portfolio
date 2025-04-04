package dev.yuyuyuyuyu.portfolio.ui.components.listitems

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import dev.yuyuyuyuyu.portfolio.data.types.Product
import dev.yuyuyuyuyu.portfolio.ui.components.listitems.share.BaseListItem
import dev.yuyuyuyuyu.portfolio.ui.components.listitems.share.ItemBody

@Composable
fun ProductListItem(
    product: Product,
    icon: ImageVector,
    iconDescription: String,
    modifier: Modifier = Modifier,
) = BaseListItem(
    name = product.name,
    description = product.description,
    techStackSet = product.techStack,
    icon = {
        Box(
            modifier = it,
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                imageVector = icon,
                contentDescription = iconDescription,
                modifier = Modifier.size(30.dp),
            )
        }
    },
    modifier = modifier,
) { uriHandler ->
    ItemBody(
        repositoryUrl = product.repositoryUrl,
        sourceCodeLabel = "GitHub",
        onSourceCodeLinkClick = { uriHandler.openUri(product.repositoryUrl) },
    )
}
