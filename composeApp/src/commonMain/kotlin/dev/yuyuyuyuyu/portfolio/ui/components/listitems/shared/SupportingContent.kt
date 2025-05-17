package dev.yuyuyuyuyu.portfolio.ui.components.listitems.share

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.yuyuyuyuyu.portfolio.data.models.TechStack

@Composable
fun SupportingContent(
    description: String,
    techStackSet: Set<TechStack>,
    modifier: Modifier = Modifier,
) = Column(modifier = modifier) {
    Text(description)
    Row(
        modifier = Modifier.horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.spacedBy(3.dp)
    ) {
        techStackSet.sorted().forEach {
            AssistChip(
                label = { Text(it.label) },
                onClick = {},
                modifier = Modifier.height(25.dp),
            )
        }
    }
}
