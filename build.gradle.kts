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

// Sử dụng hàm set() thay vì dấu bằng để tránh lỗi "Val cannot be reassigned"
configure<CloudstreamExtension> {
    setDisplayName(project.findProperty("moduleName")?.toString() ?: "Yanhh3D")
    setPackageName(project.findProperty("moduleClassName")?.toString() ?: "com.yourname.Yanhh3DProvider")
    setDescription(project.findProperty("description")?.toString() ?: "Cloudstream Provider")
}

dependencies {
    // Sử dụng chuỗi trực tiếp để Gradle không bị nhầm lẫn về kiểu dữ liệu
    add("compileOnly", "com.github.recloudstream:cloudstream:master-SNAPSHOT")
    add("implementation", "org.jetbrains.kotlin:kotlin-stdlib:1.9.20")
}
