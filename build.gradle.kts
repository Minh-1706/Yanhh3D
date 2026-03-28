import com.lagradost.cloudstream3.gradle.CloudstreamExtension

buildscript {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
    dependencies {
        classpath("com.github.recloudstream:gradle:master-SNAPSHOT")
    }
}

apply(plugin = "com.android.library")
apply(plugin = "kotlin-android")
apply(plugin = "com.lagradost.cloudstream3.gradle")

// Cách viết đơn giản hơn để tránh lỗi Unresolved reference
extensions.configure<CloudstreamExtension> {
    setDisplayName(project.findProperty("moduleName")?.toString() ?: "Yanhh3D")
    setPackageName(project.findProperty("moduleClassName")?.toString() ?: "com.yourname.Yanhh3DProvider")
    setDescription(project.findProperty("description")?.toString() ?: "Cloudstream Provider")
}

dependencies {
    // Luôn dùng bản master-SNAPSHOT để đồng bộ với Plugin
    compileOnly("com.github.recloudstream:cloudstream:master-SNAPSHOT")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.20")
}
