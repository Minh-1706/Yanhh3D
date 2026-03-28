import com.lagradost.cloudstream3.gradle.CloudstreamExtension

buildscript {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io(https://jitpack.io)") }
    }
    dependencies {
        classpath("com.github.recloudstream:gradle:master-SNAPSHOT")
    }
}

apply(plugin = "com.android.library")
apply(plugin = "kotlin-android")
apply(plugin = "com.lagradost.cloudstream3.gradle")

configure<CloudstreamExtension> {
    setDisplayName(project.findProperty("moduleName") as String? ?: "Yanhh3D")
    setPackageName(project.findProperty("moduleClassName") as String? ?: "com.yourname.Yanhh3DProvider")
    setDescription(project.findProperty("description") as String? ?: "Cloudstream Provider")
}

dependencies {
    compileOnly("com.github.recloudstream:cloudstream:master-SNAPSHOT")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.20")
}
