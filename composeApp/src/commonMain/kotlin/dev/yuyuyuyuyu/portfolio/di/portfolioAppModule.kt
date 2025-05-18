package dev.yuyuyuyuyu.portfolio.di

import com.slack.circuit.foundation.Circuit
import dev.yuyuyuyuyu.portfolio.data.repositories.AppsRepository
import dev.yuyuyuyuyu.portfolio.data.repositories.CliToolsRepository
import dev.yuyuyuyuyu.portfolio.data.repositories.LibrariesRepository
import dev.yuyuyuyuyu.portfolio.data.repositories.PluginsRepository
import dev.yuyuyuyuyu.portfolio.ui.appllist.AppList
import dev.yuyuyuyuyu.portfolio.ui.appllist.AppListPresenter
import dev.yuyuyuyuyu.portfolio.ui.appllist.AppListScreen
import dev.yuyuyuyuyu.portfolio.ui.clitoollist.CliToolList
import dev.yuyuyuyuyu.portfolio.ui.clitoollist.CliToolListPresenter
import dev.yuyuyuyuyu.portfolio.ui.clitoollist.CliToolListScreen
import dev.yuyuyuyuyu.portfolio.ui.librarylist.LibraryList
import dev.yuyuyuyuyu.portfolio.ui.librarylist.LibraryListPresenter
import dev.yuyuyuyuyu.portfolio.ui.librarylist.LibraryListScreen
import dev.yuyuyuyuyu.portfolio.ui.opensourcelicenselist.OpenSourceLicenseList
import dev.yuyuyuyuyu.portfolio.ui.opensourcelicenselist.OpenSourceLicenseListPresenter
import dev.yuyuyuyuyu.portfolio.ui.opensourcelicenselist.OpenSourceLicenseListScreen
import dev.yuyuyuyuyu.portfolio.ui.pluginlist.PluginList
import dev.yuyuyuyuyu.portfolio.ui.pluginlist.PluginListPresenter
import dev.yuyuyuyuyu.portfolio.ui.pluginlist.PluginListScreen
import dev.yuyuyuyuyu.portfolio.ui.portfolio.Portfolio
import dev.yuyuyuyuyu.portfolio.ui.portfolio.PortfolioPresenter
import dev.yuyuyuyuyu.portfolio.ui.portfolio.PortfolioScreen
import org.koin.dsl.module

val portfolioAppModule = module {
    single {
        Circuit.Builder()
            .addPresenter<PortfolioScreen, PortfolioScreen.State>(PortfolioPresenter())
            .addPresenter<AppListScreen, AppListScreen.State>(AppListPresenter(get()))
            .addPresenter<LibraryListScreen, LibraryListScreen.State>(LibraryListPresenter(get()))
            .addPresenter<PluginListScreen, PluginListScreen.State>(PluginListPresenter(get()))
            .addPresenter<CliToolListScreen, CliToolListScreen.State>(CliToolListPresenter(get()))
            .addPresenter<OpenSourceLicenseListScreen, OpenSourceLicenseListScreen.State>(OpenSourceLicenseListPresenter())
            .addUi<PortfolioScreen, PortfolioScreen.State> { _, modifier -> Portfolio(modifier) }
            .addUi<AppListScreen, AppListScreen.State> { state, modifier -> AppList(state, modifier) }
            .addUi<LibraryListScreen, LibraryListScreen.State> { state, modifier -> LibraryList(state, modifier) }
            .addUi<PluginListScreen, PluginListScreen.State> { state, modifier -> PluginList(state, modifier) }
            .addUi<CliToolListScreen, CliToolListScreen.State> { state, modifier -> CliToolList(state, modifier) }
            .addUi<OpenSourceLicenseListScreen, OpenSourceLicenseListScreen.State> { _, modifier ->
                OpenSourceLicenseList(modifier)
            }
            .build()
    }

    single { AppsRepository() }
    single { LibrariesRepository() }
    single { PluginsRepository() }
    single { CliToolsRepository() }
}
