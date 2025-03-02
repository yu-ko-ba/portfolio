package dev.yuyuyuyuyu.portfolio.data.repositories

import dev.yuyuyuyuyu.portfolio.data.types.Product
import dev.yuyuyuyuyu.portfolio.data.types.TechStack

class CliToolsRepository {
    private val cliTools = listOf(
        Product(
            name = "rubber-duck",
            description = "Go言語製のラバーダック",
            techStack = setOf(TechStack.Go),
            repositoryUrl = "https://github.com/yu-ko-ba/rubber-duck",
        ),
        Product(
            name = "generate-third-party-licenses-json",
            description = "Node.jsプロジェクトのサードパーティライブラリのライセンスを収集し、JSON形式でエクスポートするCLIツール",
            techStack = setOf(TechStack.TypeScript, TechStack.NodeJs),
            repositoryUrl = "https://github.com/yu-ko-ba/generate-third-party-licenses-json",
        ),
    )

    fun getCliTools() = cliTools
}
