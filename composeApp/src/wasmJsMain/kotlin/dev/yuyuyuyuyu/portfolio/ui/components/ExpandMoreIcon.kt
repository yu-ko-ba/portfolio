package dev.yuyuyuyuyu.portfolio.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ExpandMoreIcon(
    expanded: Boolean,
    modifier: Modifier = Modifier,
) = if (expanded) {
    Icon(Icons.Default.KeyboardArrowUp, "close")
} else {
    Icon(Icons.Default.KeyboardArrowDown, "open")
}
