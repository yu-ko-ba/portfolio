package dev.yuyuyuyuyu.portfolio.di

import com.slack.circuit.foundation.Circuit
import dev.yuyuyuyuyu.portfolio.data.repositories.AppsRepository
import dev.yuyuyuyuyu.portfolio.data.repositories.CliToolsRepository
import dev.yuyuyuyuyu.portfolio.data.repositories.LibrariesRepository
import dev.yuyuyuyuyu.portfolio.data.repositories.PluginsRepository
import dev.yuyuyuyuyu.portfolio.ui.appllist.AppList
import dev.yuyuyuyuyu.portfolio.ui.appllist.AppListPresenter
import dev.yuyuyuyuyu.portfolio.ui.appllist.AppListScreen
import org.koin.dsl.module

val portfolioAppModule = module {
    single {
        Circuit.Builder()
            .addPresenter<AppListScreen, AppListScreen.State>(AppListPresenter(get()))
            .addUi<AppListScreen, AppListScreen.State> { state, modifier -> AppList(state, modifier) }
            .build()
    }

    single { AppsRepository() }
    single { LibrariesRepository() }
    single { PluginsRepository() }
    single { CliToolsRepository() }
}
