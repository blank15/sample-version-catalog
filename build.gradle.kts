import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `version-catalog`
    `maven-publish`
}
group = "com.catalog.example"
version ="1.0.0"

catalog {
    versionCatalog {
        from(files("blank.versions.toml"))
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            artifactId = "version.catalog"
            from(components["versionCatalog"])
        }
    }
}
