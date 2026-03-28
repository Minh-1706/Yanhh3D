import com.lagradost.cloudstream3.gradle.CloudstreamExtension

apply(plugin = "com.android.library")
apply(plugin = "kotlin-android")
apply(plugin = "com.lagradost.cloudstream3.gradle")

configure<CloudstreamExtension> {
    name = "Yanhh3D"
    pkg = "com.lagradost"
    mainClass = "Yanhh3DProvider"
}
