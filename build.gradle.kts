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

// Sửa lỗi Unresolved reference bằng cách sử dụng cấu hình thông qua tên plugin
configure<com.lagradost.cloudstream3.gradle.CloudstreamExtension> {
    setDisplayName(project.findProperty("moduleName")?.toString() ?: "Yanhh3D")
    setPackageName(project.findProperty("moduleClassName")?.toString() ?: "com.yourname.Yanhh3DProvider")
    setDescription(project.findProperty("description")?.toString() ?: "Cloudstream Provider")
}

dependencies {
    // Sử dụng chuỗi trực tiếp để tránh lỗi biến số
    compileOnly("com.github.recloudstream:cloudstream:master-SNAPSHOT")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.20")
}
