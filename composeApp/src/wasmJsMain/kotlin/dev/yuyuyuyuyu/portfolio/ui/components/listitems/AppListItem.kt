package dev.yuyuyuyuyu.portfolio.ui.components.listitems

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.OpenInNew
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.unit.dp
import dev.yuyuyuyuyu.portfolio.data.types.App
import dev.yuyuyuyuyu.portfolio.ui.components.ExpandMoreIcon
import dev.yuyuyuyuyu.portfolio.ui.components.listitems.parts.ItemBody
import dev.yuyuyuyuyu.portfolio.ui.components.listitems.parts.SupportingContent
import org.jetbrains.compose.resources.painterResource

@Composable
fun AppListItem(
    app: App,
    modifier: Modifier = Modifier,
) {
    val uriHandler = LocalUriHandler.current

    var expanded by rememberSaveable { mutableStateOf(false) }

    Column(
        modifier = modifier,
    ) {
        ListItem(
            leadingContent = {
                Image(
                    painter = painterResource(app.icon),
                    contentDescription = "app icon",
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(Color.White),
                    contentScale = ContentScale.Crop,
                )
            },
            headlineContent = { Text(app.name) },
            supportingContent = {
                SupportingContent(
                    description = app.description,
                    techStack = app.techStack,
                )
            },
            trailingContent = { ExpandMoreIcon(expanded) },
            modifier = Modifier.clickable { expanded = !expanded },
        )

        if (expanded) {
            ItemBody(
                repositoryUrl = app.repositoryUrl,
                onSourceCodeLinkClick = { uriHandler.openUri(app.repositoryUrl) },
            ) {
                if (app.url != null) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                    ) {
                        Button(
                            content = {
                                Row {
                                    Icon(Icons.AutoMirrored.Default.OpenInNew, "open in new tab")
                                    Spacer(Modifier.width(1.dp))
                                    Text("アプリページを開く")
                                }
                            },
                            onClick = { uriHandler.openUri(app.url) },
                        )
                    }
                }
            }
        }
    }
}
