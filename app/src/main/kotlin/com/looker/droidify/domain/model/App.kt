package com.looker.droidify.domain.model

data class App(
    val repoId: Long,
    val appId: Long,
    val categories: List<String>,
    val links: Links,
    val metadata: Metadata,
    val author: Author,
    val screenshots: Screenshots,
    val graphics: Graphics,
    val donation: Donation,
    val preferredSigner: String = "",
    val packages: List<Package>
)

data class Author(
    val id: Long,
    val name: String,
    val email: String,
    val web: String
)

data class Donation(
    val regularUrl: String? = null,
    val bitcoinAddress: String? = null,
    val flattrId: String? = null,
    val liteCoinAddress: String? = null,
    val openCollectiveId: String? = null,
    val librePayId: String? = null,
)

data class Graphics(
    val featureGraphic: String = "",
    val promoGraphic: String = "",
    val tvBanner: String = "",
    val video: String = ""
)

data class Links(
    val changelog: String = "",
    val issueTracker: String = "",
    val sourceCode: String = "",
    val translation: String = "",
    val webSite: String = ""
)

data class Metadata(
    val name: String,
    val packageName: PackageName,
    val added: Long,
    val description: String,
    val icon: String,
    val lastUpdated: Long,
    val license: String,
    val suggestedVersionCode: Long,
    val suggestedVersionName: String,
    val summary: String
)

data class Screenshots(
    val phone: List<String> = emptyList(),
    val sevenInch: List<String> = emptyList(),
    val tenInch: List<String> = emptyList(),
    val tv: List<String> = emptyList(),
    val wear: List<String> = emptyList()
)

data class AppMinimal(
    val appId: Long,
    val name: String,
    val summary: String,
    val icon: String,
    val suggestedVersion: String,
)

fun App.minimal() = AppMinimal(
    appId = appId,
    name = metadata.name,
    summary = metadata.summary,
    icon = metadata.icon,
    suggestedVersion = metadata.suggestedVersionName,
)
