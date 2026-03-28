import com.lagradost.cloudstream3.gradle.CloudstreamExtension
import org.gradle.api.Project

buildscript {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("[https://jitpack.io](https://jitpack.io)") }
    }
    dependencies {
        classpath("com.github.recloudstream:gradle:-SNAPSHOT")
    }
}

apply(plugin = "com.android.library")
apply(plugin = "kotlin-android")
apply(plugin = "com.lagradost.cloudstream3.gradle")

// Thay vì dùng biến pkg, hãy cấu hình trực tiếp trong block cloudstream
configure<CloudstreamExtension> {
    // Lấy thông tin từ gradle.properties tự động
    setDisplayName(project.findProperty("moduleName") as String? ?: "Yanhh3D")
    setPackageName(project.findProperty("moduleClassName") as String? ?: "com.yourname.Yanhh3DProvider")
    setDescription(project.findProperty("description") as String? ?: "")
}

dependencies {
    val cloudstreamVersion = "latest-release" // Hoặc phiên bản cụ thể
    compileOnly("com.github.recloudstream:cloudstream:master-SNAPSHOT")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.20")
}
