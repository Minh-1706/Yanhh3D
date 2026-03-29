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

// Sử dụng cách khai báo an toàn nhất cho Gradle 8.x
configure<CloudstreamExtension> {
    displayName = project.findProperty("moduleName")?.toString() ?: "Yanhh3D"
    packageName = project.findProperty("moduleClassName")?.toString() ?: "com.yourname.Yanhh3DProvider"
    description = project.findProperty("description")?.toString() ?: "Cloudstream Provider"
}

dependencies {
    // Ép kiểu dependency để Gradle 8.x không bị nhầm lẫn
    add("compileOnly", "com.github.recloudstream:cloudstream:master-SNAPSHOT")
    add("implementation", "org.jetbrains.kotlin:kotlin-stdlib:1.9.20")
}
