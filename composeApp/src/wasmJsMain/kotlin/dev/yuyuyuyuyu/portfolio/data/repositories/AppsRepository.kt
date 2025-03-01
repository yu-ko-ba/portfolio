package dev.yuyuyuyuyu.portfolio.data.repositories

import dev.yuyuyuyuyu.portfolio.data.types.App
import dev.yuyuyuyuyu.portfolio.data.types.TechStack
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.howoldami_icon

class AppsRepository {
    private val apps = listOf(
        App(
            name = "年齢の計算",
            description = "生年月日から年齢を計算するアプリ",
            icon = Res.drawable.howoldami_icon,
            techStack = setOf(TechStack.Web, TechStack.Kotlin, TechStack.ComposeMultiplatform, TechStack.Pwa),
            repositoryUrl = "https://github.com/yu-ko-ba/how-old-am-i",
            url = "https://how-old-am-i.yuyuyuyuyu.dev",
        ),
        App(
            name = "気圧計",
            description = "気圧センサーの値を表示するアプリ",
            techStack = setOf(TechStack.Android, TechStack.Kotlin, TechStack.JetpackCompose),
            repositoryUrl = "https://github.com/yu-ko-ba/barometer",
        ),
    )

    fun getApps() = apps
}
