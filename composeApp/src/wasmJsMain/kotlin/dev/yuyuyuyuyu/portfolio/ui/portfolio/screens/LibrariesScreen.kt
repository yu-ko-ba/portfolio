package dev.yuyuyuyuyu.portfolio.ui.portfolio.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bolt
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun LibrariesScreen(
    modifier: Modifier = Modifier,
) {
    Row {
        Icon(Icons.Default.Bolt, null)
        Text("実装中...")
    }
}
