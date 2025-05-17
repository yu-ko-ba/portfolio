package dev.yuyuyuyuyu.portfolio.ui.opensourcelicenselist

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.mikepenz.aboutlibraries.ui.compose.m3.LibrariesContainer
import com.mikepenz.aboutlibraries.ui.compose.rememberLibraries
import portfolio.composeapp.generated.resources.Res

@Composable
fun OpenSourceLicenseList(modifier: Modifier = Modifier) {
    val libraries by rememberLibraries {
        Res.readBytes("files/aboutlibraries.json").decodeToString()
    }

    LibrariesContainer(
        libraries = libraries,
        modifier = modifier,
        showDescription = true,
    )
}
