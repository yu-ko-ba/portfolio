package dev.yuyuyuyuyu.portfolio.ui.components.listitems.shared

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.platform.UriHandler
import androidx.compose.ui.unit.dp
import dev.yuyuyuyuyu.portfolio.data.models.TechStack
import dev.yuyuyuyuyu.portfolio.ui.components.ExpandMoreIcon
import dev.yuyuyuyuyu.portfolio.ui.components.listitems.share.SupportingContent

@Composable
fun BaseListItem(
    name: String,
    description: String,
    techStackSet: Set<TechStack>,
    icon: @Composable (modifier: Modifier) -> Unit,
    modifier: Modifier = Modifier,
    expandedItem: @Composable (uriHandler: UriHandler) -> Unit,
) {
    var expanded by rememberSaveable { mutableStateOf(false) }

    Column(
        modifier = modifier
            .clickable { expanded = !expanded }
            .background(MaterialTheme.colorScheme.surface),
    ) {
        val uriHandler = LocalUriHandler.current

        ListItem(
            leadingContent = {
                icon(
                    Modifier
                        .size(40.dp)
                        .clip(CircleShape),
                )
            },
            headlineContent = { Text(name) },
            supportingContent = {
                SupportingContent(
                    description = description,
                    techStackSet = techStackSet,
                )
            },
            trailingContent = { ExpandMoreIcon(expanded) },
        )

        if (expanded) {
            expandedItem(uriHandler)
        }

        Spacer(Modifier.height(40.dp))
    }
}
