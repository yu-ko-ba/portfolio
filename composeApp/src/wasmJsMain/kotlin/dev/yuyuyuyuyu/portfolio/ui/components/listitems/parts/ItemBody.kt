package dev.yuyuyuyuyu.portfolio.ui.components.listitems.parts

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.OpenInNew
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp

@Composable
fun ItemBody(
    repositoryUrl: String,
    modifier: Modifier = Modifier,
    sourceCodeLabel: String = "ソースコード",
    onSourceCodeLinkClick: () -> Unit,
    additionalContent: @Composable () -> Unit = {},
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(10.dp),
    ) {
        additionalContent()

        Column(
            modifier = Modifier.padding(horizontal = 10.dp),
        ) {
            Text(
                text = sourceCodeLabel,
                style = MaterialTheme.typography.titleMedium,
            )
            Row(
                modifier = Modifier.clickable(onClick = onSourceCodeLinkClick),
            ) {
                Icon(Icons.AutoMirrored.Default.OpenInNew, "open in new tab")
                Spacer(Modifier.width(1.dp))
                Text(
                    text = repositoryUrl,
                    color = MaterialTheme.colorScheme.outline,
                    textDecoration = TextDecoration.Underline,
                )
            }
        }
    }
}
