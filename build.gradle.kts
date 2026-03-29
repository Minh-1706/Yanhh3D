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

// Sử dụng block configure trực tiếp với tham số để đảm bảo nhận diện đúng hàm
configure<CloudstreamExtension> {
    this.displayName = project.findProperty("moduleName")?.toString() ?: "Yanhh3D"
    this.packageName = project.findProperty("moduleClassName")?.toString() ?: "com.yourname.Yanhh3DProvider"
    this.description = project.findProperty("description")?.toString() ?: "Cloudstream Provider"
}

dependencies {
    // Sử dụng add để ép kiểu dependency cho Gradle 8.x
    add("compileOnly", "com.github.recloudstream:cloudstream:master-SNAPSHOT")
    add("implementation", "org.jetbrains.kotlin:kotlin-stdlib:1.9.20")
}
