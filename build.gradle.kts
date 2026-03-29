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

// Sử dụng trực tiếp block cloudstream thay vì extensions.configure
// Điều này giúp trình biên dịch Gradle nhận diện hàm dễ hơn
configure<CloudstreamExtension> {
    setDisplayName(project.findProperty("moduleName")?.toString() ?: "Yanhh3D")
    setPackageName(project.findProperty("moduleClassName")?.toString() ?: "com.yourname.Yanhh3DProvider")
    setDescription(project.findProperty("description")?.toString() ?: "Cloudstream Provider")
}

dependencies {
    val cloudstreamVersion = "master-SNAPSHOT"
    compileOnly("com.github.recloudstream:cloudstream:$cloudstreamVersion")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.20")
}
