package dev.yuyuyuyuyu.portfolio.data.types

data class Product(
    val name: String,
    val description: String,
    val techStack: Set<TechStack>,
    val repositoryUrl: String,
)
