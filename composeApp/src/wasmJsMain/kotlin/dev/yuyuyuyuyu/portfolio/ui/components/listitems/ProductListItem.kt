package dev.yuyuyuyuyu.portfolio.ui.components.listitems

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import dev.yuyuyuyuyu.portfolio.data.types.Product
import dev.yuyuyuyuyu.portfolio.ui.components.ExpandMoreIcon
import dev.yuyuyuyuyu.portfolio.ui.components.listitems.parts.ItemBody
import dev.yuyuyuyuyu.portfolio.ui.components.listitems.parts.SupportingContent

@Composable
fun ProductListItem(
    product: Product,
    modifier: Modifier = Modifier,
) {
    val uriHandler = LocalUriHandler.current

    var expanded by rememberSaveable { mutableStateOf(false) }

    Column(
        modifier = modifier,
    ) {
        ListItem(
            headlineContent = { Text(product.name) },
            supportingContent = {
                SupportingContent(
                    description = product.description,
                    techStack = product.techStack,
                )
            },
            trailingContent = { ExpandMoreIcon(expanded) },
            modifier = Modifier.clickable { expanded = !expanded },
        )
    }

    if (expanded) {
        ItemBody(
            repositoryUrl = product.repositoryUrl,
            sourceCodeLabel = "GitHub",
            onSourceCodeLinkClick = { uriHandler.openUri(product.repositoryUrl) },
        )
    }
}
