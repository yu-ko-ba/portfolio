package dev.yuyuyuyuyu.portfolio.data.repositories

import dev.yuyuyuyuyu.portfolio.data.models.App
import dev.yuyuyuyuyu.portfolio.data.models.TechStack
import portfolio.composeapp.generated.resources.*

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
            screenshots = listOf(Res.drawable.what_is_the_date_today_screenshot),
        ),
        App(
            name = "年齢の計算",
            description = "生年月日から年齢を計算するアプリ",
            icon = Res.drawable.howoldami_icon,
            techStack = setOf(TechStack.Web, TechStack.Kotlin, TechStack.ComposeMultiplatform, TechStack.Pwa),
            url = "https://how-old-am-i.yuyuyuyuyu.dev",
            repositoryUrl = "https://github.com/yu-ko-ba/how-old-am-i",
            screenshots = listOf(Res.drawable.how_old_am_i_screenshot),
        ),
        App(
            name = "Location Remover",
            description = "画像からメタデータを削除するアプリ",
            icon = Res.drawable.locationremover_icon,
            techStack = setOf(TechStack.Web, TechStack.Html, TechStack.Css, TechStack.JavaScript, TechStack.Pwa),
            url = "https://yu-ko-ba.github.io/location-remover/",
            repositoryUrl = "https://github.com/yu-ko-ba/location-remover",
            screenshots = listOf(Res.drawable.LocationRemover_screenshot),
        ),
        App(
            name = "クリップボードへコピー",
            description = "入力された文字をクリップボードへコピーするアプリ",
            techStack = setOf(TechStack.Web, TechStack.TypeScript, TechStack.React, TechStack.MaterialUi),
            url = "https://yu-ko-ba.github.io/copy-to-clipboard/",
            repositoryUrl = "https://github.com/yu-ko-ba/copy-to-clipboard",
            screenshots = listOf(Res.drawable.copy_to_clipboard_screenshot),
        ),
        App(
            name = "乱数の生成",
            description = "指定した範囲から乱数を生成するアプリ",
            techStack = setOf(TechStack.Web, TechStack.TypeScript, TechStack.React, TechStack.MaterialUi),
            url = "https://yu-ko-ba.github.io/get-random-int/",
            repositoryUrl = "https://github.com/yu-ko-ba/get-random-int",
            screenshots = listOf(Res.drawable.get_random_int_screenshot),
        ),
        App(
            name = "genkaikor",
            description = "入力された文字すべてに濁点をつけるアプリ",
            techStack = setOf(TechStack.Web, TechStack.TypeScript, TechStack.NextJs, TechStack.MaterialUi),
            url = "https://yu-ko-ba.github.io/genkaikor/",
            repositoryUrl = "https://github.com/yu-ko-ba/genkaikor",
            screenshots = listOf(Res.drawable.genkaikor_screenshot),
        ),
        App(
            name = "repeater",
            description = "入力された文字をひたすら繰り返すアプリ",
            techStack = setOf(TechStack.Web, TechStack.TypeScript, TechStack.NextJs, TechStack.MaterialUi),
            url = "https://yu-ko-ba.github.io/repeater/",
            repositoryUrl = "https://github.com/yu-ko-ba/repeater",
            screenshots = listOf(Res.drawable.repeater_screenshot),
        ),
        App(
            name = "YM previewer for Twitter",
            description = "XでYouTube Musicのリンクをカード表示するためのワークアラウンド",
            techStack = setOf(TechStack.Web, TechStack.NextJs, TechStack.TypeScript, TechStack.MaterialUi),
            url = "https://ym-previewer.vercel.app",
            repositoryUrl = "https://github.com/yu-ko-ba/ym-previewer",
            screenshots = listOf(Res.drawable.ym_previewer_screenshot),
        ),
        App(
            name = "deliciouShare.app",
            description = "「おいしい！」の情報共有を効率化するWebサービス",
            icon = Res.drawable.delicioushareapp_icon,
            techStack = setOf(
                TechStack.Web,
                TechStack.NextJs,
                TechStack.TypeScript,
                TechStack.MaterialUi,
                TechStack.Go,
                TechStack.Aws,
                TechStack.AwsLambda,
                TechStack.AmazonDynamoDb,
                TechStack.Pwa,
            ),
            repositoryUrl = "https://github.com/yu-ko-ba/deliciouShare",
        ),
        App(
            name = "パスワードジェネレーター",
            description = "ひらがなカタカナ対応の簡易パスワードジェネレーター",
            techStack = setOf(TechStack.Web, TechStack.NextJs, TechStack.TypeScript, TechStack.MaterialUi),
            url = "https://password-generator-yu-ko-ba.vercel.app",
            repositoryUrl = "https://github.com/yu-ko-ba/password-generator",
            screenshots = listOf(Res.drawable.PasswordGenerator_screenshot),
        ),
        App(
            name = "引けない確率の計算",
            description = "1度も引けない確率を計算するアプリ",
            techStack = setOf(
                TechStack.Web,
                TechStack.Angular,
                TechStack.TypeScript,
                TechStack.AngularMaterial,
                TechStack.Pwa,
            ),
            url = "https://non-drawing-probability-calculator.vercel.app",
            repositoryUrl = "https://github.com/yu-ko-ba/not-pulling-probability-calculator",
            screenshots = listOf(Res.drawable.not_pulling_probability_calculator_screenshot),
        ),
        App(
            name = "ToLeet",
            description = "L33t表記へ変換するアプリ",
            techStack = setOf(
                TechStack.Web,
                TechStack.Angular,
                TechStack.TypeScript,
                TechStack.AngularMaterial,
                TechStack.Pwa,
            ),
            url = "https://to-leet.vercel.app",
            repositoryUrl = "https://github.com/yu-ko-ba/to-leet",
            screenshots = listOf(Res.drawable.to_leet_screenshot),
        ),
        App(
            name = "気圧計",
            description = "気圧センサーの値を表示するアプリ",
            techStack = setOf(TechStack.Android, TechStack.Kotlin, TechStack.JetpackCompose),
            repositoryUrl = "https://github.com/yu-ko-ba/barometer",
            screenshots = listOf(Res.drawable.barometer_en_screenshot, Res.drawable.barometer_ja_screenshot),
        ),
        App(
            name = "コードスキャナー",
            description = "シンプルなコードスキャナーアプリ",
            techStack = setOf(TechStack.Android, TechStack.Kotlin, TechStack.JetpackCompose),
            repositoryUrl = "https://github.com/yu-ko-ba/CodeScanner",
            screenshots = listOf(Res.drawable.CodeScanner_screenshot),
        ),
    ).sortedBy { it.repositoryUrl }

    fun getApps() = apps
}
