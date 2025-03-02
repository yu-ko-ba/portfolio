package dev.yuyuyuyuyu.portfolio.data.repositories

import dev.yuyuyuyuyu.portfolio.data.types.App
import dev.yuyuyuyuyu.portfolio.data.types.TechStack
import portfolio.composeapp.generated.resources.*
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.howoldami_icon
import portfolio.composeapp.generated.resources.locationremover_icon
import portfolio.composeapp.generated.resources.whatisthedatetoday_icon

class AppsRepository {
    private val apps = listOf(
        App(
            name = "PureMusicPlayer",
            description = "フィルターレスのミュージックプレーヤーアプリ",
            icon = Res.drawable.puremusicplayer_icon,
            techStack = setOf(TechStack.Ios, TechStack.Swift),
            repositoryUrl = "https://github.com/yu-ko-ba/PureMusicPlayer",
        ),
        App(
            name = "DigitalClock",
            description = "デジタル時計アプリ",
            techStack = setOf(TechStack.Android, TechStack.Kotlin),
            repositoryUrl = "https://github.com/yu-ko-ba/DigitalClock",
        ),
        App(
            name = "今日の日付",
            description = "現在の日付を表示するアプリ",
            icon = Res.drawable.whatisthedatetoday_icon,
            techStack = setOf(TechStack.Web, TechStack.Html, TechStack.Css, TechStack.Go, TechStack.Pwa),
            url = "https://yu-ko-ba.github.io/what-is-the-date-today/",
            repositoryUrl = "https://github.com/yu-ko-ba/what-is-the-date-today",
        ),
        App(
            name = "年齢の計算",
            description = "生年月日から年齢を計算するアプリ",
            icon = Res.drawable.howoldami_icon,
            techStack = setOf(TechStack.Web, TechStack.Kotlin, TechStack.ComposeMultiplatform, TechStack.Pwa),
            url = "https://how-old-am-i.yuyuyuyuyu.dev",
            repositoryUrl = "https://github.com/yu-ko-ba/how-old-am-i",
        ),
        App(
            name = "Location Remover",
            description = "画像からメタデータを削除するアプリ",
            icon = Res.drawable.locationremover_icon,
            techStack = setOf(TechStack.Web, TechStack.Html, TechStack.Css, TechStack.JavaScript, TechStack.Pwa),
            url = "https://yu-ko-ba.github.io/location-remover/",
            repositoryUrl = "https://github.com/yu-ko-ba/location-remover",
        ),
        App(
            name = "クリップボードへコピー",
            description = "入力された文字をクリップボードへコピーするアプリ",
            techStack = setOf(TechStack.Web, TechStack.TypeScript, TechStack.React, TechStack.MaterialUi),
            url = "https://yu-ko-ba.github.io/copy-to-clipboard/",
            repositoryUrl = "https://github.com/yu-ko-ba/copy-to-clipboard",
        ),
        App(
            name = "乱数の生成",
            description = "指定した範囲から乱数を生成するアプリ",
            techStack = setOf(TechStack.Web, TechStack.TypeScript, TechStack.React, TechStack.MaterialUi),
            url = "https://yu-ko-ba.github.io/get-random-int/",
            repositoryUrl = "https://github.com/yu-ko-ba/get-random-int",
        ),
        App(
            name = "genkaikor",
            description = "入力された文字すべてに濁点をつけるアプリ",
            techStack = setOf(TechStack.Web, TechStack.TypeScript, TechStack.NextJs, TechStack.MaterialUi),
            url = "https://yu-ko-ba.github.io/genkaikor/",
            repositoryUrl = "https://github.com/yu-ko-ba/genkaikor",
        ),
        App(
            name = "repeater",
            description = "入力された文字をひたすら繰り返すアプリ",
            techStack = setOf(TechStack.Web, TechStack.TypeScript, TechStack.NextJs, TechStack.MaterialUi),
            url = "https://yu-ko-ba.github.io/repeater/",
            repositoryUrl = "https://github.com/yu-ko-ba/repeater",
        ),
        App(
            name = "YM previewer for Twitter",
            description = "XでYouTube Musicのリンクをカード表示するためのワークアラウンド",
            techStack = setOf(TechStack.Web, TechStack.NextJs, TechStack.TypeScript, TechStack.MaterialUi),
            url = "https://ym-previewer.vercel.app",
            repositoryUrl = "https://github.com/yu-ko-ba/ym-previewer",
        ),
        App(
            name = "パスワードジェネレーター",
            description = "ひらがなカタカナ対応の簡易パスワードジェネレーター",
            techStack = setOf(TechStack.Web, TechStack.NextJs, TechStack.TypeScript, TechStack.MaterialUi),
            url = "https://password-generator-yu-ko-ba.vercel.app",
            repositoryUrl = "https://github.com/yu-ko-ba/password-generator",
        ),
        App(
            name = "引けない確率の計算",
            description = "1度も引けない確率を計算するアプリ",
            techStack = setOf(TechStack.Web, TechStack.Angular, TechStack.TypeScript, TechStack.AngularMaterial),
            url = "https://non-drawing-probability-calculator.vercel.app",
            repositoryUrl = "https://github.com/yu-ko-ba/not-pulling-probability-calculator",
        ),
        App(
            name = "ToLeet",
            description = "L33t表記へ変換するアプリ",
            techStack = setOf(TechStack.Web, TechStack.Angular, TechStack.TypeScript, TechStack.AngularMaterial),
            url = "https://to-leet.vercel.app",
            repositoryUrl = "https://github.com/yu-ko-ba/to-leet",
        ),
        App(
            name = "気圧計",
            description = "気圧センサーの値を表示するアプリ",
            techStack = setOf(TechStack.Android, TechStack.Kotlin, TechStack.JetpackCompose),
            repositoryUrl = "https://github.com/yu-ko-ba/barometer",
        ),
        App(
            name = "コードスキャナー",
            description = "シンプルなコードスキャナーアプリ",
            techStack = setOf(TechStack.Android, TechStack.Kotlin, TechStack.JetpackCompose),
            repositoryUrl = "https://github.com/yu-ko-ba/CodeScanner",
        ),
    )

    fun getApps() = apps
}
