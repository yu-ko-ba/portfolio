package dev.yuyuyuyuyu.portfolio.data.repositories

import dev.yuyuyuyuyu.portfolio.data.types.Product
import dev.yuyuyuyuyu.portfolio.data.types.TechStack

class PluginsRepository {
    private val plugins = listOf(
        Product(
            name = "insert-end-semicolon.nvim",
            description = "行末に\";\"を挿入するNeovimプラグイン",
            techStack = setOf(TechStack.Neovim, TechStack.Lua),
            repositoryUrl = "https://github.com/yu-ko-ba/insert-end-semicolon.nvim",
        ),
    )

    fun getPlugins() = plugins
}
