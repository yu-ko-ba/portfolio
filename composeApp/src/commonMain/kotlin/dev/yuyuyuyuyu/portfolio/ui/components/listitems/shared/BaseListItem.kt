package dev.yuyuyuyuyu.portfolio.ui.components.listitems.shared

import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.platform.UriHandler
import androidx.compose.ui.unit.dp
import dev.yuyuyuyuyu.portfolio.data.models.TechStack
import dev.yuyuyuyuyu.portfolio.ui.components.ExpandMoreIcon

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
    val uriHandler = LocalUriHandler.current

    val interactionSource = remember { MutableInteractionSource() }
    Column(
        modifier = modifier
            .clickable(interactionSource = interactionSource, indication = null) { expanded = !expanded }
            .background(MaterialTheme.colorScheme.surface),
    ) {
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
            trailingContent = {
                ExpandMoreIcon(
                    expanded = expanded,
                    modifier = Modifier.indication(
                        interactionSource = interactionSource,
                        indication = LocalIndication.current,
                    ),
                )
            },
        )

        if (expanded) {
            expandedItem(uriHandler)
        }

        Spacer(Modifier.height(40.dp))
    }
}
