package dev.yuyuyuyuyu.portfolio.ui.components.listitems

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.default_icon

@Composable
fun AppListItem(
    modifier: Modifier = Modifier,
) {
    var expanded by remember { mutableStateOf(false) }

    Column(
        modifier = modifier,
    ) {
        ListItem(
            leadingContent = {
                Image(
                    painter = painterResource(Res.drawable.default_icon),
                    contentDescription = "App icon",
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(Color.White),
                    contentScale = ContentScale.Crop,
                )
            },
            headlineContent = { Text("Barometer") },
            supportingContent = {
                Column {
                    Text("A Barometer App")
                    Row {
                        Text("Jetpack Compose")
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
            Text(
                "Screenshots",
                style = MaterialTheme.typography.titleMedium,
            )
        }
    }
}
