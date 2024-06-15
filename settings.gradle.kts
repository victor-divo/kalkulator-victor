pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://mvnrepository.com/artifact/com.intuit.ssp/ssp-android/1.1.0")
        maven(url = "https://mvnrepository.com/artifact/com.intuit.sdp/sdp-android/1.1.0")
        maven(url = "https://mvnrepository.com/artifact/net.objecthunter/exp4j/0.4.8")
    }
}

rootProject.name = "Kalkulator Victor"
include(":app")
