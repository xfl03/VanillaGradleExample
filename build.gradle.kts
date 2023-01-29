plugins {
    java
    id("org.spongepowered.gradle.vanilla")
}
group = "org.example"
version = "1.0-SNAPSHOT"

minecraft {
    latestRelease() // latestRelease() , latestSnapshot() or version("1.19.3")
    platform(org.spongepowered.gradle.vanilla.repository.MinecraftPlatform.JOINED)
    runs {
        server()
        client()
    }
}