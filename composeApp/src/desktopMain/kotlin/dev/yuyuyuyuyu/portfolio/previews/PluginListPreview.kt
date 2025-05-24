package dev.yuyuyuyuyu.portfolio.previews

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import dev.yuyuyuyuyu.portfolio.data.repositories.PluginsRepository
import dev.yuyuyuyuyu.portfolio.ui.pluginList.PluginList
import dev.yuyuyuyuyu.portfolio.ui.pluginList.PluginListScreen

@Composable
@Preview
fun PluginListPreview() {
    PluginList(PluginListScreen.State(plugins = PluginsRepository().getPlugins()))
}
