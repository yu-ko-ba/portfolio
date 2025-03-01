package dev.yuyuyuyuyu.portfolio.ui.components.listitems

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.OpenInNew
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import dev.yuyuyuyuyu.portfolio.data.types.App
import org.jetbrains.compose.resources.painterResource

@Composable
fun AppListItem(
    app: App,
    modifier: Modifier = Modifier,
) {
    val uriHandler = LocalUriHandler.current

    var expanded by remember { mutableStateOf(false) }

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
                Column {
                    Text(app.description)
                    Row(
                        modifier = Modifier.horizontalScroll(rememberScrollState()),
                        horizontalArrangement = Arrangement.spacedBy(3.dp)
                    ) {
                        app.techStack.sorted().forEach {
                            AssistChip(
                                label = { Text(it.label) },
                                onClick = {},
                                modifier = Modifier.height(25.dp),
//                                enabled = false,
                            )
                        }
                    }
                }
            },
            trailingContent = {
                if (expanded) {
                    Icon(Icons.Default.KeyboardArrowUp, "close")
                } else {
                    Icon(Icons.Default.KeyboardArrowDown, "open")
                }
            },
            modifier = Modifier.clickable { expanded = !expanded },
        )

        if (expanded) {
            Column(
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                if (app.url != null) {
                    Row(
                        modifier = Modifier.clickable {
                            uriHandler.openUri(app.url)
                        },
                    ) {
                        Icon(Icons.AutoMirrored.Default.OpenInNew, "open in new tab")
                        Spacer(Modifier.width(1.dp))
                        Text(
                            text = "アプリを開く",
                            textDecoration = TextDecoration.Underline,
                        )
                    }
                }

                Column {
                    Text(
                        "ソースコード",
                        style = MaterialTheme.typography.titleMedium,
                    )
                    Row(
                        modifier = Modifier.clickable {
                            uriHandler.openUri(app.repositoryUrl)
                        },
                    ) {
                        Icon(Icons.AutoMirrored.Default.OpenInNew, "open in new tab")
                        Spacer(Modifier.width(1.dp))
                        Text(
                            text = app.repositoryUrl,
                            color = MaterialTheme.colorScheme.outline,
                            textDecoration = TextDecoration.Underline,
                        )
                    }
                }
            }
        }
    }
}
