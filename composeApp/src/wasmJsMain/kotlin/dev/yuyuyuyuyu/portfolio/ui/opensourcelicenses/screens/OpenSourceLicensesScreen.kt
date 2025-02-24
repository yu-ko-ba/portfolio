package dev.yuyuyuyuyu.portfolio.ui.opensourcelicenses.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import dev.yuyuyuyuyu.portfolio.ui.opensourcelicenses.LibrariesContainer
import dev.yuyuyuyuyu.portfolio.ui.opensourcelicenses.rememberLibraries
import org.jetbrains.compose.resources.ExperimentalResourceApi
import portfolio.composeapp.generated.resources.Res

@OptIn(ExperimentalResourceApi::class)
@Composable
fun OpenSourceLicensesScreen(
    modifier: Modifier = Modifier,
) {
    val libraries by rememberLibraries {
        Res.readBytes("files/aboutlibraries.json").decodeToString()
    }

    LibrariesContainer(
        libraries = libraries,
        showDescription = true,
    )
}
